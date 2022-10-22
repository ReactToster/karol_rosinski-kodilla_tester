package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb: " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb: " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        correct = ResultChecker.assertEquals(-3, subtractResult);
        if(correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb: " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb: " + a + " i " + b);
        }

        int exponentiationResult = calculator.exponentiation(a);
        correct = ResultChecker.assertEquals(25, exponentiationResult);
        if(correct) {
            System.out.println("Metoda exponentiation działa poprawnie dla liczby " + a );
        } else {
            System.out.println("Metoda exponentiation nie działa poprawnie dla liczby " + a );
        }
    }
}
