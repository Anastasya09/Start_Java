package Lesson7;

public class AnimalDemo {
    public static void main(String[] args) {

        Animal tiger;

        tiger = new Animal();

        tiger.run();
        tiger.eat("meat");
        tiger.isPredator = true;
        System.out.println(tiger.sound());
    }
}
