package Homeworks_Java;

public interface L13HW_ICharQ {
    void put(char ch) throws L13HW_QueueFullException;
    char get() throws L13HW_QueueEmptyException;
    void reset();
    int getSize();
    void copyQueue(L13HW_ICharQ src, L13HW_ICharQ dest) throws L13HW_QueueEmptyException, L13HW_QueueFullException;
}
