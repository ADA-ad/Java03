package org.example;

public class ThrowSample {
    public static void main(String[] args) throws IllegalAccessException {
        for (int i = 0; i < 10; i++) {
            if (i == 7 ) {
                throw new IllegalAccessException("引数の値が不正です");
            }
            System.out.println(i);
        };

    }
}
