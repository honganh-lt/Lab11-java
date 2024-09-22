package Lesson7;

public class DemoGeneric {
    public static void main(String[] args) {
        Integer[] inArr = {12, 22, 21, 44};
        Float[] ftArr = {1.2f, 2.2f, 3.4f};
        String[] strArr = {"Hung", "Dung", "Sang"};
        Character[] chArr = {'H', 'e', 'l', 'l', 'o'};
        printArray(inArr);
        System.out.println("======================");
        printArray(ftArr);
        printArray(strArr);
        printArray(chArr);
    }

    //Method generic
    public static <T> void printArray(T[] intputArray) {
        System.out.println("Danh sach: ");
        for (T item : intputArray) {
            System.out.println(item);
        }
    }
}
