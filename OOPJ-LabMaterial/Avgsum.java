import java.util.*;
public class Avgsum
{
    public static void main(String args[])
   { 
        Double sum=0.0,avg=0.0;
        int a[]= new int[4];
        int nums ;
        Scanner sc =new Scanner(System.in);
  
   
        for(int i=0;i<4;i++)
        {
             a[i]=sc.nextInt();
             sum=sum+a[i];
      
        }
        avg=sum/4;
        System.out.println("Sum and avg is"+sum+avg);
    }
}