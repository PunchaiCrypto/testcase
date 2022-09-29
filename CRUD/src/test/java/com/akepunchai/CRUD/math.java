package com.akepunchai.CRUD;
public class math {

    public static void main(String[] args){

//        triangle triangle = new triangle();
//        System.out.println("Triangle :: " + String.format("%.1f",triangle.getArea(3, 5)));
//
//        rectangle rectangle = new rectangle(5,5);
//        System.out.println("Rectangle :: " + String.format("%.1f",rectangle.getArea(5,5)));
//
//        circle circle = new circle();
//        System.out.println("Circle :: " + String.format("%.1f",circle.getArea(5)));
    }
}
abstract class calculate{
    abstract float getArea();
}
abstract class triangle extends calculate{
    float getArea(float x,float y){
        return (x*y)/2;
    }
}
abstract class rectangle extends calculate{
    public float getArea(float x,float y){
        return x*y;
    }
}
class circle{
    public float getArea(float r){
        return (r*r)*22/7;
    }
}