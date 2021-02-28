package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy");

        try
        {
            int arrSize = scan.nextInt();

            int[] liczby = new int[arrSize];

            System.out.println("Podaj wartosc");
            int f1 = scan.nextInt();

            liczby[0] = f1;

            boolean finished = false;

            int currentNumber = f1;
            int currentIndex = 1;

            while (!finished)
            {

                if (currentIndex == arrSize - 1)
                {
                    finished = true;
                }

                if (f1 % 2 == 0)
                    liczby[currentIndex++] = currentNumber += 2;
                else
                {
                    liczby[currentIndex++] = currentNumber += 1;
                    f1++;
                }

            }

            for (int number : liczby)
            {
                System.out.print(number + " ");
            }

            System.out.println();

            System.out.println("Najmniejszy: " + min(liczby));
            System.out.println("Najwiekszy: " + max(liczby));
            System.out.println("Suma: " + sum(liczby));
            System.out.println("Srednia: " + avg(liczby));
            System.out.println("Mediana: " + median(liczby));

        }
        catch (InputMismatchException ignored)
        {
            System.out.println("Podano nieprawidlowe dane");
        }
    }

    public static int min(int[] liczby)
    {
        OptionalInt possibleInt = Arrays.stream(liczby).min();

        assert possibleInt.isPresent();

        return possibleInt.getAsInt();
    }

    public static int max(int[] liczby)
    {
        OptionalInt possibleInt = Arrays.stream(liczby).max();

        assert possibleInt.isPresent();

        return possibleInt.getAsInt();
    }

    public static int sum(int[] liczby)
    {
        return Arrays.stream(liczby).sum();
    }

    public static double avg(int[] liczby)
    {
        double numberSum = sum(liczby);

        return numberSum / liczby.length;
    }

    public static double median(int[] liczby)
    {
        if (liczby.length % 2 == 0)
        {
            return (double) (liczby[(liczby.length / 2) - 1] +
                    liczby[(liczby.length / 2)]) / 2;
        }
        else
        {
            return liczby[(liczby.length / 2)];
        }
    }
}