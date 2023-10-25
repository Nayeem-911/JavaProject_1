package Numbers;
import java.io.*;
import java.util.*;
public class num3
{
    public void fun3()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n,i,f=1;
        System.out.println("Enter any number");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
            f*=i;
        System.out.println("Factorial = "+f);
    }
}