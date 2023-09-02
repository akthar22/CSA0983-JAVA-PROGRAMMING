import java.util.Scanner;

public class Perfects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        System.out.println("Perfect numbers within the range:");
        for (int i = 1; i <= range; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

        int sum = 0;
        for (int i = 1; i < 10; i++) {
            int tempSum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    tempSum += j;
                }
            }
            if (tempSum == i) {
                sum += i;
            }
        }

        System.out.println("Sum of perfect numbers less than 10: " + sum);
    }
}