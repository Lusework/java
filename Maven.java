Maven
{
   1:Maven简介： 是一个项目管理工具。它负责管理项目开发过程中的几乎所有的东西.
   
    构建:
    maven支持许多种的应用程序类型，对于每一种支持的应用程序类型都定义好了一组构建规则和工具集。
    
    输出物管理:
    maven可以管理项目构建的产物，并将其加入到用户库中。这个功能可以用于项目组和其他部门之间的交付行为
    
    依赖关系:
    aven对依赖关系的特性进行细致的分析和划分，避免开发过程中的依赖混乱和相互污染行为
    
    文档和构建结果:
    maven的site命令支持各种文档信息的发布，包括构建过程的各种输出，javadoc，产品文档等
    
    
    项目关系:
    一个大型的项目通常有几个小项目或者模块组成，用maven可以很方便地管理
    
    移植性管理：
    maven可以针对不同的开发场景，输出不同种类的输出结果
    
    
    
    2:Maven的生命周期：
    
    maven把项目的构建划分为不同的生命周期(lifecycle)。粗略一点的话，它这个过程(phase)包括：编译、测试、打包、集成测试、验证、部署。maven中所有的执行动作(goal)都需要指明自己在这个过程中的执行位置，然后maven执行的时候，就依照过程的发展依次调用这些goal进行各种处理。

    这个也是maven的一个基本调度机制。一般来说，位置稍后的过程都会依赖于之前的过程。当然，maven同样提供了配置文件，可以依照用户要求，跳过某些阶段。
    
    
    3：Maven的标准工程结构
    
    Maven的标准工程结构如下：

|-- pom.xml(maven的核心配置文件)

|-- src

|-- main

|   `-- java(java源代码目录)

|   `-- resources(资源文件目录)

|-- test

        `-- java(单元测试代码目录)

|-- target(输出目录，所有的输出物都存放在这个目录下)

    |--classes(编译后的class文件存放处)

            
}

Maven的下载与配置：
{
    
    
        官网下载地址：http://maven.apache.org/download.cgi
    
        配置准备工作：
        （1）jdk1.5以上java开发环境
        （2）Eclipse IDE 
        （3）Maven3.5.3
        
        
        开始配置：
        1：将下载的maven文件解压
        2：设置环境变量：在命令行窗口下输入set path=(maven安装位置);%path%
       前提是之前已配置好jdk的环境变量。
       
      验证配置是否完成：

        打开命令提示符：打开命令提示符（开始---运行---cmd---输入：mvn -version）,检查我们的java环境和maven环境是否有误
        配置正确就会显示Maven的版本信息，windows版本信息，等其他相关信息。
        
        
      
    

    
        
} 

修改Maven仓库位置(仓库用于存放需要的jar包)
{
    我的仓库路径：G:\lmc\xiazai\maven3.5.3\maven\repo 这个路径是我自己创建，你可以将路径创建在任何位置。

    我们打开…\apache-maven-3.0.3\conf\目录下的setting.xml文件，设置成我们创建的仓库路径 
    
    具体请看下面我的配置：
    
    <!-- localRepository
   | The path to the local repository maven will use to store artifacts.
   |
   | Default: ${user.home}/.m2/repository
                      //这就是仓库位置  
    <localRepository>G:\lmc\xiazai\maven3.5.3\maven\repo</localRepository>
    -->
    
}
