package Catalyst;
import Arith.*;
import java.io.*;
import java.util.*;
public class T_arith
{
    public void fun_arith()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println("=============Arithematic Section=============");
            System.out.println("-------------------------------------------------------");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Average\n5.Back to Menu\n");
            System.out.println("enter your choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : arith_1 a1 = new arith_1();
                         a1.fun1();
                         break;
                case 2 : arith_2 a2 = new arith_2();
                         a2.fun2();
                         break;
                case 3 : arith_3 a3 = new arith_3();
                         a3.fun3();
                         break;
                case 4 : arith_4 a4 = new arith_4();
                         a4.fun4();
                         break;
                case 5 : System.out.println("exited");
                         break;
                
            }
        }while(choice!=5);
    }    
}
