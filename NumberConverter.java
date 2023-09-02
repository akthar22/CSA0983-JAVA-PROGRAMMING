import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }
        System.out.println("Decimal: " + decimal);

        int octal = 0;
        int multiplier = 1;
        int temp = decimal;
        while (temp != 0) {
            octal += (temp % 8) * multiplier;
            temp /= 8;
            multiplier *= 10;
        }
        System.out.println("Octal: " + octal);

        String hexadecimal = "";
        temp = decimal;
        while (temp != 0) {
            int remainder = temp % 16;
            char hexDigit = getHexDigit(remainder);
            hexadecimal = hexDigit + hexadecimal;
            temp /= 16;
        }
        System.out.println("Hexadecimal: " + hexadecimal);
    }

    private static char getHexDigit(int value) {
        if (value >= 0 && value <= 9) {
            return (char) ('0' + value);
        } else {
            return (char) ('A' + value - 10);
        }
    }
}