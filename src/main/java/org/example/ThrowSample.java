package org.example;
 ADA

import java.util.logging.ErrorManager;
 main
public class ThrowSample {
    private static ErrorManager logger;

    public static void main(String[] args) throws IllegalAccessException {
ADA

        try {
                for (int i = 0; i < 10; i++) {
                    if (i == 7) {
                        throw new IllegalAccessException("引数の値が不正です");
                    }
                    System.out.println(i);
                }
            } catch (IllegalAccessException e) {
                System.out.println("エラーが発生しました");

        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                throw new IllegalAccessException("引数の値が不正です");
            }
            System.out.println(i);

            try {
                int[] num = new int[1];
                num[0] = 1;
                System.out.println("正常終了しました");
            } catch (Exception e) {
                System.out.println("エラーが発生しました");
//            e.printStackTrace();非推奨
                logger.error("エラー", e, 0);
//            loggerのint codeは自分で設定してもいいですか
 main

            } finally {
                assert System.out != null;
                System.out.println("処理を終了します");
            }
        }
    }
 ADA


}
 main


