一个对象的初始化过程：
Car c = new Car（）
1，jvm虚拟机读取指定路径下的Car.class文件并加载到内存，并会先加载到Car的父类（如果有父类的情况下）
2，在堆内存中开辟地址，分配空间
3，在对象空间中，对对象的属性进行默认初始化
4，调用对应的构造函数进行初始化
5，在构造函数中会先调用父类中的构造函数进行初始化
6，父类初始化完毕后，在对子类进行显示初始化
7，初始化完毕后将地址值赋值给引用变量