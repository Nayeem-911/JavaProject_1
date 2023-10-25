package Mensur;
import java.io.*;
import java.util.*;
public class mensur_6
{
    public void fun6()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius and height of a cylinder");
        double pie = 3.141;
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("volume of Cylinder = " + (pie*(r*r)*h));
        System.out.println("curved surface area of cube = "+(2*pie*r*h));
        System.out.println("Total surface area of cube = "+(2*pie*r*(r+h)));
    }
}