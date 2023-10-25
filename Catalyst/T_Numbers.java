package Catalyst;
import Numbers.*;
import java.io.*;
import java.util.*;
public class T_Numbers
{
    public void fun_Numbers()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println("-----------Special Numbers---------");
            System.out.println("===================================\n");
            System.out.println("1.Armstrong Number\n2.Peterson Number\n3.Factorial Number\n4.Palindrome Number\n5.Back to menu");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : num1 n1 = new num1();
                         n1.fun1();
                         break;
                case 2 : num2 n2 = new num2();
                         n2.fun2();
                         break;
                case 3 : num3 n3 = new num3();
                         n3.fun3();
                         break;
                case 4 : num4 n4 = new num4();
                         n4.fun4();
                         break;
                case 5 : System.out.println("Exited....");
                         break;
            }
        }while(choice!=5);
    }
}