package Catalyst;
import Search_sort.*;
import java.io.*;
import java.util.*;
public class T_Searchsort
{
    public static void fun_searchsort()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println("========================search and sort=========================");
            System.out.println("------------------------------------------------------------------");
            System.out.println("1.Insertion sort");
            System.out.println("2.Selection sort");
            System.out.println("3.Bubble sort");
            System.out.println("4.Merge sort");
            System.out.println("5.Quick sort");
            System.out.println("6.Linear search");
            System.out.println("7.Binary search");
            System.out.println("8.exit");
            System.out.println("\nEnter your Choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : Ins_sort so1 = new Ins_sort();
                         so1.fun1();
                         break;
                case 2 : Sel_sort so2 = new Sel_sort();
                         so2.fun2();
                         break;
                case 3 : Bub_sort so3 = new Bub_sort();
                         so3.fun3();
                         break;
                case 4 : Merge_sort so4 = new Merge_sort();
                         so4.fun4();
                         break;
                case 5 : Quick_sort so5 = new Quick_sort();
                         so5.fun5();
                         break;
                case 6 : Lin_search so6 = new Lin_search();
                         so6.fun6();
                         break;
                case 7 : Bi_search so7 = new Bi_search();
                         so7.fun7();
                         break;
                case 8 : System.out.println("exiting.....");
                         break;
                default : System.out.println("select a valid option");
            }
        }while(choice!=8);
    }
}