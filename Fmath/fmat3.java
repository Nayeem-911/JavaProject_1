package Fmath;
import java.io.*;
import java.util.*;
public class fmat3
{
    public void fun3()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int i,j,t,n;
        System.out.println("enter the number of elments");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter "+n+" values");
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("the sorted array is : ");
        for(i=0;i<n;i++)
            System.out.println(" "+a[i]);
    }
}