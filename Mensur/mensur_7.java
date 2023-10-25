package Mensur;
import java.io.*;
import java.util.*;
public class mensur_7
{
    public void fun7()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base and height of traingle");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("area of triangle =  "+(0.5*b*h));
    }
}