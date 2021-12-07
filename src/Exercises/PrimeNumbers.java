package Exercises;

public class PrimeNumbers {
    public static void main(String[] args) {
        /** TODO:
         *      1. Find if a number is prime or not and store primes into array
         *      2. Use 1. 100 times.
         */

        int limit = 100;
        for (int number = 2; number < limit; number++) {
            boolean isPrime = true;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(number + " ");
        }
    }
}
