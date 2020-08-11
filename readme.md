### 第一天 Day01   
java语言的开始  命名规范 运算符之类的 基本数据类型 
### 第二天 Day02   
if   while  for   (do while )  (if else)
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
            
            
        

