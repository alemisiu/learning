package com.example.demo.domain;

import java.util.Scanner;

public class BookQuest003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Podaj liczbe calkowita: ");

        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println("Podales liczbe calkowita " + number);
            System.out.println("Liczba w formacie 2: " + Integer.toBinaryString(number));
            System.out.println("Liczba w formacie  16: " + Integer.toHexString(number));
            System.out.println("Liczba w formacie 8: " + Integer.toOctalString(number));

        } else{
            System.out.println("To nie jest prawidlowa liczba calkowita: ");
        }

        scanner.close();    
    }
    
}
