package Examples_JAVA;

public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if(a < b) System.out.println("a меньше b");
// Следующая строка никогда не может быть выведена
        System.out.println();

        if(a == b) System.out.println("Bы не должны увидеть этот текст");

        c = a - b; // переменная "c" содержит значение -1
        System.out.println("c содержит -1");

        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c - отрицательное число");
        System.out.println();

        c = b - a; // переменная "c" теперь содержит значение 1
        System.out.println("c содержит 1");

        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c - отрицательное число");
    }
}
