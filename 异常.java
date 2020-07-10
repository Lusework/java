1:异常的概念：
{
    （1）异常是java在运行期出现的错误的错误，如：空指针，数组越界等
    
    （2）异常处理已经成为衡量一门语言是否成熟的标准之一，增加了异常
         处理机制的程序有更好的容错性。
    
        
    （3）java将异常分为两种，Checked异常和Runtime异常。
    
    （4）java的异常机制主要依赖于try、catch、finally、throws和throw
          五个关键字。
          
    try块： 其中try块后跟一个花括号括起来的代码块，简称try 块，里面放置的是可能引发异常的代码。
    
    catch：catch后对应异常类型和一个代码块，用于表明该catch块用于处理这种异常类型的代码块，
            多个catch块还可跟一个finally块，finally块用于回收在try块里打开的物理资源，异常机制
            会保证finally块总被执行。
            
            
    throws：throws主要用于在方法签名中使用，用于声明该方法可能抛出的异常。

    throw：throw用于抛出实际的异常，throw可以单独作为一个语句，抛出一个具体的异常对象。    
}



2：异常的处理机制：
{
 (1)使用try...catch捕获异常；（异常捕获时，一定要记住先捕获小异常，在捕获大异常）
    将程序的业务实现代码放在try中，所有异常处理逻辑放在catch中处理。
        try{
            //业务实现代码
        }
        catch（Exception e）
        {
           输入不合法
        }
        
       如果执行tyr块的业务逻辑时出现异常，系统自动生成一个异常对象，该异常被提交给java运行时环境，
        这个过程称为抛出（throw）异常。
        
       当java运行时环境收到异常对象时，会寻找能处理该异常对象的catch块，如果找到合适的catch块，则
       把该异常对象交给catch块处理，这个过程称为捕获（catch）异常；如果java运行时环境找不到捕获异
       常的catch块，则运行时环境终止，java程序也将退出。
     
        
  (2)异常类的继承体系：
    java把所有非正常的情况分为两种：异常（Exception）和错误（Error）他们都继承Throwable。
    Error错误，一般是指与虚拟机相关的问题，如系统崩溃、虚拟机错误、动态链接失败等，这些
    错误无法恢复和捕获。
    
    
    常见的异常；
        IndexOutOfBoundsException:如果运行该程序时输入的参数不够，将会引发数组越界异常。
        
        NumberFormatException：如果运行时输入的参数不是数字，而是字母，将发生数字格式异常。
        
        ArithmeticException：如果运行时，输入的第二个参数是0，将发生除以0异常。
        
        NullPointerException：当试图调用一个null对象的实例方法或实例变量时，会发生空指针异常。
        
        
        
            
}

3：java7提供的多异常捕获：
{
    在java7之前，每个catch块只能捕获一种类型的异常，java7开始，一个catch块可以捕获多种类型的异常
    
    使用一个catch块捕获多个异常时需要注意下面两点：
    (1)捕获多种类型异常时，多种异常类型之间使用（|）隔开。
    
    (2)捕获多种类型异常时，异常变量有隐式的final修饰，因此程序不能对异常变量赋值。
}


4：访问异常信息：
{
    如果需要在catch块中访问异常信息的相关信息，则可以通过catch块后的异常形参来获得，
    
    获取异常信息的常用方法：
     (1)getMessage():返回该异常的详细描述字符串。
     
     (2)printStackTrace():将该异常的跟踪栈信息输出到标准错误输出。
     
     (3)printStackTrace（PrintStream s）：将该异常的跟踪栈信息输出到指定输出流。
     
     (4)getStackTrace():返回该异常的跟踪栈信息。 
}



5：使用finally回收资源：
{
    有些时候，程序在try块中打开了一些物理资源（数据库连接、网络连接），这些物理资源
    都必须显示回收。
    
    为了保证一定能回收try块中打开的物理资源，异常处理机制提供了finally块，不管try块中是否出现异常
    也不管哪个catch块执行，最后finally块总会执行。（如果在异常处理代码中使用System.exit(1)语句）
    finally将永远不会执行。
    
    java中只有try块是必须的，如果没有try块，就没有后面的catch块和finally块，但是catch块和finally块
    至少出现一个，也可以同时出现，捕获父类异常的catch块必须位于捕获子类异常的后面，多个catch块必须
    位于try块后，finally块必须位于所有的catch块之后。
}


6：java7的自动关闭资源的try语句：
{
    JAVA7增强了try语句的功能，允许在try关键字后面紧跟一对圆括号，圆括号可以申明、初始化一个或多个资源，
    资源指的是那些必须在程序结束时必须显示关闭的资源（如数据库连接、网络连接、打开一个文件等）；
    为了try语句能正常关闭资源，这些资源必须实现AutoCloseable或Closeable接口，实现这两个接口就必须
    实现close（）方法。
    
}

7：Checked异常和Runtime异常
{
    java的异常被分为两类：Ckecked异常和Runtime异常。所有的RuntimeException类及其子类的实例被称为Runtime异常
    不是RuntimeException类及其子类的异常实例被称为Checked异常。
    
    Checked异常体现了java的设计哲学，没有完善错误处理的代码根本不会被执行；java认为Checked异常都是可以被处理
    的异常，所以java程序必须显示处理Checked异常，否则程序无法编译。
    
    Ckecked异常处理的方法有以下两种：
    （1）当前方法明确知道如何处理该异常，程序应该使用try....catch块来捕获该异常，然后在对应的catch块中修复该
    异常。
    
    （2）当前方法不知道该如何处理这种异常，应该在定义方法时声明抛出异常。
    
}


8：使用throws声明抛出异常
{
    当前方法不知道如何处理这种类型的异常，该异常应该由上一级调用者处理，如果main方法也不知道怎么处理该异常，
    也可以用throws声明抛出异常，将该异常交给JVM处理。JVM对异常的处理方式是，打印异常的跟踪栈信息，并终止程
    序运行。
    
    throwa申明抛出只能在方法签名中使用，可以声明抛出多个异常类，异常类之间使用逗号隔开。
    
    使用throws抛出异常时：子类方法声明抛出的异常类型应该是父类抛出的异常类型的子类或相等。
    子类方法声明抛出的异常不允许比父类方法声明抛出的异常多。
    
}


9：使用throw抛出异常
{
    当程序出现错误时，系统会自动抛出异常；java也允许程序自行抛出异常，自行抛出异常使用throw语句来完成
    
    如果程序中的数据、执行与既定的业务需求不符，这就是一种异常。由于与系统需求不符产生的异常，必须由
    程序员来决定抛出，系统无法抛出这种异常。抛出异常使用throw，throw语句抛出的不是异常类。而是异常实例
    ，并且每次只能抛出一个异常实例。
    
    如果throw语句抛出的是Checked异常，则该throw语句要么处于try块中，显示捕获该异常，要么放在一个带throws
    声明抛出的方法中，即把该异常交给该方法的调用者处理；如果throw语句抛出的异常是Runtime异常，则该语句无
    需放在try块中，也无需放在throws声明抛出的方法中；程序既可以使用try...catch来捕获并处理该异常，也可以
    把异常交给方法调用者处理。
    
    
}


10：自定义异常类
{
    用户自定义异常类都应该继承Exception基类，如果需要自定义Runtime异常，则应该继承RuntimeException异常，
    定义异常时，通常需要定义两个构造器，一个是无参数的构造器；另一个是带一个字符串参数的构造器，这个字
    符串将作为该异常对象的描述信息。
}


11：catch和throw同时使用
{   异常处理的两种方式
    (1)在出现异常的方法类捕获并处理异常，该方法的调用者将不能再次捕获该异常
   （2）在方法签名中声明抛出异常，并将异常完全交给方法调用者处理。
   
   
   企业级应用对异常的处理通常分为两个部分：
   （1）应用后台需要日志来记录异常发生的详细信息，
  
}


12：异常链
{
    把捕获一个异常然后接着抛出另一个异常，并把原始异常信息保存下来是一种典型的链式处理
    （23中设计模式之一：“职责模式”），也被称为“异常链”；
    当业务逻辑层访问持久层出现SQLException异常时，程序不应该把底层的SQLException传到用户
    界面：
    
    对于正常用户而言，SQLException异常对于他们使用系统没有任何帮助。
    对于恶意用户而言，将SQLException暴露出来非常不安全。
}

java异常提供了处理运行期错误的机制，java异常是面向对象的，当异常发生时，
自动产生异常对象，再用catch方法来捕获

异常的分类：
Throwable； 所有异常的父类
Error；JVM虚拟机异常，用户无法自行处理
Exception；java异常类的父类
RunTimeExceoion；java运行时异常


异常注意事项：
try，catch，finally三个语句块不能单独使用，只能组合使用，catch可以有一个或多个，
finally只能有一个


try，catch，finally三个语句块的作用域为代码块内部，不能相互访问，如果要在三个块中都可以访问
就需要将方法定义在这些块的外面


多个catch块的时候，程序只会匹配其中一个并执行语句块中的代码，并且匹配顺序是从
上到下

异常的处理：
捕获异常catch：
可以使用try catch finally来捕获异常，当异常发生时，程序终止当前执行路径
跳转到catch块中执行，catch中的异常对象由系统自动产生，无论是否有异常
finally中的块都执行

抛出异常：throws
在方法申明处使用throws声明可能出现的异常，
在方法中使用throws抛出异常对象

自定义异常：
定义一个类并继承Exception
使用throw在方法体中抛出异常
使用throws在方法声明出抛出异常



