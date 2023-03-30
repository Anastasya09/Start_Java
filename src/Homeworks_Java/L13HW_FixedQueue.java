package Homeworks_Java;

public class L13HW_FixedQueue implements L13HW_ICharQ {
    private char q[];
    private int putloc, getloc;

    public L13HW_FixedQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch)
            throws L13HW_QueueFullException {
        if (putloc == q.length - 1)
            throw new L13HW_QueueFullException(q.length - 1);

        putloc++;
        q[putloc] = ch;
    }

    public char get()
            throws L13HW_QueueEmptyException {
        if (getloc == putloc)
            throw new L13HW_QueueEmptyException();
        getloc++;
        return q[getloc];
    }

    public void reset() {
        putloc = getloc = 0;
    }
    public void copyQueue(L13HW_ICharQ src, L13HW_ICharQ dest) throws L13HW_QueueEmptyException, L13HW_QueueFullException {
        int size = src.getSize();
        for (int i = 0; i < size; i++) {
            char ch = src.get();
            dest.put(ch);
        }
    }
    public int getSize() {
        return putloc - getloc;
    }

}
