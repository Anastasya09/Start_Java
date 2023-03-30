package Lesson12;

public class ByThrees implements Series{

    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }
    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
