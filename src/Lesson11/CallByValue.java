package Lesson11;

public class CallByValue {
    public static void main(String[] args) {

        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a & b before method call: ");
        System.out.println (a + " " + b);

        ob.noChange(a, b);

        System.out.println("a & b before method call: ");
        System.out.println (a + " " + b);

        Test newob = new Test(15, 20);

        newob.change();

        System.out.println("newob.a & newob.b before method call: ");
        System.out.println (newob.a + " " + newob.b);



    }
}
