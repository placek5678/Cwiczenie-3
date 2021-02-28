package com.company;

public class Main3
{
    public static void main(String[] args) {}

    public int[] sumatablic( int[] tab1, int[] tab2)
    {
        if (tab1.length != tab2.length)
        {
            return new int[0];
        }

        int[] nowaTab = new int [tab1.length];

        for (int i= 0; i < tab1.length; i++)
        {
            nowaTab[i] = tab1[i] + tab2[i];
        }
        return nowaTab;
    }
}