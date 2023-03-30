package Homeworks_Java;

public class L13HW_Queue {
    Object q[];
    int putloc, getloc;

    L13HW_Queue(int size) {
        q = new Object[size + 1];
        putloc = getloc = 0;
    }

    void put(Object obj) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполенна");
            return;
        }
        putloc++;
        q[putloc] = obj;
    }

    Object get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return null;
        }
        getloc++;
        return q[getloc];
    }
}
