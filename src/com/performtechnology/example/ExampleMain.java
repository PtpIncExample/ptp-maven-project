package com.performtechnology.example;

public class ExampleMain
{
    public static void main(String[] args)
    {
        for (int n = 1; n < 10; n++)
        {
            System.out.println(n + ": " + recursiveFib(n));
        }
    }

    private static int recursiveFib(int n)
    {
        if (n < 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }
    }
}
