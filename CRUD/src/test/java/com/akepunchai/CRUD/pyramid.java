package com.akepunchai.CRUD;

import java.util.Scanner;

public class pyramid {
    static int a = 0;
    static int b = 1;
    static int c = 0;

    public static void main(String[] args){

        System.out.print("Enter number : ");
        Scanner newobj = new Scanner(System.in);
        int numbers = newobj.nextInt();

//        System.out.println(new pyramid1().Normalpyramid(numbers));
//        System.out.println(new pyramid1().NormalUpSideDownPyramid(numbers));
//        System.out.println(new pyramid1().NormalRightPyramid(numbers));
//        System.out.println(new pyramid1().UpSideDownRightPyramid(numbers));
//
//        System.out.println(new pyramid2().FullUpPyramid(numbers));
//        System.out.println(new pyramid2().FullDownPyramid(numbers));

//        System.out.println(new finonaci().Fibonacci(numbers));
//        System.out.println(new finonaci().FibonacciV2(numbers));
        System.out.println(new finonaci().FibonacciV3(numbers));
        //0, 1, 1, 2, 3, 5, 8, 13, 21,
        newobj.close();

    }


}
