public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(7);
        calculator.add(11);
        calculator.add(-5);
        System.out.println(calculator.getSum());
        calculator.reset();
        calculator.add(5);
        calculator.add(4);
        System.out.println(calculator.getSum());
    }
}