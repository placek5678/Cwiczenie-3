package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy");
        int liczba = scan.nextInt();
        String[] tab = new String[liczba];

        Scanner odczyt = new Scanner(System.in);

        for(int liczba2 = 0; liczba2 < liczba; liczba2++)
            tab[liczba2] = odczyt.nextLine();

        for(int liczba2 =0; liczba2 < liczba; liczba2++)
            System.out.println(tab[liczba2]);
    }
}