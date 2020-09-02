package dell.Day29_self_study.Date.Night;

/**
 * @Author 马小姐
 * @Date 2020-09-01 19:46
 * @Version 1.0
 * @Description:
 */

/*
* 模拟一个trim方法，去除字符串两端的空格
* 分析：
*
*
* */
public class diyTrim {
    public static void main(String[] args) {
        String str = "      abcdefheiwhfewhf     ";
        String s = myTrim(str);
        System.out.println("!"+s+"!");

    }

    private static String myTrim(String s) {
        int start=0,end=s.length()-1;

        while(start<=end && s.charAt(start) ==' '){
            start++;
        }
        while(start<=end && s.charAt(end)==' '){
            end--;
        }
        return s.substring( start,end+1 );
    }

}

