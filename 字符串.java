字符串指的是字符序列，java字符串分两种：
1:字符串常量(包括直接字符串常量和String类的对象)
2:字符串变量（指的值StringBuffer类的对象）

String类型：
{
    创建String字符串最简单的方式是使用字符串文本，
    
    字符串的创建方式：
    1：直接为字符串变量赋值：
    例如：
    String str = "hello"；
    2：使用new关键字来声明字符串：
    例如：
    String str1 = new String（"hello"）；
    3：使用字符数组来声明字符串：
    例如：
    char str[] = {'h','e','l','l','o'}；
    4:使用字符串数组的方式声明：
    例如：
    String str[] = {"hello","java"};
    
}
String类型字符串的常用方法：
{
    1:length方法：（该方法用于计算字符串的长度，）
    例如：
    String str = "javac"；//定义一个字符串
    System.out.println(str.length());//输出的结果为5
    
    注意：空字符串和null字符串的长度均为0
    
        2：getChars方法：该方法用于将字符串中的字符复制到字符数组中。
    例如：
    vooid getChars（int srcBegin,intSrcEnd,char[]dst,int dstBegin）;
    其中，srcBegin为原始字符串的起点，srcEnd为原始字符串的终止点，dst为目的数组
    dstBegin为目的数组的起点；
    
    3：字符串中大小写的转换：
      (1)public String toLowerCase()//返回当前字符串中所有字符转换为小写后的新串；
       (2)public String  toUpperCase（）//返回当前字符串中所有字符转换为大写后的新串
        例子：
        String str = "HeLLoJava";
        String str1 = str.toLowerCase();//返回小写hellojava
        String str2 = str.toUpperCase();//返回大写HELLOJAVA
    4:charAt（int index）求字符串中指定位置的字符串
        例子：
        String str = "javatest";
        char ch = str.charAt(5);//输出e
        
    5：concat （该方法用于将调用方法的字符串与指定字符串连接，并返回新的字符串） 
        例如：
       e = a.concat(b);//将字符串a和b先连接，在将其赋值给e
}

2{
    
    String,StringBuffer,StringBuilder的区别：
    
    (1)String类是不可变类，一旦一个String对像创建后，包含在这个对象中的字符序是不可变的
        直到这个对象被销毁。
        
   （2）StringBuffer对象则代表一个字符序列可变的字符串，当一个StringBuffer被创建后，通过
       StringBuffer提供的append（），insert（），reverse（）SetCharAt（），setLength（）
       方法可以改变这个字符串对象的字符序列，一旦获得最终的字符串，就可以通过toString（）
       方法将其转换为一个String对象。
       
   （3）StringBuilder类也代表字符串对象，与StringBuffer相同，不同的是：
        SringBuffer是线程安全的，而StringBuilder没有实现线程安全，所以
        性能略高；如果需要创建一个可变的字符串对象，优先使用StringBuilder
        类
}


