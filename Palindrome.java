import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        int sum = originalNum + reverse;

        System.out.println("Reverse of the number: " + reverse);
        System.out.println("Sum of original and reverse: " + sum);

        int temp = sum;
        int reversedSum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversedSum = reversedSum * 10 + digit;
            temp /= 10;
        }

        if (sum == reversedSum) {
            System.out.println("The sum is a palindrome.");
        } else {
            System.out.println("The sum is not a palindrome.");
        }
    }
}