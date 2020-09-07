package dell.Day330907_HashSet.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author 马小姐
 * @Date 2020-09-07 11:41
 * @Version 1.0
 * @Description:
 */
public class demo03 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<> ();
        arrayList.add(new Student(12,"陈亚"));
        arrayList.add(new Student(23,"小明"));
        arrayList.add(new Student(11,"小刚"));
        arrayList.add(new Student(3,"张三"));
        arrayList.add(new Student(3,"李四"));
        arrayList.add(new Student(23,"哈麻皮"));
//        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排序

                int result =  o1.getAge() - o2.getAge();
                //如果年龄相同  就按照姓名的首字母排序
                if (result==0){
                    return o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return  result;
            }
        });

        System.out.println(arrayList);

    }
}
