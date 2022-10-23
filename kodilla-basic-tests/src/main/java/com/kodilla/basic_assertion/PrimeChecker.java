package com.kodilla.basic_assertion;

public class PrimeChecker {

    private int count;
    boolean isPrime(int a) {
        if( a < 2 ) {
            return false;
        }
        for (int i = 2; i < a; i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
    }
}
