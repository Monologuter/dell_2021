### 第一天 Day01   
0968aa393c4debd455d1a915486c2d63
java语言的开始  命名规范 运算符之类的 基本数据类型 
### 第二天 Day02   
if   while  for   (do while )  (if else)
       

        输入：sout+回车键
        输出：System.out.println();
        
        输入：psvm+回车键
        输出：public static void main(String[] args) {}
        
        输入：fori + 回车键
        输出：for (int i = 0; i < ; i++) {}
        
        快捷键：
        
        CTRL + D ：复制光标现在所在位置的这一行代码，并且复制到下一行
        
        CTRL + X ：删除当前光标所在行的代码
        
        SHIRT + ALT + 后方向键：光标所在行的代码下移一行
        
        SHIRT + ALT + 前方向键：光标所在行的代码上移一行
        
        Shift + Enter：开始新一行。光标所在行下空出一行，光标定位到新行位置
        
        Ctrl + A：选中所有代码
        
        CTRL + /:将选中的代码注释
        
        SHIRT + ALT + L：自动排版选中的代码，通常和Ctrl + A一起使用。
        
        Alt + Enter :导入包，自动修正
        
        Alt + insert：自动生成类中的get和set方法，toString方法，右键点击Generate也可以
        
        Ctrl + Z：撤销操作
        
        Ctrl + S：保存代码
        
        Ctrl + C：复制选中的代码
        
        Ctrl + V：粘贴选中的代码

### 第一周总结：
    环境的搭建  配置环境变量
    第一个Java程序  javac编译产生.class文件  
                    java 命令运行
                    
                   
    关键字和标识符：
       java关键字  51关键字+2个保留字  const+goto  
       eg: static import new return break  continue
       标识符： 命名规则
       1、由字母数字  下划线和美元符号$组成 
       2、不能由数字开头
       3、区分大小写
       4、不能和关键字重复
       
    基本数据类型：
        整型 buye short int long
        浮点型： float double char
        布尔类型 boolean
        引用数据类型
        
     运算符：
        。。。。。。。
        。。。。。。。
        。。。。。。。
        。。。。。。。
    规范：
        变量的命名小驼峰 首字母小写 后面的每个单词的首字母大写 
        类名接口名   大驼峰  每一个单词的首字母都要大写  常量全部大写 
        建名知意    取名字要知道意思  建议不要使用拼音
        
    流程控制：
        顺序结构 
            代码是一行一行执行的 
         分支结构
            if  else类
                if（）{}
                if () {} else{}
                if(){}else if(){}  else if(){}  else{}
                swhitch case类：
                switch(){
                    case1:
                    break
                    case2:
                    break;
                    ......
                    .....
                    default:
                    break;
                }
                              
         循环结构
            while
                while(){}
                
                
            do ... while
            do{
            }while()
            
            
            
           for(i=0;i<9;i++){
           }
           
    循环退出：
        循环条件不满足或者主动退出循环
        continue: 跳过当前循环  
    数组：引用数据类型：
        本身是引用数据类型 但是可以存放基本数据类型 和 引用数据类型
        长度一旦确定就无法更改
        按照维度划分  一维数组 二维数组  三维数组
        一维数组的声明和初始化：
            静态初始化 确定数组的长度和内容
            动态初始化只确定数组的长度
        二维数组的声明和初始化：
            静态
                int[][] array = new intn[][]{{1,2,3},{3,5,6}}
            动态：
                int[][] array = new int[2][3] 
                
                
## 第二周：0810-0817
    面向对象的学习内容
        类和对象：
            类的定义
                属性 方法（功能）
                属性：人的年龄 身高 性别
                方法：人会走路 吃饭
         封装 集成 多态 
         其他的关键字
            class
            
        方法的组成
            返回值 基本数据类型  引用数据类型  或者  void
            形参  形式参数
            访问修饰符
            public default protected private
            
            
    方法的重载：(一同两不同)
        要在同一个类下面
        参数的个数不一样
        参数的类型不一样
        练习：斐波那契数列 求数组中出现次数最多的元素 并返回该元素的值是多少  并且出现多少次
    构造器 构造函数 构造方法
        被称作方法：
            特点：
                可以有形参
                名称必须与类名相同
                没有返回值
                不可以使用return
                可以使用访问修饰符修饰 但是一般是不使用的
                如果不显示声明构造函数，java会为类赋予一个默认的无惨构造函数
                如果显示声明构造函数 java就不会赋予类无参构造函数
                创建对象 初始化对象
         This关键字：
                 在类的方法内使用  代表的是当前方法属于的对象的引用
                 在构造器内使用  代表的是当前正在创建的对象的引用
                 使用方法：
                    this.属性的方法  来区分成员变量和局部变量 (如果局部变量(形式参数)和实例变量不同，则不需要使用this关键字))
                    this.方法名（）  来调用本类中的其他方法 
                    this(形参列表)来调用类中其他的构造器
        javabean:是一种java语言写成的可重要的组件
                 类是公共的  
                 有一个无参的公共构造函数  
                 有属性以及对应的set get方法
                 
                 
        总结：
            关于子类构造器调用父类构造器分为三种情况
                1、子类
   
   
### 第二周总结
    面向对象   方法的重载 （特点 概念之类的）   return关键字  
    
    
    
    
### 第三周：
    重写：
        子类方法对父类方法的覆盖
        注意事项
            子类方法返回值不大于父类方法的返回值
            如果父类方法返回值是void 那么子类方法的返回值也一定是void
            如果父类方法返回值是基本数据类型  那么子类方法返回值类型要和父类方法返回值类型一致
            如果父类方法返回值类型为引用数据类型   那么子类方法的返回值类型只能是该引用数据类型及其子类
                操作符可以比较基本数据类型以及引用数据类型  
                比较基本数据类型的时候比较的是数据的值
                比较引用数据类型的时候比较的是地址值
    包装类：
        八个基本数据类型的包装类        
        基本数据类型和包装类之间的转换  拆箱和装箱 
    
    static关键字
        static关键字可以修饰属性 方法  代码块  内部类
        被static关键字修饰的属性方法就被称为类属性（类变量）和类方法
        内存分析
        
        
    单例模式：(java开发的常见的23中设计模式)
        单例类只能有一个实例
        单例类必须自己创建自己的唯一的实例 
        单例类必须给其他对象提供这个实例
        public class Singleton {
             private static Singleton singleton = new Singleton();
         
             private  double i ;
             private Singleton(){
                 i= Math.random();
             }
         
             public static Singleton getInstance(){
                 return singleton;
             }
         
             public static void main(String[] args) {
                 Singleton s1 = Singleton.getInstance();
                 Singleton s2 = Singleton.getInstance();
         
                 System.out.println(s1 == s2);
             }
         }

### 第四周：
    接口   常量    继承和实现可以同时存在  要区分之间的区别
    内部类：
           0、内部类的分类
                成员内部类（一方面作为外部类的成员   另一方面作为一个类）
                    作为一个类的时候   可以定义属性  方法  构造器之类的   
                
                局部内部类（方法内  代码快内  构造器内）
                `public class InnerClassTest {
                 
                 }
                 
                 class Person{
                     //成员内部类(静态  非静态)
                      static  class Dog{
                      String name;
                      int  age;
                      public void show(){
                        sout("卡拉是一条狗 ")
                     
                      
                      }
           
                   }
                 
                     class bird{
                          //成员内部类 非静态的 
                          String name;
                          public void sing(){
                          sout("我是一只小小鸟")
                          
                          }
                     }
                 
                 
                 
                 
                     public void meth() {
                         //局部内部类  方法内
                         class AA{
                 
                         }
                     }
                 
                     {
                         //局部内部类  代码块内
                         class BB{
                 
                         }
                 
                     }
                 
                 
                     public Person() {
                         //局部内部类  构造器内
                         class CC{ 
                 
                         }
                     }
                 }`
                
           1、在Java中，可以将一个类定义在另一个类里面或者一个方法里面，这样的类称为内部类。广泛意义上的内部类一般来说包括这四种：成员内部类、局部内部类、匿名内部类和静态内部类。下面就先来了解一下这四种内部类的用法
           2、不过要注意的是，当成员内部类拥有和外部类同名的成员变量或者方法时，会发生隐藏现象，即默认情况下访问的是成员内部类的成员。如果要访问外部类的同名成员，需要以下面的形式进行访问：
                外部类.this.成员变量
                外部类.this.成员方法
            虽然成员内部类可以无条件地访问外部类的成员，而外部类想访问成员内部类的成员却不是这么随心所欲了。在外部类中如果要访问成员内部类的成员，必须先创建一个成员内部类的对象，再通过指向这个对象的引用来访问
                            
            `public class Circle_02 {
             
                 private double radius = 0;
             
                 public void Circle(double radius) {
                     this.radius = radius;
                     
                     Draw draw = new Draw();
                     draw.drawSahpe();
                     //必须先创建成员内部类的对象，再进行访问
                 }
             
             
             
                 class Draw {     //内部类
                     public void drawSahpe() {
                         System.out.println(radius);  //外部类的private成员
                     }
                 }
             
             }`
             
             
             
             
           3、如何使用成员内部类？
                               间接方式：
                                   在外部类的方法中  使用内部类  然后main只是调用外部类的方法
                               直接方式：
                                   外部类名称.内部类名称  对象名   =  new 外部类名称().new 内部类名称();
                                       eg:  外部类为Person  内部类为Heart   调用内部类中的方法beat()
                                       则应该为： Person.Heart  heart  =  new  Person().new  Heart();
                                       heart.beat();
           4、解决外部类和内部类的重名问题：
                  访问外部类的成员变量的格式是：  外部类名称.this.外部类成员变量名
                      
                               `public class Outer {
                                    int num = 10;
                                
                                    public class  inner{
                                        int num = 20;
                                        public void showNum(){
                                            int num  = 30;
                                            System.out.println(num);  //30
                                            System.out.println(this.num);  //20 
                                            System.out.println(Outer.this.num);  //10
                                        }
                                    }
                                
                                    public static void main(String[] args) {
                                        Outer.inner show = new Outer().new inner();
                                        show.showNum();
                                
                                    }
                                }`
                                    
             
            5、访问局部内部类的属性
                `public class Outer02 {
                 
                     public static void main(String[] args) {
                         Outer02 outer02 = new Outer02();
                         outer02.methodOuter();
                     }
                     
                     public void  methodOuter(){
                 
                         class  Inner {
                             int num = 10;
                             public void methodInner(){
                                 System.out.println(num);
                             }
                 
                         }
                 
                         Inner inner = new Inner();
                         inner.methodInner();
                     }
                 }`
            
           6、局部内部类  如果希望访问所在方法的局部变量 那么这个局部变量必须是有效的final
                    从java8开始 只要局部变量的值事实上不变  那么final关键字是可以省略的   
                    原因：
                        new出来的对象是在堆内存中的
                        局部变量是跟着方法走得   在栈内存中 
                        方法运行结束之后就会出栈 局部变量就会立刻消失    
                        new出来的对象会在堆内存中持续存在  直到垃圾回收
                        
                        
           7、匿名内部类
                定义：
                    接口名称  对象名 = new   接口名称(){
                           //覆盖重写所有的抽象方法
                     };
                     
                MyInterface接口：
                    `public interface MyInterface {
                         void method();
                     }`   
                     
                     
                MyInterfaceImpl实现类：
                    `public class MyInterfaceImpl  implements  MyInterface{
                         @Override
                         public void method() {
                             System.out.println("覆盖重写了方法");
                         }
                     }
                    h
                
                DemoMain测试类：
                    `public class DemoMain {
                         public static void main(String[] args) {
                     //        MyInterfaceImpl impl = new MyInterfaceImpl();
                     //        impl.method();
                     //
                     //        //多态
                     //        MyInterface obj = new MyInterfaceImpl();
                     //        obj.method();
                     
                             MyInterface obj2 = new MyInterface() {
                                 @Override
                                 public void method() {
                                     System.out.println("匿名内部类实现了方法 ");
                                 }
                             };
                             obj2.method();
                         }
                     }
                     
                     new代表创建对象的动作
                     接口名称就是表示匿名内部类需要实现哪个接口
                     {......};   这才是匿名内部类的内容
                     
                     注意事项：
                        匿名内部类有且只能使用一次
                     
                     
           
                         
    异常：
        异常的体系结构
            java.lang.Throwable
                 |                  
                 |----java.lang.Error:  一般不编写针对性的代码进行处理 
                 |----java.lang.Exception: 可以进行异常的处理
                    ｜ 
                    ｜----编译时异常（checked）                  
                    ｜      ｜----IOException（FileNotFoundException）
                    ｜      ｜                    
                    ｜      ｜----ClassNotFoundException
                    ｜
                    ｜
                    ｜ 
                    ｜
                    ｜----运行时异常（unchecked）  （NUllPointException  ArrayIndexOutOfBoundsException  ClassCastException  NumFormaException  InputMismatchException）
                    ｜
            
                          
                                          
                                          
                                          
                                          
                                          
### 第五周：
    第四周周末项目展示：
    星期一晚上开始看date日期时间类 
    Date无参构造方法打印的是当前的时间
    Date代参数构造方法传递一个毫秒值的话就是将毫秒值转化为当前的时间
    Calendar.getTime()  返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
    星期二上午继续看黑马程序员 date  dateFormat类（对日期进行格式化）  今天任务完成String类的学习 
    
                                                                                                

### 第六周
    `由Collection接口派生的两个接口是List和Set，都可以使用迭代器来遍历，它们都实现了Iterator接口
     一.List 实现List接口的常用类有LinkedList，ArrayList，Vector和Stack,List允许有相同的元素。
     
     ArrayList
     基于数组方式实现，无容量的限制。
     在执行插入元素时可能要扩容，在删除元素时并不会减少数组的容量。
     非线程安全。
     LinkedList
     基于双向链表机制实现。
     元素的插入、移动较快。
     非线程安全。
     Vector
     基于Object数组的方式来实现的。
     基于synchronized实现的线程安全的ArrayList。
     在插入元素时容量扩充的机制和ArrayList稍有不同：
     Stack
     基于Vector实现，支持LIFO。
     二．set
     Set是一种不包含重复的元素的Collection，即任意的两个元素e1和e2都有e1.equals(e2)=false，Set最多有一个null元素。
     TreeSet
     基于TreeMap实现，支持排序。
     
     非线程安全。
     红黑树，可以实现元素的自然排序和定制排序
     HashSet
     
     基于HashMap实现，无容量限制。
     
     不允许元素重复。
     
     非线程安全
     hashSet不存入相同的元素是因为，重写了hashCode()和equals()
     MAP
     Map没有继承Collection接口，Map提供key到value的映射。一个Map中不能包含相同的key，每个key只能映射一个value。Map接口提供3种集合的视图Map的内容可以被当作一组key集合，一组value集合，或者一组key-value映射。
     
     HashMap类
     HashMap和Hashtable类似，不同之处在于HashMap是非同步的，并且允许null，即null value和null key。
     TreeMap
     
     基于红黑树实现，无容量限制。
     
     非线程安全。
     treeSet底层是用TreeMap实现的
     
     面试题
     1.HashMap与HashTable的区别？
     答：
     
     HashMap没有考虑同步，是线程不安全的；Hashtable使用了synchronized关键字，是线程安全的；
     HashMap允许K/V都为null；hashtable后者K/V都不允许为null；
     HashMap继承自AbstractMap类；而Hashtable继承自Dictionary类；
     如何决定选用HashMap还是TreeMap？
     对于在Map中插入、删除和定位元素这类操作，HashMap是最好的选择。然而，假如你需要对一个有序的key集合进行遍历，TreeMap是更好的选择。基于你的collection的大小，也许向HashMap中添加元素会更快，将map换为TreeMap进行有序key的遍历。
     3.ArrayList和Vector有何异同点？
     ArrayList和Vector在很多时候都很类似。
     （1）两者都是基于索引的，内部由一个数组支持。
     （2）两者维护插入的顺序，我们可以根据插入顺序来获取元素。
     （3）ArrayList和Vector的迭代器实现都是fail-fast的。
     （4）ArrayList和Vector两者允许null值，也可以使用索引值对元素进行随机访问。
     以下是ArrayList和Vector的不同点。
     （1）Vector是同步的，而ArrayList不是。然而，如果你寻求在迭代的时候对列表进行改变，你应该使用CopyOnWriteArrayList。
     （2）ArrayList比Vector快，它因为有同步，不会过载。
     （3）ArrayList更加通用，因为我们可以使用Collections工具类轻易地获取同步列表和只读列表
     4.ArrayList和LinkedList有何区别？
     ArrayList和LinkedList两者都实现了List接口，但是它们之间有些不同。
     （1）ArrayList是由Array所支持的基于一个索引的数据结构，所以它提供对元素的随机访问，复杂度为O(1)，但LinkedList存储一系列的节点数据，每个节点都与前一个和下一个节点相连接。所以，尽管有使用索引获取元素的方法，内部实现是从起始点开始遍历，遍历到索引的节点然后返回元素，时间复杂度为O(n)，比ArrayList要慢。
     （2）与ArrayList相比，在LinkedList中插入、添加和删除一个元素会更快，因为在一个元素被插入到中间的时候，不会涉及改变数组的大小，或更新索引。
     （3）LinkedList比ArrayList消耗更多的内存，因为LinkedList中的每个节点存储了前后节点的引用。
     • Linkedlist是底层:双向链表
     在ArrayList中增加或者删除某个元素，通常会调用System.arraycopy方法，这是一种极为消耗资源的操作，因此，在频繁的插入或者是删除元素的情况下，LinkedList的性能会更加好一点。`
            
            
        
            
        

