package Lesson7;

public class Animal {
    float size;//атрибуты класса
    boolean isPredator;
    String colour;

    //методы класса
    void run() { //ничего не возвращает, не принимает (пустые скобки)
        System.out.println("I'm running");
    };
    void eat(String food) { System.out.println("I'm eating " + food); }

    //ничего не возвращает, принимает данные типа string
    String sound() {
        if (isPredator) return "Roar";
        else return "Cry";
    }
}
