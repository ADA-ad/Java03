package org.example;
public class ThrowSample {
    public static void main(String[] args) throws IllegalAccessException {

        try {
                for (int i = 0; i < 10; i++) {
                    if (i == 7) {
                        throw new IllegalAccessException("引数の値が不正です");
                    }
                    System.out.println(i);
                }
            } catch (IllegalAccessException e) {
                System.out.println("エラーが発生しました");

            } finally {
                assert System.out != null;
                System.out.println("処理を終了します");
            }
        }
    }



