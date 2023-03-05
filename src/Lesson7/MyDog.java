package Lesson7;

public class MyDog {

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
}
