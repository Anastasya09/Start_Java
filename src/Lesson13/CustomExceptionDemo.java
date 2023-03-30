package Lesson13;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int[] numer = {4, 8, 16, 32, 64, 127, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

    try{
        for (int i = 0; i < numer.length; i++) {
            try {
                if (numer[i] % denom[i] != 0)
                    throw new NotInResultException(numer[i], denom[i]);
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            } catch (ArithmeticException e) {
                System.out.println("Attempt to divide by zero");
            } catch (NotInResultException e) {
                System.out.println(e);
            }
        }} catch (ArrayIndexOutOfBoundsException e) {
     System.out.println("The exception of type ArrayIndexOutOfBoundsException has occured!!!!" + e.getMessage());
        }
    }
}
