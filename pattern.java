import java.util.Scanner;
public class pattern {
    public static void main(String[] args)
 {
        int n = 4; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("9");
                }
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
