package Mensur;
import java.io.*;
import java.util.*;
public class mensur_1
{
    public void fun1()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square");
        double a = sc.nextDouble();
        System.out.println("area of square = " + (a*a));
        System.out.println("perimeter of square = " + (4*a));
    }
}