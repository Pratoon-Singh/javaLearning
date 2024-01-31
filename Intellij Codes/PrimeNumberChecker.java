import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 17; // Replace this with the number you want to check

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not a prime number
            }
        }

        return true; // If not divisible by any number, it's a prime number
    }
}
