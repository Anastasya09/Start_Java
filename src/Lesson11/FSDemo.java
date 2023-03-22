package Lesson11;

public class FSDemo {
    public static void main(String[] args) {

        FailSoftArray fsa =new FailSoftArray(5, -1);
        int x;

        System.out.println("Error handling with no report");

        for (int i = 0; i < (fsa.length * 2); i++) {
            boolean isPut = fsa.put(i, i*10);
            System.out.print(isPut + " ");
        }
        System.out.println();

        for (int i = 0; i < (fsa.length * 2); i++) {
            x = fsa.get(i);
            System.out.print(x + " ");
        }
        System.out.println("\n\nError handling with no report");

        for (int i = 0; i < (fsa.length * 2); i++) {
            if(!fsa.put(i, i*10)) System.out.println("Index " + i +
                    " is out of the range! ");
        }

        System.out.println();

        for (int i = 0; i < (fsa.length * 2); i++) {
            x = fsa.get(i);
            if (x != -1) System.out.print(x + " ");
            else System.out.println("\nIndex " + i + " is out of the range! ");

        }
    }
}
