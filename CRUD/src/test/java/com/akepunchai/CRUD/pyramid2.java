package com.akepunchai.CRUD;

public class pyramid2 {
    public String FullUpPyramid(int x){
        String ans = "";
        for (int i = 0; i<x; i++){
            for (int y = 0; y<x-i; y++){
                ans += " ";
            }
            ans+="#";
            for(int y = 1; y <= i ;y++){
                ans+= "##";
            }
            ans+= "\n";
        }
        return ans;
    }
    public String FullDownPyramid(int x){
        String ans = "";
        for (int i = 0; i<x; i++){
            for(int y = 0; y <= i ;y++){
                ans+= " ";
            }
            ans += "#";
            for (int y = 1; y<x-i; y++){
                ans += "##";
            }
            ans+= "\n";
        }
        return ans;
    }
}
