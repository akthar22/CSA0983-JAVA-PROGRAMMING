import java.util.Scanner;

public class Decimals
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = convertToBinary(decimal);
        String octal = convertToOctal(decimal);

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
    }
public static String convertToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        if (decimal == 0) {
            binary.append(0);
        }
 else 
{
            while (decimal > 0) {
                binary.insert(0, decimal % 2);
                decimal /= 2;
            }
        }
        return binary.toString();
   
 }

    public static String convertToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        if (decimal == 0) {
            octal.append(0);
        } else {
            while (decimal > 0) {
                octal.insert(0, decimal % 8);
                decimal /= 8;
            }
        }
        return octal.toString();
    }
}



    