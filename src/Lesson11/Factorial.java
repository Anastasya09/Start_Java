package Lesson11;

public class Factorial {

   int calcFactorialRecursive (int n) {
       int result;
       if (n==1) return 1;
       result = calcFactorialRecursive(n-1) * n;
       return result;
   }
   int calcFactorialIterative(int n) {
       int result, t;
       result = 1;
       for (t = 1; t <= n; t++)
           result *= t;
       return result;
   }

}
