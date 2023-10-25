package Arith;
import java.io.*;
import java.util.*;
public class arith_4 
{
    public void fun4()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        double s=0;
        int i,n;
        System.out.println("Enter the number of Elements");
        n = sc.nextInt();
        double num[] = new double[n];
        System.out.println("Enter the Elements");
        for(i=0;i<n;i++)
        {
            num[i] = sc.nextDouble();
            s+=num[i];
        }
        double ans = (s/n);
        System.out.println("Average of Numbers = " + ans);
    }    
}
