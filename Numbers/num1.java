package Numbers;
import java.io.*;
import java.util.*;
public class num1
{
    public void fun1()throws IOException
    {
            Scanner sc = new Scanner(System.in);
            int n,r,t,s=0;
            System.out.println("Enter any number ");
            n = sc.nextInt();
            t = n;
            while(n>0)
            {
                r = n%10;
                s+=r*r*r;
                n/=10;
            }
        if(s==t)
            System.out.println(t +" is a Armstrong Number");
        else
            System.out.println(t + " is not an Armstrong number");

    }
}