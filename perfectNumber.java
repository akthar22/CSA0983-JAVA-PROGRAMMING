public class PerfectNumber {
    public int number;

    public PerfectNumber(int number) {
        this.number = number;
    }

    public boolean isPerfectNumber() {
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
        int number = 55;
        PerfectNumber perfectNumber = new PerfectNumber(number);

        if (perfectNumber.isPerfectNumber()) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
