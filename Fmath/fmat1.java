package Fmath;
import java.io.*;
import java.util.*;
public class fmat1
{
    public void fun1()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter a Number");
        n = sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n + " X " + i + " = " + (n*i));
        }
    }
}