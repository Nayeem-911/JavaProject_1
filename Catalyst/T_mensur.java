package Catalyst;
import Mensur.*;
import java.io.*;
import java.util.*;
public class T_mensur
{
    public void fun_mensur()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println("========================Areas and volumes=========================");
            System.out.println("------------------------------------------------------------------");
            System.out.println("1.Square\t8.Cone");
            System.out.println("2.Cube\t\t9.Sphere");
            System.out.println("3.Rectangle\t10.Hemisphere");
            System.out.println("4.Cuboid\t11.Trapezium");
            System.out.println("5.Circle\t12.Parallelogram");
            System.out.println("6.Cylinder\t13.Rhombus");
            System.out.println("7.Triangle\t14.Back to Menu");
            System.out.println("\nEnter your Choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : mensur_1 m1 = new mensur_1();
                         m1.fun1();
                         break;
                case 2 : mensur_2 m2 = new mensur_2();
                         m2.fun2();
                         break;
                case 3 : mensur_3 m3 = new mensur_3();
                         m3.fun3();
                         break;
                case 4 : mensur_4 m4 = new mensur_4();
                         m4.fun4();
                         break;
                case 5 : mensur_5 m5 = new mensur_5();
                         m5.fun5();
                         break;
                case 6 : mensur_6 m6 = new mensur_6();
                         m6.fun6();
                         break;
                case 7 : mensur_7 m7 = new mensur_7();
                         m7.fun7();
                         break;
                case 8 : mensur_8 m8 = new mensur_8();
                         m8.fun8();
                         break;
                case 9 : mensur_9 m9 = new mensur_9();
                         m9.fun9();
                         break;
                case 10 : mensur_10 m10 = new mensur_10();
                         m10.fun10();
                         break;
                case 11 : mensur_11 m11 = new mensur_11();
                         m11.fun11();
                         break;
                case 12 : mensur_12 m12 = new mensur_12();
                         m12.fun12();
                         break;
                case 13 : mensur_13 m13 = new mensur_13();
                         m13.fun13();
                         break;
            }
        }while(choice!=14);
    }
}