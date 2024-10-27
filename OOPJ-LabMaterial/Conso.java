
// w.a.p to accept a line and check howmany consoants are there in a line


import java.util.*;

public class Conso 
{
    public static void main (String args[])
    {
        int vol=0,con=0;
        Scanner s1=new Scanner(System.in);
        String s;
        System.out.println("Enter the String");
        s=s1.nextLine();
      
        for (int i = 0 ; i < s.length() ; i++)
        {
            if (s.charAt(i) =='a'|| s.charAt(i)=='e'||s.charAt(i) =='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'|| s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                vol++;
            }
            else
            {
                con++;
            }
        }
        
        System.out.println("Number of vovels are"+vol);
        System.out.println("Number of consonents are"+con);
       
        
        
    }
}



