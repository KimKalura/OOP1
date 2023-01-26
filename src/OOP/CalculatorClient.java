package OOP;

public class CalculatorClient {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
//      calculator.sum(2,3,5);
//      calculator.sum(4,5);
//      calculator.sum(5,3,2);
        System.out.println(calculator.sum(2,3,5));
        System.out.println(calculator.sum(4,5));
        System.out.println(calculator.sum(5,3,2));
        System.out.println(calculator.max(3,8));
    }
}
