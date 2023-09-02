import java.util.Scanner;
import java.util.array;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        int primeCount = 0;
        int compositeCount = 0;

        for (int number = start; number <= end; number++) {
            if (isPrime(number))
                primeCount++;
            else
                compositeCount++;
        }

        System.out.println("Number of prime numbers: " + primeCount);
        System.out.println("Number of composite numbers: " + compositeCount);
    }

   
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
