package Lesson11;

public class FailSoftArray {
    private int[] a;
    private int errVal;
    public int length;

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errVal = errv;
        length = size;
    }
    public int get(int index) {
        if(indexOK(index)) return a[index];
        return errVal;
    }
    public boolean put(int index, int value) {
        if(indexOK(index)) {
            a[index] = value;
            return true;
        }
        return false;
    }
    boolean indexOK (int i) {
        if ((i >= 0) & (i < length)) return true;
        return false;
    }
}
