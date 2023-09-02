public class PrimeNumberCalculator {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    // Function to find the nth prime number
    public static int findNthPrime(int n) {
        if (n <= 0) return -1;
        
        int count = 0;
        int number = 1;
        
        while (count < n) {
            number++;
            if (isPrime(number)) count++;
        }
        return number;
    }

    public static void main(String[] args) {
        PrimeNumberCalculator primeCalculator = new PrimeNumberCalculator();

        int numberToCheck = 17;
        int nth = 5;

        System.out.println(numberToCheck + (primeCalculator.isPrime(numberToCheck) ? " is" : " is not") + " a prime number.");

        int nthPrime = primeCalculator.findNthPrime(nth);
        System.out.println(nthPrime != -1 ? "The " + nth + "th prime number is: " + nthPrime : "Invalid input ");
    }
}
