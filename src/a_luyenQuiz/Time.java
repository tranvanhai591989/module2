package a_luyenQuiz;

import java.util.Scanner;

public class Time {
    final static short i = 2;
    public static int j = 0;

    public static void main(String [] args)
    {
        for (int k = 0; k < 3; k++)
        {
            switch (k)
            {
                case i: System.out.print(" 0 ");
                case i-1: System.out.print(" 1 ");
                case i-2: System.out.print(" 2 ");
            }
        }
    }
}
