package com.company;

public class ForLoops {
    public static int addEvens(int n){
        int sum=0;
        for(int a=2;a<=n; a+=2){
        sum+=a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("addEvens");
        System.out.println(addEvens(5));
        System.out.println(addEvens(8));
        System.out.println(addEvens(9));
    }
}
