package dell.Day40.lastTest.demo03;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author 马小姐
 * @Date 2020-09-15 09:20
 * @Version 1.0
 * @Description:
 */
public class main {


    public static void main(String[] args) {

        TreeSet<Employee> treeSet = new TreeSet<Employee> ();
        treeSet.add(new Employee("张三",23,new MyDate(3,6,1997)));
        treeSet.add(new Employee("王五",21,new MyDate(8,2,1999)));
        treeSet.add(new Employee("赵六",21,new MyDate(7,2,1999)));
        treeSet.add(new Employee("李四",22,new MyDate(10,2,1998)));






        Comparator<Employee> comparator = new Comparator<Employee> () {

            @Override
            public int compare(Employee o1, Employee o2) {
                Employee c1 = (Employee) o1;
                Employee c2 = (Employee) o2;
                //判断传入的对象是不是Employee类型    下面排序依次按照生日进行排序
               if (o1 instanceof Employee && o2 instanceof Employee){
                   if (c1.getBirthday().getYear() == c2.getBirthday().getYear()) {
                       if (c1.getBirthday().getMonth() == c2.getBirthday().getMonth()) {
                           if (c1.getBirthday().getDay() == c2.getBirthday().getDay())
                               return 0;
                           else if (c1.getBirthday().getDay() > c2.getBirthday().getDay())
                               return -1;
                           else
                               return 1;
                       } else if (c1.getBirthday().getMonth() > c2.getBirthday().getMonth())
                           return -1;
                       else
                           return 1;
                   } else if (c1.getBirthday().getYear() > c2.getBirthday().getYear())
                       return -1;
                   else
                       return 1;
               }
                return 0;

            }
        };


        Object[] e;
        e = treeSet.toArray();
        for (int i = 0; i < treeSet.size(); i++) {
            System.out.println(e[i]);
        }

    }
}
