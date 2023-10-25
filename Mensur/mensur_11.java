package Mensur;
import java.io.*;
import java.util.*;
public class mensur_11
{
    public void fun11()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height and parallel sides of trapezium");
        double h = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Trapezium = "+(0.5*(a+b)*h));

    }
}