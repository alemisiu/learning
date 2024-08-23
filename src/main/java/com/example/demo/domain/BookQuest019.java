package com.example.demo.domain;

public class BookQuest019 {
    public static void main(String[] args) {
        for(int x =2;x<=100;x++){
        boolean IsPrimary = true;
        for (int i = 2; i < x; i++) {
            int resztaZDzielenia = x % i;
            if (resztaZDzielenia == 0) {
                IsPrimary = false;
                break;

            }

         
        }

        if (IsPrimary) {
            System.out.println(x);
        } else {
            // System.out.println("nie jest primary");
        }

        }

    }

}
