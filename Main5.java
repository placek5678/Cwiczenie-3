package com.company;

public class Main5
{
    public static void main(String[] args)
    {
        System.out.println(gcd(25, 50));
    }

    public static int gcd (int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd (b, a % b);
    }
}