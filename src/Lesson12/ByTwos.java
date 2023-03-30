package Lesson12;

public class ByTwos  implements Series{

    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }
    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x -2;
    }
    int getPrevious() {
        return prev;
    }
}
