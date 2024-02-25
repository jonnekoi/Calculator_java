In this code you have a calculator class,
that has a sum and you can add to the sum
or reset the sum and also get the calculator sum.
'''
public class Calculator {
private int sum;

    public Calculator() {
        this.sum = 0;
    }

    public void reset() {
        this.sum = 0;
    }

    public void add(int number) {
        this.sum += number;
    }

    public int getSum() {
        return this.sum;
    }
- private int sum; is a private instance variable that holds the current sum.
- The Calculator() constructor initializes sum to 0. 
- The reset() method sets sum back to 0.
- The add(int number) method adds the provided number to sum.
- The getSum() method returns the current value of sum.



