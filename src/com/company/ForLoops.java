package com.company;

public class ForLoops {
    public static int addEvens(int n){
        int sum=0;
        for(int a=2;a<=n; a+=2){
        sum+=a;
        }
        return sum;
    }

    public static void printSquaresBack(int n){
        for(int a=n; a>0; a--){
            System.out.print(Math.pow(a,2) + " ");
        }
    }

    public static void sillyNumbers(){
        for(int n=0; n<3; n++){
            for(int a=0; a<=9; a++){
                System.out.print(a+""+a+""+a);
            }
            System.out.println("");
        }
    }

    public static void sillyNumbers2(){
        for(int n=0; n<3; n++){
            for(int a=9; a>0; a--){
                for(int b=1; b<=a; b++){
                    System.out.print(a);
                }
            }
            System.out.println("");
        }
    }

    public static void dollarsAndStars(){
            for(int a=0; a<=7; a++){
                for(int s=0; s<a; s++){
                    System.out.print("**");
                }
                for(int d=7; d>=a; d--){
                    System.out.print("$");
                }
                for(int s1=7; s1>=a; s1--){
                    System.out.print("*");
                }
                for(int s1=7; s1>=a; s1--){
                    System.out.print("*");
                }
                for(int d=7; d>=a; d--){
                    System.out.print("$");
                }
                for(int s=0; s<a; s++){
                    System.out.print("**");
                }
                System.out.println("");
            }

        }

    public static void main(String[] args) {
        System.out.println("addEvens");
        System.out.println(addEvens(5));
        System.out.println(addEvens(8));
        System.out.println(addEvens(9));
        System.out.println(" ");
        System.out.println("Print Squares Back");
        printSquaresBack(10);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Silly Numbers");
        sillyNumbers();
        System.out.println("");
        System.out.println("Silly Numbers 2");
        sillyNumbers2();
        System.out.println("");
        System.out.println("Dollars and Stars");
        dollarsAndStars();
    }
}
//addEvens
//        6
//        20
//        20
//
//        Print Squares Back
//        100.0 81.0 64.0 49.0 36.0 25.0 16.0 9.0 4.0 1.0
//
//        Silly Numbers
//        000111222333444555666777888999
//        000111222333444555666777888999
//        000111222333444555666777888999
//
//        Silly Numbers 2
//        999999999888888887777777666666555554444333221
//        999999999888888887777777666666555554444333221
//        999999999888888887777777666666555554444333221
//
//        Dollars and Stars
//        $$$$$$$$****************$$$$$$$$
//        **$$$$$$$**************$$$$$$$**
//        ****$$$$$$************$$$$$$****
//        ******$$$$$**********$$$$$******
//        ********$$$$********$$$$********
//        **********$$$******$$$**********
//        ************$$****$$************
//        **************$**$**************