package Mensur;
import java.io.*;
import java.util.*;
public class mensur_12
{
    public void fun12()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lenght and Side of parallelogram");
        double l = sc.nextDouble();
        double s = sc.nextDouble();
        System.out.println("Area of Parallelogram = " +(l*s));
        System.out.println("perimeter of parallelogram = "+2*(l+s));
    }
}