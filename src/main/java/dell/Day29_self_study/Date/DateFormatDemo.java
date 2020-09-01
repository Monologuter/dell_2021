package dell.Day29_self_study.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 马小姐
 * @Date 2020-09-01 08:55
 * @Version 1.0
 * @Description:
 */


/*
* DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
* 日期/时间格式化子类（如 SimpleDateFormat）允许进行格式化（也就是日期 -> 文本）、
* 解析（文本-> 日期）和标准化。将日期表示为 Date 对象，
* 或者表示为从 GMT（格林尼治标准时间）1970 年 1 月 1 日 00:00:00 这一刻开始的毫秒数
*
* 成员方法  DateFormat(Date date) 将一个 Date 格式化为日期/时间字符串。 按照指定的模式将Date日期转化为合适的字符串
*
* Date parse(String source) 从给定字符串的开始解析文本，以生成一个日期。
*
* DateFormat是一个抽象类无法直接创建对象使用 可以使用DateFormat的子类 SimpleDateFormat  继承 DateFormat
*
*SimpleFormat的构造方法
*   public SimpleDateFormat(String pattern)
*   用给定的模式和默认的语言环境日期格式符号构造SimpleFormat
*   参数  String pattern  传递一个指定的模式
*   模式  区分大小写的
*   年月日时分秒   y M d H m s
    写对应的模式可以转化为不同的时间格式
    模式中的字母不能更改  但是可以更改模式中连接的符号
*
*
 *
* */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2020年09月01日 09时27分01秒");
        System.out.println(date);

    }


    /*
使用DateFormat中的format方法 将日期格式化为文本
使用步骤
第一步创建一个SimpleDateFormat对象 构造方法中传递指定的模式
SimpleDateFormat对象中的方法format按照构造方法中指定的模式将Date格式化为合适模式的文本
    * */

    /*
    * 使用DateFormat类中的pattern方法将文本解析成日期
    * 使用步骤
    * 创建SimpleDateFormat对象 构造方法中传入指定的模式
    * 调用SimpleFormat对象中的pattern方法把符合构造方法中的字符串解析成日期
    * 注意事项：
    *
    *
    *
    *
    * */
    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }
}
