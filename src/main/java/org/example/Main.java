package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("koyama", "I am Koyama. I live in Tokyo");
        userMap.put("sato", "I am sato. I live in Osaka");
        userMap.put("tanaka", "I am tanaka. I live in Nagoya");

        System.out.println(userMap.get("koyama"));
        System.out.println(userMap.get("sato"));
        System.out.println(userMap.get("tanaka"));


        boolean havingkoyama = userMap.containsKey("koyama");
        System.out.println("koyama　は存在しますか");
        if (havingkoyama == true) {
            System.out.println("はい");
        } else {
            System.out.println("いいえ");
        }

//        List<Student> studentList = List.of(new Student("⼭⽥", 16, "A"),
//                new Student("⽥中", 17, "B"),
//                new Student("鈴⽊", 15, "A"));
//        for (Student student : studentList) {
//            if (student.getClassName().equals("A")) {
//                System.out.println("学⽣の名前：" + student.getName());
//            }
//        }


    }
}

//        for (int i = 0; i <10; i++){
//            System.out.println(i + "番目");
//        }