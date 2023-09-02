import java.util.Arrays;

public class NumberSorter {
    private int num1;
    private int num2;
    private int num3;

    public NumberSorter(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getSmallestNumber() {
        return Math.min(Math.min(num1, num2), num3);
    }

    public void sortNumbers() {
        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        num1 = numbers[0];
        num2 = numbers[1];
        num3 = numbers[2];
    }

    public void displayNumbers() {
        System.out.println("Sorted numbers: " + num1 + ", " + num2 + ", " + num3);
    }

    public static void main(String[] args) {
        NumberSorter sorter = new NumberSorter(5, 2, 8);
        int smallestNumber = sorter.getSmallestNumber();
        System.out.println("Smallest number: " + smallestNumber);

        sorter.sortNumbers();
        sorter.displayNumbers();
    }
}
