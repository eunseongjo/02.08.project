package org.example;

public class Opening {

    public static void printStringByCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)); // 문자열의 각 글자를 하나씩 출력
            try {
                Thread.sleep(100); // 100밀리초마다 출력
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}