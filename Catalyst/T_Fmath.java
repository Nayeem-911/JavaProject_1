package Catalyst;
import java.io.*;
import Fmath.*;
import java.util.*;
public class T_Fmath
{
    public void fun_Fmath()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println("=============Simple Maths=============");
            System.out.println("-------------------------------------------------------");
            System.out.println("1.Tables\n2.Queue Tables\n3.Ascending order\n4.Descending order\n5.Matrix Addition\n6.Matrix Multiplication\n7.Back to Menu\n");
            System.out.println("enter your choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : fmat1 f1 = new fmat1();
                         f1.fun1();
                         break;
                case 2 : fmat2 f2 = new fmat2();
                         f2.fun2();
                         break;
                case 3 : fmat3 f3 = new fmat3();
                         f3.fun3();
                         break;
                case 4 : fmat4 f4 = new fmat4();
                         f4.fun4();
                         break;
                case 5 : fmat5 f5 = new fmat5();
                         f5.fun5();
                         break;
                case 6 : fmat6 f6 = new fmat6();
                         f6.fun6();
                         break;
                case 7 : System.out.println("exited");
                         break;
                
            }
        }while(choice!=7);
    }    
}
