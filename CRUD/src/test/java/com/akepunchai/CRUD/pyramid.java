package com.akepunchai.CRUD;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){

        System.out.print("Enter number : ");
        Scanner newobj = new Scanner(System.in);
        int numbers = newobj.nextInt();

        System.out.println(new pyramid1().Normalpyramid(numbers));
        System.out.println(new pyramid1().NormalUpSideDownPyramid(numbers));
        System.out.println(new pyramid1().NormalRightPyramid(numbers));
        System.out.println(new pyramid1().UpSideDownRightPyramid(numbers));

        System.out.println(new pyramid2().FullUpPyramid(numbers));
        System.out.println(new pyramid2().FullDownPyramid(numbers));



    }


}
