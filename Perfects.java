import java.util.Scanner;

public class Perfects {
    // Function to check if a number is a perfect number
    static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        System.out.println("Perfect numbers within the range:");
        for (int i = 1; i <= range; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }

        int sum = 0;
        for (int i = 1; i < 10; i++) {
            if (isPerfect(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of perfect numbers less than 10: " + sum);
    }
}
