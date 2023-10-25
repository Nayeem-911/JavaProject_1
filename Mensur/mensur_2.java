package Mensur;
import java.io.*;
import java.util.*;
public class mensur_2
{
    public void fun2()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of a cube");
        double s = sc.nextDouble();
        System.out.println("Area of Cube = " + (s*s*s));
        System.out.println("Lateral surface area of cube = "+(4*s*s));
        System.out.println("Total surface area of cube = "+(6*s*s));
    }
}