package com.akepunchai.CRUD;

public class FizzBuzz {


    public String FizzBuzz(int x) {
            if (x % 3 == 0) {
                if (x % 5 == 0) {
                    return "FizzBuzz";
                }
                return "Fizz";
            }
            if (x % 5 == 0) {
                return "Buzz";
            }
            else {
                return Integer.toString(x);
            }
    }
}
