package dell.Day32_List.hash;

/**
 * @Author 马小姐
 * @Date 2020-09-04 15:30
 * @Version 1.0
 * @Description:可变参数
 * 注意事项：一个方法的参数列表只能有一个可变参数
 * 如果参数列表的参数有很多  参数列表必须写在参数列表的末尾
 */
/*当方法的参数数据类型确定了 但是个数不确定的时候就可以使用可变参数
使用格式：
    定义方法的时候使用
    修饰符 返回值类型  方法名(数据类型...变量名){
    }




*
*定义计算(0-n)个int类型整数的和
类型已经确定 但是参数的个数不知道
这个时候就可以使用可变参数
*
* */
public class MoreArgs {
    public static void main(String[] args) {
        add();
        add(10,20);
        add(100,200,400,90);

//        method();

    }

    private static void method(String b,int ...arr) {

    }

    public  static   void   add(int ...arr){
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
