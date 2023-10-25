package Mensur;
import java.io.*;
import java.util.*;
public class mensur_4
{
    public void fun4()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length,breadth and height of a cuboid");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Cuboid = " + (l*b*h));
        System.out.println("Lateral surface area of cube = "+(2*((l*b)+(b*h))));
        System.out.println("Total surface area of cube = "+(2*((l*b)+(b*h)+(l*h))));
    }
}