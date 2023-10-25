package Numbers;
import java.io.*;
import java.util.*;
public class num4
{
    public void fun4()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n,r,t,s=0;
        System.out.println("Enter any number ");
        n = sc.nextInt();
        t = n;
        while(n>0)
        {
            r = n%10;
            s=s*10+r;
            n/=10;
        }
        if(s==t)
            System.out.println(t +" is a Palindrome Number");
        else
            System.out.println(t + " is not an Palindrome number");

    }
}