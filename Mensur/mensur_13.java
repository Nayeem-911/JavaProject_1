package Mensur;
import java.io.*;
import java.util.*;
public class mensur_13
{
    public void fun13()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the diagnals of rhombus");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double ans = (d1*d1)*(d2*d2);
        System.out.println("Area of Rhombus = " + 0.5*d1*d1);
        System.out.println("perimeter of rhombus = "+ Math.sqrt(ans));
    }
}