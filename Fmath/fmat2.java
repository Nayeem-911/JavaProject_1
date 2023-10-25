package Fmath;
import java.io.*;
import java.util.*;
public class fmat2
{
    public void fun2()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter a Number");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=10;j++)
            {
                System.out.println(i + " X " + j + " = " + (j*i));
            }
            System.out.println("\n\n");
        }
    }
}