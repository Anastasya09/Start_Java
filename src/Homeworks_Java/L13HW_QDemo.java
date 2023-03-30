package Homeworks_Java;

public class L13HW_QDemo {
    public static void main(String args[]) {
        L13HW_Queue bigQ = new L13HW_Queue(100);
        L13HW_Queue smallQ = new L13HW_Queue(4);
        Object obj;
        int i;

        System.out.println("Использование очереди bigQ для сохранения чисел типа int");

        for(i=0; i < 10; i++)
            bigQ.put(i);

        System.out.print("Содержимое очереди bigQ: ");
        for (i=0; i < 10; i++) {
            obj = bigQ.get();
            if (obj != null) System.out.print(obj + " ");
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ для сохранения чисел типа double");

        for(i=0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (i + 0.5));

            smallQ.put(i + 0.5);

            System.out.println();
        }
        System.out.println();

        System.out.print("Содержимое smallQ: ");
        for (i = 0; i < 5; i++) {
            obj = smallQ.get();
            if (obj != null) System.out.print(obj + " ");
        }
    }
            }
