package Mensur;
import java.io.*;
import java.util.*;
public class mensur_8
{
    public void fun8()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height of Triangle");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double pie = 3.141;
        double sl = (h*h)+(r*r);
        double l = Math.sqrt(sl);
        System.out.println("Volume of cone = " + (0.33*pie*r*r*h));
        System.out.println("Curved surface area of cone = " +(pie*r*l));
        System.out.println("Total surface area of cone = " + ((pie*r*l)+(pie*r*r)));
    }
}