package Mensur;
import java.io.*;
import java.util.*;
public class mensur_9
{
    public void fun9()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Sphere ");
        double r = sc.nextDouble();
        double pie = 3.141;
        System.out.println("curved surface area of Sphere = "+(4*pie*r*r));
        System.out.println("Total surface area of Sphere = "+(4*pie*r*r));
        System.out.println("Area of Sphere = " +(1.333*pie*r*r*r));
    }
}