package Mensur;
import java.io.*;
import java.util.*;
public class mensur_5
{
    public void fun5(
        
    )throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        double r = sc.nextDouble();
        double pie = 3.141;
        System.out.println("Area of circle = "+(pie*r*r));
        System.out.println("perimeter of circle = "+(2*pie*r));
    }
}