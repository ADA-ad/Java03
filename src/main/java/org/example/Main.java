package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

// Map
        Map<String, String> score = new HashMap<>();
        score.put("数学", "100点");
        score.put("国語", "90点");
        score.put("英語", "80点");
        score.put("理科", "80点");


        System.out.println(score.get("数学"));
        System.out.println(score.get("国語"));
        System.out.println(score.get("英語"));


        boolean subject = score.containsKey("数学");
        System.out.println("数学は100点です！");
        if (subject) {
            System.out.println("はい");
        } else {
            System.out.println("いいえ");
        }
//List.of
        List<Student> studentList = List.of(new Student("⼭⽥", 16, "A"),
                new Student("⽥中", 17, "B"),
                new Student("鈴⽊", 15, "C"),
                new Student("野田", 27, "D"));

        for (Student student : studentList) {
            if (student.getClassName().equals("D")) {
                System.out.println("学⽣の名前：" + student.getName());
            }
        }

        System.out.println(studentList.get(1).getAge());
        System.out.println(studentList.get(0).getName());
        System.out.println(studentList.get(2).getClassName());

        for (Student student : studentList) {
            System.out.println(student.getAge());
        }
        for (Student student : studentList) {
            System.out.println(student.getClassName());
        }
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
        for (Student student : studentList) {
            System.out.println(student.getClass());
        }

//List
        List<String> hobby = new ArrayList<String>();
        hobby.add("プログラミング学習");
        hobby.add("読書");
        hobby.add("ゴルフ");
        System.out.println("趣味は"+ hobby.get(0) + "です。");

        for (String content : hobby) {
            System.out.println(content + "は好きです。");
        }
    }
}

