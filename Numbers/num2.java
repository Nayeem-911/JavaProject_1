package Numbers;
import java.io.*;
import java.util.*;
public class num2
{
    public void fun2()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n,r,t,s=0;
        System.out.println("Enter any number ");
        n = sc.nextInt();
        t = n;
        while(n>0)
        {
            int f=1;
            r = n%10;
            for(int i=1;i<=r;i++)
                    f*=i;
            s+=f;
            n/=10;
        }
        if(t==s)
            System.out.println(t +" is a peterson Number");
        else
            System.out.println(t + " is not an peterson number");

    }
    
}