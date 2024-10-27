import java.util.*;
public class Conti1
{
    public static void main(String args[])
    {
        Double n=0.0;
        Double sum=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total numbers for addition: ");
        int total = sc.nextInt();
        for(int i=1; i<=total; ++i)
        {
            System.out.println("Enter #"+i);
            n = sc.nextDouble();
            if(n<=-1)
            {
                break;
            }
            else
            {
                sum += n;
            }
        }
        System.out.println("Sum is: "+ sum);
    }
}