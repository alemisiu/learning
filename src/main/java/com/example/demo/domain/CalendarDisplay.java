package com.example.demo.domain;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie roku od użytkownika
        System.out.print("Podaj rok: ");
        int year = scanner.nextInt();

        // Pobranie miesiąca od użytkownika
        System.out.print("Podaj miesiąc (1-12): ");
        int month = scanner.nextInt() - 1; // Miesiące w Java zaczynają się od 0

        // Tworzenie obiektu kalendarza na podstawie podanego roku i miesiąca
        Calendar calendar = new GregorianCalendar(year, month, 1);

        // Pobranie pierwszego dnia tygodnia dla danego miesiąca
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Pobranie liczby dni w miesiącu
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Wyświetlanie nagłówka kalendarza
        System.out.println(" Kalendarz " + (month + 1) + "/" + year);
        System.out.println("  Pn Wt Śr Cz Pt So N" );

        // Wyświetlanie pustych miejsc przed pierwszym dniem miesiąca
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        // Wyświetlanie dni miesiąca
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            // Przejście do nowego wiersza po sobocie
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }

        // Zamknięcie obiektu Scanner
        scanner.close();
    }
}