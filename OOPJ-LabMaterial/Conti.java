import java.util.*;
public class Conti
{
    public static void main (String[] args)  
    {
        Double n=0.0;
        Double sum=0.0;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;++i)
        {
            System.out.println("Enter number to add: ");
            n = sc.nextDouble();
            if(n<=0.0)
            {
                continue;
            }
            else
            {
                sum += n;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}