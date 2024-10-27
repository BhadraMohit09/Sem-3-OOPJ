//w.a.p that search through its command line argument if argument that does not begin with upper case letter display error msg and terminate.
import java.util.*;
public class Command
{
    public static void main(String args[])
    {
     
       for (int i=0;i<args.length;i++)
       {
            String s = args[i];
           if(s.charAt(0)>90)
           {
                
               System.out.println("Invalid");
              break;
           }
           else
           {
               System.out.println("valid");
               break;
           }
       }
     
    }
}


