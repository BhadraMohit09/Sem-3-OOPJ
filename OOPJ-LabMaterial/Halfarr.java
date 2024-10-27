
//w.a.p to find length of string and print second half of the string.

import java.util.*;
public class Halfarr
{
    public static void main(String args[])
    {
       String s ;
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter the String");
       s=s1.nextLine();
       int  len=s.length();
       for(int i=len/2;i<len;i++)
       {
           System.out.print(s.charAt(i));
       }
     
    }
}