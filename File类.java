
file的简介:file是java.io包,下与平台无关的文件和目录;在程序中操作文件和目录都可以用File类完成。File不能访问文件内容本身，如果需要访问数据本身，就需要用输入/输出流。

File类的相关方法：
{
    File类可以使用文件路径字符串来创建File实例，该文件路径的字符串可以是绝对路径，也可以是相对路径，
    
    File提供的操作文件和目录的方法：
    
    1：访问文件名相关方法：
    
    String getName():返回File对象所表示的文件名或路径名。
    String getPath():返回File对象所对应的路径名。
    File getAbsoultFile():返回File的绝对路径。
    String getParent():返回File所对应目录的父目录名。
    boolean renameTo(File newName):重命名File对应的目录或文件，重命名成功返回true，失败返回false。
    
    2：文件检测相关方法：
    boolean exists():判断File对应的文件或目录是否存在。
    boolean canWrite():判断File对应的文件或目录是否可写。
    boolean canRead()：判断File对应的文件或目录是否可读。
    boolean isFile（）：判断File对象所对应的是否是文件而不是目录。
    boolean isDirectory():判断·Fille对象对应的是目录而不是文件。
    boolean isAbsoult():判断File对象所对应的文件或目录是否是绝对路径。
    在UNIX/Linux/BSD系统上，如果路径开头是"/"，就表明File对象对应一个绝对路径，
    在Windows系统上，如果路径开头是盘符，则说明是一个绝对路径
    
    3：获取常规文件信息：
    long lastModified():返回文件的最后修改时间。
    long length():返回文件内容的长度。
    
    4：文件操作相关方法：
      boolean createFile():当此File文件不存在时，该方法将创建一个该File对象所指的新文件，
       boolean deleteFile():删出File对应的文件或路径》
       
     5：目录操作相关方法：
        boolean mkdir():试图创建一个File对象对应的目录，创建成功返回true、
        失败返回false
        String[] list():列出File对象的所有文件名和路径名，返回String数组。
        File[] listFiles():列出File对象的所有子文件和路径，返回File数组。
        
        注意：windows的路径分隔符使用（\）,而java程序中的反斜线表示转义字符，所以在windows的路径下包括反斜线，则应该使用（\\）表示，或者使用/表示。
        
        
    }
    
 文件过滤器：
 