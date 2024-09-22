package Lesson7;

import java.lang.Integer;

public class Lab11_01<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public class MainClass {

    }

    public static void main(String[] args) {
        Lab11_01<String> stringGenerics = new Lab11_01<>();
        Lab11_01<Integer> integerGenerics = new Lab11_01<>();

        stringGenerics.setT(new String("Toi yeu Viet Nam"));
        integerGenerics.setT(new Integer(2015));

        System.out.println("Giá trị tai StringGenerics= " + stringGenerics.getT());
        System.out.println("Gi tri tai integerGenerics= " + integerGenerics.getT());
    }
}
