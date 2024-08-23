package com.example.demo.domain;

public class BookQuest014 {
    public static void main(String[] args) {
      int i , j;
       boolean  b1, b2;

        i =10;
        j =11;
        if(i < j) System.out.println("i < j");
        if( i <= j) System.out.println("i <= j");
        if( i != j) System.out.println("i != j");
        if( i == j) System.out.println("wywolanie nie zostanie wykonanie");
        if( i >= j) System.out.println("wywolanie nie zostanie wykonanie");
        if( i > j) System.out.println("wywolanie nie zostanie wykonanie");

        b1 = true;
        b2 = false;


        if(b1 & b2) System.out.println("wywolanie nie zostanie wykonane");
        if(!(b1 & b2)) System.out.println("!(b1 & b2)jest true");
        if(b1 | b2) System.out.println("b1 | b2 jest true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 jest true");
    }
    
}
