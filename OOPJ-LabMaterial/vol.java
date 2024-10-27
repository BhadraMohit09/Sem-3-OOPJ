import java.util.*;

public class Main 
{
  
public static void main (String args[]) 
  {
    
int vol=0, con=0;

Scanner sc = new Scanner (System.in);
String s;
System.out.println("Enter the string");
s = sc.nextLine();
    
 
 
for (int i = 0; i < s.length() ; i++)
      
      {
	
if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U' )
{
        vol++;
}
else
{
    con++;
}

	  
} 
System.out.println("Number of Vovels are"+vol);
System.out.println("Number of Consonents are"+con);

 
 
} 
}
