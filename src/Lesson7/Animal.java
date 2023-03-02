package Lesson7;

public class Animal {
    float size;
    boolean isPredator;
    String colour;

    void run() {
        System.out.println("I'm running");
    };
    void eat(String food) { System.out.println("I'm eating " + food); }
    String sound() {
        if (isPredator) return "Roar";
        else return "Cry";
    }
}
