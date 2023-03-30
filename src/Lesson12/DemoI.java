package Lesson12;

public class DemoI {
    public static void main(String[] args) {
        MyClass ob1 = new MyClass();
        MyClass2 ob2 = new MyClass2();

        System.out.println("ob1 call:");
        demoInterchange(ob1);

        System.out.println("\nob2 call:");
        demoInterchange(ob2);

        MyIFImpl myob1 = new MyIFImpl();

        System.out.println(myob1.getUserID());
        System.out.println(myob1.getAdminID());

        int uID = MyIF.getUniversalID();
        System.out.println(uID);

    }

    public static void demoInterchange(IB obj) {
        obj.method1();
        obj.method2();
        obj.method3();

    }
}
