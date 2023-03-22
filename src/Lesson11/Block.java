package Lesson11;

public class Block {
    int length, width, heigth;
    int volume;

    Block (int length, int width, int heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        volume = length * width * heigth;
    }
    boolean sameBlock (Block ob) {
        if ((ob.length == length) & (ob.width == width) & (ob.heigth == heigth)) return true;
        else return false;
    }
    boolean sameVolume (Block ob) {
        if (ob.volume == volume) return true;
        else return false;
    }
}
