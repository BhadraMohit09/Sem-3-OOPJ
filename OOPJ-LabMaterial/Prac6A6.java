class A 
{
    public final void disp()
        {
            System.out.println("Final method");
        }
}
public class Prac6A6
{
    public static void main(String args[])
    {
        A a1 = new A();
        a1.disp();
        final int a = 10;
        // int a = 100;
        int b = 30;
        System.out.println("Value of final A is: " + a);
        System.out.println("Value of B is: " + b);
        
    }
}