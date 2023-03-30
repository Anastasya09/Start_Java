package Homeworks_Java;

public class L13HW_QueueFullException extends Exception {
    int size;

    public L13HW_QueueFullException(int s) {
        size = s;
    }
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}
