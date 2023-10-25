package Mensur;
import java.io.*;
import java.util.*;
public class mensur_3
{
    public void fun3()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of a rectangle");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("area of rectangle = " + (l*b));
        System.out.println("perimeter of rectangle = " + (2*(l+b)));
    }
}