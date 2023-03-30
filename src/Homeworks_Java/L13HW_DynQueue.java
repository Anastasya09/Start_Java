package Homeworks_Java;

public class L13HW_DynQueue implements L13HW_ICharQ {
    private char q[];
    private int putloc, getloc;

    public L13HW_DynQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
    public void reset() {
        q = new char[q.length];
        putloc = getloc = 0;
    }
    public void copyQueue(L13HW_ICharQ src, L13HW_ICharQ dest) throws L13HW_QueueEmptyException, L13HW_QueueFullException {
        int size = (src).getSize();
        for (int i = 0; i < size; i++) {
            char ch = src.get();
            dest.put(ch);
        }
    }
    public int getSize() {
        return putloc - getloc;
    }

}
