package Lesson10;

public class Demo {
    public static void main(String[] args) {

        SimplestClass myClass = new SimplestClass();

        myClass.showA();

        int smallBoxContains = 3425647;
        long biggerBoxContains = 34576890;

        biggerBoxContains = smallBoxContains;

        smallBoxContains = (int) biggerBoxContains;
    }
}
