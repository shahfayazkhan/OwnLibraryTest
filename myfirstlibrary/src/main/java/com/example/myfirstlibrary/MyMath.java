package com.example.myfirstlibrary;

public class MyMath {

    public static int plus(int a,int b){
        return a+b;
    }

    public static int minus(int a,int b){
        return a-b;
    }

    public static int Times(int a,int b){
        return a*b;
    }

    public static float divide(int a,int b){
        if(b == 0){
            throw new IllegalArgumentException("Divide by Zero Error");
        }else {
            return a / b;
        }
    }
}
