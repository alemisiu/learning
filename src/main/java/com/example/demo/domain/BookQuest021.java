package com.example.demo.domain;

import java.io.IOException;

public class BookQuest021 {
    public static void main(String[] args) throws IOException {
      
            char ch,answer = 'K';
        System.out.println("Pomyslalem litere z przedzialu od A do Z .");
        System.out.println("Sproboj ja odgadnac");

        ch =(char) System.in.read();
        if(ch == answer) 
        System.out.println("*** Dobrze! ***");
        else{
            System.out.println("zle kurła");
        }
        if(ch < answer) System.out.println("zbyt nisko");
        else System.out.println("zbyt wysoko");
    }
    
}
