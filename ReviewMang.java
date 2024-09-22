package Lesson7;


//import Lesson04.Student;

import java.util.Scanner;

public class ReviewMang {
    public static void main(String[] args) {
        Student[] students = new Student[100]; //
        // int[] arr = new int[10];
        int n;

        //Nhập vao so luong sinh vien
        Scanner input = new Scanner(System.in);
        System.out.println("n=");
        n = input.nextInt();

        //Nhap thong tin cho tung sinh vien
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu: " + (i + 1));
            Student student = new Student();//doi tuong sinh vien
            
            System.out.println("Nhap id:");
            student.id = input.nextInt();
            input.nextLine();
            System.out.println("Nhap name:");
            student.name = input.nextLine();
            System.out.println("Nhap age:");
            student.age = input.nextInt();

            //Bỏ vào mảng
            students[i] = student; //tạo doi tuong tại vi tri i làm tắt
        }
        //Hien thi
        System.out.println("Danh sạc sinh vien:");
        /*
        for (Student item: students){
            item.show();
        }
        */
        for (int i = 0; i < n; i++) {
            students[i].show();
        }
    }
}
