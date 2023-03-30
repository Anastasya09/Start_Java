package Homeworks_Java;

public class L13HW_QDemo2 {
    public static void main(String args[]) {

        L13HW_Queue2 q1 = new L13HW_Queue2(10);

        char name[] = {'Т', 'о', 'm'};
        L13HW_Queue2 q2 = new L13HW_Queue2(name);

        char ch;
        int i;

        for (i = 0; i < 10; i++)
            q1.put((char) ('А' + i));

        L13HW_Queue2 q3 = new L13HW_Queue2(q1);

        System.out.print("Содержимое q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }


}
