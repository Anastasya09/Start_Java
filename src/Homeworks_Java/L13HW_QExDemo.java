package Homeworks_Java;

public class L13HW_QExDemo {
    public static void main(String[] args) {
        L13HW_FixedQueue q = new L13HW_FixedQueue(10);
        char ch;
        int i;

        try {
            for (i = 0; i < 11; i++) {
                System.out.print("Пoпыткa сохранения: " + (char) ('А' + i));
                q.put((char) ('А' + i));
                System.out.println(" - ОК");
            }
            System.out.println();
        }
        catch (L13HW_QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            for (i = 0; i < 11; i++) {
                System.out.print("Пoлyчeниe очередного символа: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (L13HW_QueueEmptyException exc) {
            System.out.println(exc);

        }
    }
}
