package Homeworks_Java;

public class L13HW_IQDemo {
    public static void main(String[] args) throws L13HW_QueueFullException, L13HW_QueueEmptyException {
        L13HW_FixedQueue q1 = new L13HW_FixedQueue(10);
        L13HW_DynQueue q2 = new L13HW_DynQueue(5);
        L13HW_CircularQueue q3 = new L13HW_CircularQueue(10);

        L13HW_ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        for(i=0; i < 10; i++)
            iQ.put((char) ('А' + i));

        System.out.print("Содержимое фиксированной очереди: ");
        for (i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
            System.out.println();

        iQ = q2;
        for(i=0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        System.out.print("Содержимое динамической очереди: ");
        for (i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
            System.out.println();

        iQ = q3;
        for(i=0; i < 10; i++)
            iQ.put((char) ('А' + i));

        System.out.print("Содержимое кольцевой очереди: ");
        for (i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
            System.out.println();

            for(i=10; i < 20; i++)
                iQ.put((char) ('А' + i));

            System.out.print("Содержимое кольцевой очереди: ");
            for (i=0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
                System.out.println("\nСохранение и использование данных кольцевой очереди");

                for (i=0; i < 20; i++) {
                    iQ.put((char) ('А' + i));
                    ch = iQ.get();
                    System.out.print(ch);
                }
    }
}


