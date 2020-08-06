package dell.Day03_0806;

/**
 * @Author 马小姐1013520@qq.com
 * @Date 2020/8/6 8:37
 * @Version 1.0
 * @Description:  数组
 * 数组是多个相同类型的数据按照顺序排列的一个集合
 * 数组的定义：
 *  存放同种类型的一组数据
 *  排列按照一定的顺序进行排列
 *  只有一个名字
 *  按照编号的方式来管理这一组数据
 *  {1,2,4,5,9}  {"你属猪吗","你真的是猪","哈哈哈哈哈哈"}
 *  下标索引
 *  元素   这个数组里面存放的每一个数据
 *  数组名称存放的是首地址  然后通过数组索引的加减法来找到其他的元素
 *
 *
 *
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        * 定义一个数组的两种方式
        * 第一种 ： 静态初始化
        * 
        * 
        * 
        * */
        //第一种  静态初始化
        String [] names = new String[]{"你是猪吗","哈麻皮","憨憨","日龙"};   //声明和初始化
        System.out.println(names[2]);
        double [] hight = new double[] {1.78 , 1.66,1.56};
        System.out.println(hight[2]);


        //打印数组的长度
        System.out.println(names.length);


        //第二种：动态初始化
        int[] b = new int[5];
        System.out.println(b[1]);

        double[] c = new double[5];
        System.out.println(c[1]);

        char[] d = new char[5];
        System.out.println(d[1]);

        long[] e = new long[5];
        System.out.println(e[1]);

        String[] f = new String[5];
        System.out.println(f[1]);

        short[] g = new short[5];
        System.out.println(g[1]);

        byte[] h = new byte[5];
        System.out.println(h[1]);

        boolean[] i = new boolean[5];
        System.out.println(i[1]);

        float[] j = new float[5];
        System.out.println(j[1]);



        //声明和初始化一个长度为5的String类型的数组
        String Array[] = new String[]{"哈哈哈哈","嘿嘿嘿","嘤嘤嘤","呜呜呜","呀呀呀"};
        System.out.println(Array[2]);
        Array[2] = "爬爬爬";
        System.out.println(Array[2]);



        int Array1[] = new int[] {1,3,5,6,7};
        int temp = Array1[1]+2;
        System.out.println(temp);
        //数组的最后一个元素就是数组索引减一的时候元素
        System.out.println("数组的长度是："+Array1.length);
        System.out.println("数组的最后一个元素是："+Array1[Array1.length-1]);

        for (int n = 0;  n<=Array1.length-1 ; n++) {
            if (n==0){
                System.out.print("打印出来的数组为："+"["+Array1[0]+",");
            }else{
                if(n==Array1.length-1){
                    System.out.print(Array1[n]+"]");
                }else if(n<Array1.length-1){
                    System.out.print(Array1[n]+",");
                }
            }
        }
     }
}
