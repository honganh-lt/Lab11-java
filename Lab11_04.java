package Lesson7;

import java.util.HashMap;
import java.util.Map;

public class Lab11_04 {
    public static void main(String[] args) {

        Map<String, String> studentDev = new HashMap<>();
        studentDev.put("K1230", "Tuan");
        studentDev.put("K1231", "Nam");
        studentDev.put("K1232", "Thao");
        studentDev.put("K1233", "Binh");
        studentDev.put("K1234", "Hoang");
        for (Map.Entry<String, String> entrySet : studentDev.entrySet()) {
            String key = entrySet.getKey();
            String value = entrySet.getValue();
            System.out.println(key + " -" + value);
        }
        System.out.println("Student rollno = K1231 is" + studentDev.get("K1231"));
        studentDev.remove("K1233");
        System.out.println("After remove: " + studentDev);
    }

}
