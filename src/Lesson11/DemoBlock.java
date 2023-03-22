package Lesson11;

public class DemoBlock {
    public static void main(String[] args) {

        Block myBlock1 = new Block(10, 2, 5);
        Block myBlock2 = new Block(10, 2, 5);
        Block myBlock3 = new Block(4, 5, 5);

        System.out.println("myBlock1 has the same properties as myBlock2: "
                + myBlock1.sameBlock(myBlock2));
        System.out.println("myBlock1 has the same properties as myBlock3: "
                + myBlock1.sameBlock(myBlock3));
        System.out.println("myBlock1 has the same volume as myBlock3: "
                + myBlock1.sameVolume(myBlock3));
    }
}
