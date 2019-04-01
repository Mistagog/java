package lesson_1_hw;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {

        int a = 5;
        byte b1 = 1;
        short s1 = 2;
        long l1 = 100;
        double d1 = 120.45;
        String str1 = "Hello world";
        boolean bool1 = true;
        char c1 = 'z';

        System.out.println(Formula(5, 10, 15, 15));
        System.out.println(OTDO(5, 10));
        System.out.println(PlusMinus(5));
        System.out.println(Minusovoe(- 25));
        System.out.println((Strochka("Привет, ")));
//От Високосного  System.out.println((Vesokosnoe(401));
    }

    public static int Formula (int a, int b, int c, int d)
    {
        return a * (b + (c / d));
    }
    public static boolean OTDO (int a, int b)
    {
        if ((a + b >= 10) && (a + b <= 20))
        {
            return true;
        }
        else{
            return false;
    }
    }
    public static int PlusMinus (int a)
    {
        if (a >= 0)
        {
            System.out.print("Число положительное: ");
        }
        else
        {
            System.out.print("Число отрицательное: ");
        }
        return a;
    }
    public static boolean Minusovoe (int a)
    {
        if (a < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String Strochka (String s2)
    {
        return s2 + "Владимир";
    }


//Попытки высчитать високосный год не увенчались успехом, закомментировал
/*    public static String Vesokosnoe (int a)
    {
        if (a >= 400)
        {
            if ((a % 4 = 0) && (a % 100 = 0) && (a % 400 = 0))
            {
                return "Високосный";
            }
            if else((a % 4 = 0) || (a % 400 = 0))
            {
                return "Високосный";
            }
            else
            {
                return "Не високосный";
            }
        }
        if (a < 400)
        {
            if ((a % 4 != 0) || (a % 100 = 0))
            {
                return "Не високосный";
            }
            else
            {
                return "Високосный";
            }
        }
        }
        */
}
