//w.a.p to print given array in reverse order
import java.util.*;
public class Reversearr
{
    public static void main(String args[])
    {
       
        int a[] = new int [4];
        
        Scanner s1=new Scanner(System.in);
  
        for(int i=0;i<4;i++)
        {
          a[i]=s1.nextInt();
          
        
        }
      
         
         for(int i=4-1;i>=0;i--)
         {
             System.out.println("reverse is"+a[i]);
         }
        
    }
    
    
    
}