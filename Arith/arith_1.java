package Arith;
import java.io.*;
import java.util.*;
public class arith_1 
{
    public void fun1()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n,i,s=0;
        System.out.println("Enter the number of Elements");
        n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the Elements");
        for(i=0;i<n;i++)
        {
            num[i] = sc.nextInt();
            s+=num[i];
        }
        System.out.println("sum of Numbers = " + s);
    }    
}
