package Lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList(4);
        System.out.println("in: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        list.add(100);
        System.out.println("in: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //khoi tao
        List intArr = new ArrayList();
        intArr.add(11);
        intArr.add(22);
        intArr.add(33);

        list = new ArrayList(intArr);
        System.out.println("in: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.set(0, 99999);
        System.out.println("in: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.add(0, 1999);
        System.out.println("in: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /*
        list = new ArrayList();
        System.out.println("in====");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
*/
        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(new Student(11, "Nguyen A", 22));
        listStudent.add(new Student(12, "Nguyen B", 23));
        listStudent.add(new Student(13, "Nguyen C", 24));

        System.out.println("in List Student =======");
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
            listStudent.get(i).show();
        }
    }
}
