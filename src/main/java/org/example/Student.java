package org.example;

public class Student {
    private final String name;
    private final int age;
    private final String ClassName;

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        ClassName = className;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return ClassName;
    }
}
