package Lesson7;

import Lesson12.Growable;

public class MyDog implements Growable {

    int age;
    String name;

    //no-parameter constructor
    MyDog() {
        name = "Anonymous";
    }

    //constructors with parameters
    MyDog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    MyDog(int age) {
        this.age = age;
        name = "Anonymous";
    }

    @Override
    public String  toString() {
        return "MyDog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Om-nom-nom");

    }

    @Override
    public void sleep() {
        System.out.println("Grrr-psss");

    }

    @Override
    public int changeSize(int previousSizeInCM) {
        return previousSizeInCM++;
    }
}
