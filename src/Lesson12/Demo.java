package Lesson12;

public class Demo {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        ByThrees byThrees = new ByThrees();
        Series ob;

        ob = byThrees;

        for (int i = 0; i <5; i++) System.out.println("Next value: " + byTwos.getNext());

        System.out.println("\nReset:");
        byTwos.reset();
        for (int i = 0; i < 5; i++) System.out.println("Next value: " + byTwos.getNext());

        System.out.println("Start value is 100: ");
        byTwos.setStart(100);
        for (int i = 0; i < 5; i++) System.out.println("Next value:" + byTwos.getNext());

        System.out.println("Start value is 100: ");
        byTwos.setStart(100);
        for (int i = 0; i < 5; i++) System.out.println("Previous value:" + byTwos.getPrevious());

    }
}
