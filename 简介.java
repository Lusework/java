1:什么是注释（Annotation）：（Anntation是一个接口）
    注解相当于一种标记，在程序中加了注解就等于为程序打上了某种标记。
    程序可以利用java的反射机制来了解你的类及各种元素上有无何种标记，针对不同的标记，
    就去做相应的事件。v
    
    Annotation就是代码里的特殊标识，这些标记可以在编译,类加载，运行时被读取，并执行相应的处理，通过使用Annotation程序员可以在不改变原有
    逻辑的情况下，在源文件中嵌入一些补充信息。

2：Annotation使用范围：
      
    Annoation可以像修饰符一样被使用，可以用来修饰包，类，构造器 ，方法，成员变量，参数，局部变量的声明。这些信息保存在Annoation中的"name=value"中;Annotation 能被用来为程序数据（类，方法，成员变量等）设置元数据。
    
 
3：基本的Annotation    
(1)使用Annotation时要在前面增加@符号，并把该Annotation当成一个修饰符来用，用于修饰它支持的程序元素。

（2）5个基本的Annotation
    @Override: 用来指定方法覆盖，可以强制一个子类必须覆盖父类的方法。（只能修饰方法）
    
    @Deprecated： 用于表示某个程序元素（类，方法等）已过时
    
    @SuppressWarning：抑制编译器警告。
    
    @Safe Varargs：当把一个不带泛型的对象赋给一个带泛型的变量时，就会发生堆污染，
                    java使用@Safe Varargs来抑制这种警告。
                    
                    
    @Functionallinterface：如果接口中只有一个抽象方法，该接口就是函数式接口，该注释就是用来指定某个接口
                            必须是函数式接口。（只能修饰接口）
    
    
4：JDK的元Annotation    
        包含成员变量的Annotation。因为它们可以接受更多的元数据，因此被称为元数据Annotation。 成员以无参数的方法的形式被声明，其方法名和返回值定义了该成员变量的名字和类型。
        
（1）@Retention 
        只能用于修饰Annotation定义，用于指定被修饰的Annotation可以被保留多长时间，
        @Retention包含一个RetentionPolicy类型的value变量，所以使用@Retention时必须
        为该类的value赋值
    
    
 (2) @Target
    只能修饰Annotation定义， 用于被指定的Annotation能用于修饰那些程序单元，@
    Target也包含一个名为value的成员变量。
    
（3） @Documented
        用于指定被该元Annotation修饰的Annotation类将被javadoc工具提取成文档，
        如果定义Annotation时使用了@Docunented修饰，则所用使用该Annotation修饰
        的程序元素的API文档中将会包含该Annotation说明。
        
（4）@inherited
        指定被它修饰的Annotation将具有继承性，如果某个类使用了@xxx注解，
        则其子类自动被@xxx修饰。
        
        
 
 
 
 5：自定义Annotation
    （1）定义Annotation类型使用@interface关键字，定义一个新的Annotation类型与定义一个接口非常像
    
        public @interface Test
        {
            
        }
            该Annotation通常可用于修饰程序中的类，方法，变量，接口等定义。通常把自定义的Annotation放在
            所有修饰符前面并且单独占一行。程序例子：
            
         @Test
         public class MyCalss
         {
             
         }
            

          Annotation还可以带成员变量，Annotation的成员变量在Annotation中以无参的方法形式来声明，
          其方法的返回值定义了该成员变量的名字和类型，下面代码示例了一个有成员变量得Annotation：
          
          public @interface MyTag
          {
              //定义带两个成员变量的Annotation
              //Annotation中的成员变量以方法的形式来定义
              String name();
              int age();
          }
          
          上面代码定义了 TestAnnotation 这个注解中拥有 idage和name 两个属性。在使用的时候，我们应该给它们进行赋值。

           赋值的方式是在注解的括号内以 value=”” 形式，多个属性之前用 ，隔开。（赋值的类型只能是java提供的8 种
           基本数据类型外加 类、接口、注解及它们的数组。）
           
           //对上面程序中注解的属性赋值。
           
           @MyTag（id = 3，age = 5）
           public class Test{
              
           }
           
           注解中的属性可以有默认值，默认值需要使用default指定，如：
           
           public @interface MyAnnotation
           {
                public int id() default 2;
                 public int name() default 3;
                
               
           }
           
          Annotation分为两类：
          
            标记Annotation:没有定义成员变量的Annotation类型称为标记，
            
            元数据Annotation：包含成员变量的Annotation，应为他们可以接受更多的元数据，所以也被称为元数据Anntation。
           
          

   （2）提取Anotation信息
                1：使用Annotation修饰了类、方法、成员变量之后，这些Annotation不会自己生效，必须由开发者提供相应的工具来
                提取并处理Annotation信息。
                
                2：只有当定义Annotation时使用了@Retention修饰，该Annotation才会在运行时可见，JVM才会在装载*.class
                文件时读取保存在class文件中的Annotation。    
                