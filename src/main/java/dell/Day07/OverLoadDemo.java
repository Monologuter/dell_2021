package dell.Day07;

/**
 * @Author 马小姐
 * @Date 2020/8/11 9:01
 * @Version 1.0
 * @Description:方法的重载
 */
public class OverLoadDemo {
    public static void main(String[] args) {
        int array[] = {1,2,3};
        int array1[] = {1,2};
        findMax(1,2);
        findMax(1.0,2.0);
        findMax("hello","world");
        findMax(array,array1);

    }


    public static void findMax(int a, int b){
        if(a>b){
            System.out.println("最大值是"+a);
        }else{
            System.out.println("最大值是"+b);
        }

    }


    public static void findMax(double c, double d){
        if(c>d){
            System.out.println("最大值是"+c);
        }else{
            System.out.println("最大值是"+d);
        }

    }

    public static void findMax(String e , String f) {
        if(e.compareTo(f)>0){
            System.out.println("最大值是"+e);
        }else{
            System.out.println("最大值是"+f);
        }
    }

    public static void findMax(int array[], int array1[]){
        if(array.length>array1.length){
            System.out.println("最大值是数组"+array.toString());
        }else{
            System.out.println("最大值是数组"+array1.toString());
        }

    }

}


