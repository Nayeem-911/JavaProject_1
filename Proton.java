import Catalyst.*;
import java.io.*;
import java.util.*;
public class Proton
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("\t\t\tWELCOME TO MY PROJECT");
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~\n");
        
        do
       {
            System.out.println("\n\n---------MAIN MENU--------\n");
            System.out.println("1.Arithametic Section\n2.Mensuration Section\n3.Special Numbers\n4.Simple Maths\n5.Exit\n");
            System.out.println("Enter your Choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : T_arith TA = new T_arith();
                          TA.fun_arith();
                          break;
                case 2 : T_mensur TM = new T_mensur();
                          TM.fun_mensur();
                          break;
                case 3 : T_Numbers TS = new T_Numbers();
                         TS.fun_Numbers();
                          break;
                case 4 : T_Fmath TF = new T_Fmath();
                         TF.fun_Fmath();
                         break;
            }
        }while(choice!=5);
    }
}