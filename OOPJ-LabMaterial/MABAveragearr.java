//w.a.p that creates and initialize a four integer element array,calucalte and display the avevrage of it s value.

import java.util.*;
public class Averagearr
{
    public static void main(String args[])
    {
        Double sum=0.0,avg=0.0;
        int a[] = new int [4];
        int num;
        Scanner s1=new Scanner(System.in);
  
        for(int i=0;i<4;i++)
        {
          a[i]=s1.nextInt();
          sum=sum+a[i];
        
        }
        avg=sum/4;
        System.out.println("sum is"+sum);
         System.out.println("average  is"+avg);
        
    }
    
 }
