package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if(correct){
            System.out.println("Sum result is correct for numbers: " + a + " and " + b);
        } else {
            System.out.println("Sum result is not correct for numbers: " + a + " and " + b);
        }

        int subtractResult = calculator.subtract(a,b);
        correct = ResultChecker.assertEquals(-3, subtractResult);

        if(correct){
            System.out.println("Subtract result is correct for numbers: " + a + " and " + b);
        } else {
            System.out.println("Subtract result is not correct for numbers: " + a + " and " + b);
        }

        double squaringResult = calculator.squaring(a);
        correct = ResultChecker.assertEqualsDouble(25, squaringResult);

        if(correct){
            System.out.println("Squaring result is correct for numbers: " + a + " and " + b);
        } else {
            System.out.println("Squaring result is not correct for numbers: " + a + " and " + b);
        }
    }
}
