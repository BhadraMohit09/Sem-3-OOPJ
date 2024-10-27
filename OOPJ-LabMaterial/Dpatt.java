import java.util.*;
class Dpatt 
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        
        for(int i=0;i<n;i++)
        {
           
            for(int j=n-i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            
            System.out.println(" ");
         
        }
        for(int i=n-1;i>0;i--)
        {
            for(int m=n-i;m>0;m--)
            {
                 System.out.print(" ");
            }
         
              for(int j=i;j>0;j-- )
              {
                  System.out.print("* ");
              }
              System.out.println();
        }
     
        
    }
}