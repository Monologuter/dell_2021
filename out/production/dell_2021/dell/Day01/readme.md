##Day01

###命名规范

类名大驼峰   变量名小驼峰

方法名  小驼峰

常量名 每个字母都要大写 

定义变量的时候不能使用关键字以及保留词 
51+2 (goto const)
区分大小写
不能和关键字以及保留词重复 否则代码编译的时候会报错
命名要有意义 不要使用拼音



###基本数据类型

整数(byte  short int long)   浮点数(float double)  字符(String)  布尔型(boolean)


###自增运算符
int a = 100； 最开始时a是100。

打印 a++;  这个printf会打印a++的值，注意是a++表达式的值，看我前面的讲解，a++的值就是a的值，也就是100。 别忘了这语句结束后a的值就会自增1（也就是副作用发生了）。

打印 ++a;  目前a的值为101。现在要打印++a表达式的值，++a的值就等于a+1，所以会打印出102。 此语句后a=101+1=102。

打印 --a;  这次要打印--a表达式的值，同自增一个道理，--a的值等于a-1，所以会打印出101。 此语句后a=102-1=101。

打印 a--;  a--表达式的值就是a的值，所以打印出101。 此语句后a=101-1=100。

打印 a+1;  这表达式与自增无关，只是打印a+1的值，就是101。 对a本身的值没有影响（加法表达式没有副作用）。

打印 a;  这时a的值当然还是100了。

### 逻辑运算符
$  ||  ！ 三种运算符的区别
真值表
    A                   B                          A&&B      A||B         !A           A^B          A&B         A|B

   false               false                       false       false        true         false        false     false

   true                false                       false       true          false        true         false      true

   false               true                        false        true         true         true         false      true

    true                true                       true         true          false       false         true      true

### 位运算符


### 赋值运算符


###三元运算符
expression ? value(true)
 