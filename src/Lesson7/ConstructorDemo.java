package Lesson7;

public class ConstructorDemo {
    public static void main(String[] args) {

        MyDog objectOfMyDog = new MyDog(5);
        MyDog objectOfMyDog1 = new MyDog();
        MyDog objectOfMyDog2 = new MyDog(4, "Jane");


        System.out.println(objectOfMyDog.toString());
        System.out.println(objectOfMyDog1.toString());
        System.out.println(objectOfMyDog2.toString());


    }
}
