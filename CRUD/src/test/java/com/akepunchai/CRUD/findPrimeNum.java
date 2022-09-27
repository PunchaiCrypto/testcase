package com.akepunchai.CRUD;

public class findPrimeNum {
    public boolean primenum(int x){
        int ans = 0;
        if (x < 2){
            return false;
        }
        else if (x == 2){
            return true;
        }
        for (int y = 2; y<x ; y++){
            if (x%y == 0){
                return false;
            }
        }
        return true;
    }
}
