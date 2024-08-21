package com.example.demo.domain;


public class GalToLit {
    public static void main(String[] args) {
        
        double meters;
        double cals;
        int counter;

        counter = 0;
        for(cals = 1; cals <= 100; cals++){
            // Sprawdzamy, czy obecna wartość cala jest podzielna przez 12
            if (cals % 12 == 0) {
                meters = cals * 39.37;
                System.out.println(meters + " calow to: " + cals + " metrow ");
                counter++;
                
                // Po każdych 12 calach (po wyświetleniu 12, 24, 36, itd.) dodajemy pusty wiersz
                if(counter == 1){
                    System.out.println();
                    counter = 0; // Resetujemy licznik po dodaniu pustego wiersza
                }
            }
        }
    }
}