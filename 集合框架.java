集合框架：
{
    集合框架也叫容器，是装载一组对象的容器。
    
    java集合可以分为三种：
       1： set集合类似一个罐子，把一个对象添加到set集合时，set集合无法记住这个元素的顺序
            所以set集合中的元素无法重复；
       2： List集合非常像一个数组，它可以记住每次添加元素的
            顺序、且List的长度可变。
       3： Map也像一个罐子，只是它里面的数据有key——value键值对组
            成。
        
        访问方式不同：
        
        如果返回List集合中的元素，可以直接根据元素的索引来访问；
        访问Map集合中的元素，可以根据每项元素的key来访问其value；
        访问Set集合中的元素，只能根据元素本身来访问。
        
        

 {集合中常见接口；
Collection---一组允许重复的对象；collection是List、Set、Queue接口的父接口
collection中常见的方法：

boolean add（Object o）：添加元素
boolean addAll（Collection c）：把c集合中的所的元素添加到指定位置
void clear（）：清楚集合中的所用元素，将集合长度变为0.

2：使用iterator接口对集合进行遍历：
    iterator定义了以下四种方法：
    
    boolean hasNext（）：如果被迭代的集合元素没遍历完，返回true。
    Object next（）：返回集合中的下一个元素。
    void remove（）：删除集合里上一次next方法返回的元素。
    void forEachReminning（Consumer action）：java8新增的方法，该方法可使用Lambda表达式来遍历集合元素。    


 }

List-----继承collection，允许重复，与元素以元素安插次序来放置元素，不会重新排列
Set----继承collection，但不允许重复，使用自己的一个排列机制
Map-----是一组成对的键值对象，即所持有的是Key-value对，
Map不能有重复的Key,可以有重复的value

集合的常用操作：
1，如何添加数据
2，如何获得数据
3，如何删除数据
4；如何遍历数据


List接口及其实现类
list接口实现类
{
  1：  ArrayList----封装一个动态再分配的obiect【】数组

   
    
        list集合代表一个元素有序，可重复的集合，集合中每个元素都有其对应的索引，
        通过其索引可以访问到元素本身，List集合默认按照添加元素的顺序设置元素的
        索引。
    
        
        list可以使用for循环来遍历集合元素，List判断两个对象相等的标准是只要通过
        equals（）方法比较返回true即可。每次冲List删除对象时，总是删除第一个对象。
        
        
   2：ArrayList和Vector实现类
        
      （1）相同点：  ArrayList和Vector对象使用initialCapacity参数来设置该数组的长度，当向ArrayList和Vector
        中添加元素超出了该数组的长度后，他们的initialCapacity会自动增长。
        
      （2）不同点：    ArrayList和Vector的显著区别是:ArrayList是线程不安全的，当多个程序同时访问同一个ArrayList
        时，如果有超过一个线程修改了ArrayList集合，则程序必须手动保证该集合的同步性；
        
        Vector集合是线程安全的，无需程序保证该集合的同步性；因为线程安全，所以该集合性能比ArrayList性能低。
        
        
        
        
        
        
      3：LinkedList---添加了一些处理列表两端元素的方法
        LinkedList类是List接口的实现类，可以根据索引来访问集合中的元素，
        LinkedList实现了Deque接口，可以被当成双队列来使用，
        因此，即可以当作“栈”使用，也可以当队列使用。
        
        
        LinkedList与ArrayList、ArrayDeque的实现机制完全不同，ArrayList、ArrayDeque
        内部以数组形式保存集合中的元素，因此随机访问集合元素时有较好的性能；而
        LinkedList内部以链表形式储存集合中的元素，因此随机访问元素时性能比较差，
        但在插入、删除性能比较出色。
        
        
        
        
       

        
        
        
        
        
        
     5：   ：各种线性表性能分析
        
        （1）如果需要遍历List集合中的元素，对于ArrayList、Vector集合，应该使用随机访问方法（get）
        来遍历集合元素，这样性能更好；对于LinkedList集合，就应该采用迭代器（itarator）来
        遍历集合元素。
        
        （2）如果需要经常插入、删除操作来改变包含大量数据的List集合中的大小，可考虑使用LinkedList
            。使用ArrayList、Vector集合可能需要经常重新分配内部数据的大小，效果比较差。
            
                        
         （3）如果多个线程需要同时访问List集合中的元素，可使用Collections将集合包装成线程安全的集合。   
        
   
        
    
}




Set接口及其实现类
{
    继承collection，但不允许重复，使用自己内部的排列机制，Set接口没有
    引入新的方法。所以Set就是collection，只不过行为不同

  1：  HashSet：

    创建要添加的HashSet的类时，不要忘了覆盖hashCode（）和equals（）
    当两个对象的equals（）方法放回true时，这两个对象的hashCode（）应该相等
    HashSet按照Hash算法来存储集合中的元素，因此具有很好的存取和查找功能。
  
   【1】:HashSet的特点：
   
    （1）不能保证元素的排列顺序，顺序可能与添加顺序不同，顺序也可能发生改变。
    （2）HashSet不是同步的，如果多个线程同时访问一个HashSet，如果有两个或两个
        以上的线程同时修改了HashSet集合时，则必须使用代码保证同步。
    （3）集合元素值可以是空。
    
    
    
   【2】： 重写HashCode（）方法的基本规则：
   
    （1）在程序运行过程中，同一个对象多次调用hashCode（）方法应该返回相同的值。
    （2）当两个对象通过equals（）方法比较返回true时，这两个对象的hashCode（）
        方法应该返回相同的值。
    （3） 对象中用作equals标准的属性，都应该用来计算hashCode值



    LikedHashSet类：
    
    LinkedHashSet集合也是根据hashCode值来决定元素得存放位置，同时它使用链表维护元素的次序，
    这样使得元素看起来是以插入的顺序保存的，LinkedHashSet需要维护元素的插入位置，所以性能
    低于HashSet；但在迭代访问set中的元素有很好的性能，因为它使用链表维护元素的次序
    
    输出LikedHashSet集合中的元素时，元素的顺序总与添加顺序一致。
    
    
    
    TreeSet类：
    
    TreeSet-----是实现了SorteSet接口的唯一实现，TreeSet
    可以确保集合元素处于排序状态
    TreeSet并不是根据元素的插入顺序进行排序的，而是根据元素
    实际值大小进行排序的。

     TreeSet常用方法：
      1：Comparator comparator（）：如果TreeSet采用了定制排序，则该方法返回定制排序所使用的
       Comparator，如果采用了自然排序就返回null。
        
       2：Object first（）：返回集合中第一个元素，
       
       3：Object last（）：返回集合中最后一个元素。
       
       TreeSet常用的两种排序方式：
       
       1：TreeSet自然排序：
       
       TreeSet会调用集合中的compareTo（Object obj）方法来比较元素间的大小关系，
       然后将集合元素按照升序排列，这中就是自然排序。
       
       如果将一个对象添加到TreeSet时，则该对象的类必须实现Comparable接口，否则会引发异常。
       
       TreeSet添加的应该是同一类的对象，否则会引发ClassCastException异常
       
       当需要把一个对象添加到TreeSet中，重写该对象对应类的equals（）方法时，应保证该方法与compare
       To（Object obj）方法有一致的结果，规则是：
       （1）：如果两个对象通过equals（）方法返回true时，这两个对象通过CompareTo（Object obj）
       方法比较应返回0。
       
       （2）如果两个对象通过CompareTo（Object obj）方法比较返回0时，但他们通过equals（）方法
       比较返回false将更加麻烦，因为两个对象通过CompareTo（Object obj）方法比较相等，TreeSet
       不会让第二个元素添加进去，这就会与set集合的规则产生冲突。
       
       
      2：TreeSet定制排序 ：
      如果需要定制排序，则可以通过Comparator接口帮助，该接口里包含一个int compare（T 01，T02）
      方法，用于比较01与02的大小：如果方法返回正整数，表明01大于02；如果返回0代表01等于02；
      如果返回负数代表01小于02.
      
       
       
    注意：为了让程序更加健壮，推荐不要修改放入HashSet和TreeSet集合中的元素。
    
    
    
    
    EnumSet类：
                （1）EnumSet是一个专门为枚举类设计的集合类，EnumSet中的所有元素都必须是
                    指定枚举类的枚举值，该枚举类型在创建EnumSet时显示或隐式指定。EnumSet
                    的集合元素也是有序的,EnumSet以枚举值在Enum类内的定义顺序来决定集合元素
                    的顺序。
                    
                    
                （2）EnumSet在内部以位向量的方式存储，这种存储形式非常紧凑、高效，因此
                    EnumSet对象占用内存小，而且运行效率高。
                    
                    
                （3）EnumSet集合不允许添加null元素，如果试图插入null元素，EnumSet将会
                    抛出NullPointException异常。如果只是想判断EnumSet是否包含null元素
                    或试图删除null元素都不会抛出异常，只是删除操作将返回false，因为
                    没有任何null元素被删除。
                    
                    
                    
                  （4）当复制Collection集合里的元素来创建EnumSet集合时，必须保证Collection
                  集合中的所有元素都是同一个枚举类的枚举值。
                    
                    
    
    
    
    
    
    
    总结：
        各set实现类的性能分析：
        
       1： HsshSet和TreeSet是set的两个典型实现，HashSet的性能总是比TreeSet好，（特别是
        常用的添加、查询元素等操作），因为TreeSet需要使用红黑树算法来维护元素的次序
        只有当需要一个保持排序的Set时，才应该使用TreeSet，否则都使用HashSet。
        
        
        2：HashSet还有一个子类：LinkdHashSet，对于普通的插入、删除操作，LinkHashSet
        比HashSet慢，这是由维护链表造成系统额外开销，但是遍历LinkHashSet中的元素比
        较快。
        
        
        3：EnumSet是所有Set实现类中性能最好的，但他只能保存同一个枚举类的枚举值，
        作为集合元素。
        
        
        4：Set的三个实现类HashSet、TreeSet、EnumSet都是线程不安全的，如果有多个线程同
        时访问一个Set集合，并且有超过一个线程修改了Set集合，则必须手动保证Set集合的同步性。
        
        
       
        
    
       
       
       
} 


{
    Queue集合：
    1：简介：queue用于模拟队列这种数据结构，通常指“先进先出”（FIFO）的容器    
            队列的头部保存在队列中存放时间最长的元素，队列的队尾保存在队列
            中的时间最短；新元素插入（offer）到队列的尾部，访问元素（poll）
            操作会返回队列头部的元素，通常队列不允许随机访问队列中的元素。
            
           常见方法：
                    add（Object e）将指定元素添加到队列的尾部
                    element（）：获取队列的头部元素，但是不删除该元素
                    peek（）：获取队列的头部元素，但是不删除该元素，如果队列为空就返null。
                    poll（）：获取队列头部的元素，并删除该元素。如果队列为空，则返回null
                    
                    
       2：PriorityQueue实现类

              （1）PriorityQueue实现类是一个比佳品标准的队列实现类，是因为PriorityQueue保存队列
              元素的顺序并不是按加入队列的顺序，而是按队列元素的大小进行重新排序，因此，
              调用peek（）或则poll（）方法取数元素时，总是取出队列中最小的元素。
              
              
              （2）PriorityQueue有两种方式排序：
              
              自然排序：采用自然顺序的PriorityQueue集合中的元素必须实现了Comparable接口，而求应该是同一个
                        类的多个实例，否者可能导致ClassCastException异常。
                        
                        
               定制排序：创建一个PriorityQueue队列时，传入一个Comparator对象，该对象负责对队列中所有的元素
                         进行排序 ，采用定制排序时不需要队列元素实现Comparable。

               
              
              
              
       3：Deque接口与ArrayDeque实现类：
            Deque是Quecu接口的子接口，他代表一个双端队列，Deque接口里定义了一些双端队列
            的方法，这些方法允许两端来操作队列的元素。
    

    
}  

    

}


Map-----是一组成对的键值对象，即所持有的是Key-value对，向map中添加数据是put，其他是add
Map中不能有重复的key，拥有自己内部排列机制.
{
   1:Map简介
    Map用于保存具有映射关系的数据，因此Map集合中保存着两组数据，一组用于存放Map里面的key，
    另一组用来存放Map里面的value，key和value都可以是任何引用类型的数据。Map的key不允许重复
    即同一Map对象的任何两个key通过equals方法比较总是返回false。
    
       （2）Map中的key和value之间存在单向的一对一关系，即通过指定的key，总能找到
            唯一、确定的value。
    
    
    
    2：如果将Map里面的所有key放在一起，就组成了一个Set集合（所有的key没有顺序，key与key之间不能重复）
    Map包含了一个keySet（）方法，用于返回Map里所有key组成的Set集合。
    
    如果将Map里面的value放在一起看，他们就类似与一个List，元素与元素之间可以重复，每个元素可以根据
    索引来查找，只是Map里的索引不再使用整数，而是以另一个对象做为索引，如果从Map中取出元素，就需要
    提供该元素的key索引。Map最典型的用法就是成对的添加、输出key-value键值对。可以通过Map中提供的
    方法keySet（）获取所有key组成的集合。
    
    （1）HashMap和Hashtable的相同点和不同点
        1：Hashtable是一个线程安全的实现，但是HashMap是线程不安全的实现，所以HashMap性能比Hashtable
        高，但如有多个线程同时访问一个Map对象时，使用Hashtable会更好。
        
        2：Hashtable不允许使用null作为key和value，如果试图将null值放进Hashtable中，将会引发NullPoint
        Exception异常，但HashMap可以使用null做为key或value。
        
        
        相同点：
            HashMap和Hashtable判断两个key相等的标准是：两个key通过equals（）方法比较返回true时，
            两个key的hashcode也相等。
            判断两个value相等的标准是，只要两个对象通过equals（）方法比较返回true即可。 



      （2）HashMap的子类LinkedHashMap：
                使用双向链表来维护key-vaule对的次序，该链表负责维护Map的迭代顺序，迭代顺序与
                key——value插入顺序保持一致。LinkedHashMap需要维护元素的插入顺序，所以性能低于
                HashMap的性能；但是迭代访问Map里的全部元素时将有较好的性能。
                
            
      （3）SortedMap接口和TreeMap实现类:
                TreeMap就是一个红黑树数据结构，每个key-value对即作为红黑树的一个节点，TreeMap可以保证
                所有的key-value对处于有序状态，TreeMap有两种排序方式：
                
                1：自然排序：TreeMap的所有key必须实现Comparable接口，而且所有的key应该是同一种类的对象
                否则将抛出ClassCastException异常。
                
                2：定制排序：创建TreeMap时，传入一个Comparator对象，该对象负责对TreeMap中的所有key进行排序
                采用定制排序时不要求map的key实现comparable。
                
                Set和Map的关系十分密切，java源码就是先实现了HashMap、TreeMap等集合，然后通过包装一个所有的
                value都为null的Map集合实现了Set集合类。
                
       （4）weakHashMap实现类：
                weakHashMap与HashMap的实现类基本一样，与HashMap的区别在于，HashMap的key保留了对实际对象
                的强引用，只要HashMap对象不被销毁，该HashMap的所有key所引用的对象就不会被销毁，
                weakHashMap的key只保留了对实际对象的弱引用，如果weakHashMap对象的key所引用的对象没有被
                其他强引用变量所引用，则这些key可能会被垃圾回收。
                
                
         
        （5）EnumMap实现类
        
            EnumMap是一个与枚举类一起使用的Map实现，EnumMap中的所有key都必须是单个枚举类的枚举值，
            创建EnumMap时必须显示或隐式指定它对应的枚举类。
            
            
            
        （6）各Map实现类的性能分析：
            1：    对于Map实现类来说，虽然HashMap与Hashtable的实现机制基本一致，但由于Hashtable
                是一个古老的、线程安全的集合，因此HashMap通常比Hashtable要快。
        
            2：TreeMap通常比HashMap、Hashtable要慢（尤其是在插入、删除key-value时更慢），因为
                TreeMap使用红黑树来管理key-value对。TreeMap有一个好处就是，TreeMap中的key-value
                总是处于有序状态下，无需专门进行排序操作。
                
            3：对于一般的场景应该考虑使用HashMap，因为HashMap是为快速查询设计的（底层是采用数组
            存储key-value对）；但是如果需要一个总是排好序的Map时，则应该使用TreeMap。

            4：LinkedHashMap比HashMap慢一点 ，因为需要使用链表来维护Map中key-value的添加顺序，
               Map中性能最好的的EnumMap类，但是只能使用同一个枚举类的枚举值作为key。

               
        由于HashMap里的key不能重复，所以HashMap里最多有一个key-value对的key为null，但可以有无数个key-value
        的value为空。
        
        
        
        
        
        
        
   
    
    
    
}

    

    
    

}