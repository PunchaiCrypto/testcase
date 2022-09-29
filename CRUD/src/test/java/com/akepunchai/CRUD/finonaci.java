package com.akepunchai.CRUD;

public class finonaci {
    //0, 1, 1, 2, 3, 5, 8, 13, 21,
    public int Fibonacci(int x){
        int a=0,b=1;
        if (x == 0){
            return a;
        }
        else if (x == 1){
            return 1;
        }
        for (int i =2 ;i<x; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public int FibonacciV2(int x){
        //0, 1, 1, 2, 3, 5, 8, 13, 21,
        pyramid.a = 0;
        pyramid.b = 1;
        if (x<1){
            return 0;
        }
        else if(x == 1){
            return pyramid.a;
        }
        else if(x == 2){
            return pyramid.b;
        }
        else if(x == 3){
            return pyramid.a+pyramid.b;
        }
        else if (x > 3){
            pyramid.c = pyramid.a+pyramid.b;
            pyramid.a = pyramid.b;
            pyramid.b = pyramid.c;
            return FibonacciV2(x-1);
        }
        else {
            return pyramid.b;
        }
    }
    public int FibonacciV3(int x){
        if (x == 0){
            return 0;
        }
        else if (x == 1 || x==2){
            return 1;
        }
        return FibonacciV3(x-1) + FibonacciV3(x-2);
    }
}
