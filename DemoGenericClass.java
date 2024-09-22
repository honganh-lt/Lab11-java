package Lesson7;

public class DemoGenericClass<T> {
    public T bienkieuT;

    public void set(T value) {
        bienkieuT = value;
    }

    public T get() {
        return bienkieuT;
    }

    //Sử dụng (test)
    public static void main(String[] args) {
        DemoGenericClass<Integer> dgcI = new DemoGenericClass<Integer>();
        dgcI.set(100);
        System.out.println("Gia tri dgcI: " + dgcI.get());

        DemoGenericClass<Float> dgcF = new DemoGenericClass<Float>();
        //Gan gia tri
        dgcF.set(1234.56F);
        System.out.println("Giá trị dgcF: " + dgcF.get());

        DemoGenericClass<String> dgcS = new DemoGenericClass<String>();
        dgcS.set("Chung Trinh");
        System.out.println("Name: " + dgcS.get());

        DemoGenericClass<Student> dgcStudent = new DemoGenericClass<Student>();
        Student student = new Student(100, "Devmaster", 10);
        dgcStudent.set(student);
        dgcStudent.get().show();

        //student.show();
    }
}
