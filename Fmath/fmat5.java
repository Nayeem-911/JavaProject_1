package Fmath;
import java.io.*;
import java.util.*;
public class fmat5
{
    public void fun5()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        System.out.println("enter 9 elements in the matrix A");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                a[i][j] = sc.nextInt();
        System.out.println("enter 9 elements in the matrix B");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                b[i][j] = sc.nextInt();
        
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                c[i][j] = a[i][j]+b[i][j];
        System.out.println("the sum of Matrices is : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.printf("%3d",c[i][j]);
            }
            System.out.println();
        }


    }
}