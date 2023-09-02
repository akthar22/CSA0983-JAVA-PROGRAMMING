public class Perfectn {

    public static boolean isPerfectn(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enteer number:");
         a=sc.nextInt();
        if (isPerfectn(a)) {
            System.out.println(a + " is a perfectn .");
        } else {
            System.out.println(a + " is not a perfectn .");
        }
    }
}
