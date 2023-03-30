package Homeworks_Java;

public class L13HW_Queue2 {
    private char q[];
    private int putloc, getloc;
    L13HW_Queue2(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }
    L13HW_Queue2(L13HW_Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for (int i = getloc; i <= putloc; i++)
            q[i] = (char) ob.q[i];
    }
    L13HW_Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for (int i = 0; i < a.length; i++) put(a[i]);
    }

        void put ( char ch) {
            if (putloc == q.length - 1) {
                System.out.println(" - Очередь заполнена.");
                return;
            }
            putloc++;
            q[putloc] = ch;
        }
            char get () {
                if (getloc == putloc) {
                    System.out.println(" - Очередь пуста.");
                    return (char) 0;
                }
                    getloc++;
                    return q[getloc];
                }
            }
