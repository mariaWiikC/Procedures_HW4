package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // 1.
        int[] array = {1, 2, 2, 1};
        for (int v : reverse(array))
            System.out.print(v + "  ");

        System.out.println("");

        // 2.
        int[] o_array = {1, 2, 3, 5};
        System.out.println(equal(array, o_array));

        // 3.
        if (equal(array, reverse(array)))
            System.out.println("true");
        else
            System.out.println("false");

    }

    static int[] reverse(int[] a)
    {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length / 2; i++)
        {
            int lastTerm = a.length - 1 - i;

            b[lastTerm] = a[i];
            b[i] = a[lastTerm];
        }
        return b;
    }

    static boolean equal(int[] a, int[] b)
    {
        boolean all_true = false;

        if (a.length == b.length)
        {
            for (int i = 0; i < a.length; i++) // if a is longer than b, it doesn't work, correct this
            {
                if (a[i] == b[i])
                    all_true = true;
                else
                    all_true = false;
            }
        }
        return all_true;
    }
}
