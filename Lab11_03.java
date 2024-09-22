package Lesson7;

public class Lab11_03<T extends Comparable<T>> {
    public void maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(b) > 0) {
            max = c;
        }
        System.out.println("Maximum is: " + max);
    }

    public static void main(String[] args) {
        Lab11_03<Integer> compInt = new Lab11_03<>();
        Lab11_03<Float> compFloat = new Lab11_03<>();
        Lab11_03<String> compString = new Lab11_03<>();

        compInt.maximum(9, 3, 6);
        compFloat.maximum(8.5f, 9.3f, 2.6f);
        compString.maximum("VietNam", "Cuba", "Thụy Sĩ");
    }
}

