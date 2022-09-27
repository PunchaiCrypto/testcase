package com.akepunchai.CRUD;

public class pyramid1 {
    public static String Normalpyramid(int x){
        String ans = "";
        for (int i = 0; i<x; i++){
            for(int y = 0; y <= i ;y++){
                ans+= "#";
            }
            ans+= "\n";
        }
        return ans;
    }
    public static String NormalUpSideDownPyramid(int x){
        String ans = "";
        for (int i = 0; i<x; i++){
            for(int y = 0; y < x-i ;y++){
                ans+= "#";
            }
            ans+= "\n";
        }
        return ans;
    }
    public static String NormalRightPyramid(int x){
        String ans = "";
        for (int i = 0; i<x; i++){
            for (int y = 0; y<x-i; y++){
                ans += " ";
            }
            for(int y = 0; y <= i ;y++){
                ans+= "#";
            }
            ans+= "\n";
        }
        return ans;
    }
    public static String UpSideDownRightPyramid(int x){
        String ans = "";
        for (int i = 0; i<x; i++){
            for(int y = 0; y <= i ;y++){
                ans+= " ";
            }
            for (int y = 0; y<x-i; y++){
                ans += "#";
            }
            ans+= "\n";
        }
        return ans;
    }
}
