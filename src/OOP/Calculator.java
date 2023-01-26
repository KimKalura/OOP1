package OOP;

public class Calculator {
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    /*public int sum (int a, double b) {
        ///
    }
    public int sum (double a, int b) {
        ///
    }*/
    public int max (int a ,int b) {
        //Math.max(a,b);
        return Math.max(a,b);

    }
}
