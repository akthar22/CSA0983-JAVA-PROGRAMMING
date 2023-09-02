class SeriesCalculator
 {
    public  int n;

    public SeriesCalculator(int n) {
        this.n = n;
    }

    public double factorial(int num) {
        double fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public double calculateSeries() {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double term = (i % 2 == 0) ? -(i / factorial(i)) : (i / factorial(i));
            sum += term;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 10; 
        SeriesCalculator series = new SeriesCalculator(n);
        double result = series.calculateSeries();
        System.out.println("Result: " + result);
    }
}
