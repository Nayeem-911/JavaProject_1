package Mensur;
import java.io.*;
import java.util.*;
public class mensur_10
{
    public void fun10()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of HemiSphere ");
        double r = sc.nextDouble();
        double pie = 3.141;
        System.out.println("curved surface area of HemiSphere = "+(2*pie*r*r));
        System.out.println("Total surface area of HemiSphere = "+(3*pie*r*r));
        System.out.println("Area of HemiSphere = " +(0.333*pie*r*r*r));
    }
}