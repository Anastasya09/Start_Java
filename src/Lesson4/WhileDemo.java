package Lesson4;

public class WhileDemo {

    public static void main(String[] args) {

        char ch;

        ch = 'a';

        while (ch <= 'z') {
            System.out.println(ch);
            ch++;
        }

        for (ch = 'a'; ch <= 'z'; ch++) System.out.println(ch);

    }
}
