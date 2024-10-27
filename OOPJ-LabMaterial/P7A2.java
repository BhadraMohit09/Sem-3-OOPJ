interface A  
{
    int a = 100;
    public void showA();
}
interface A1 extends A
{
    int a1 = 200;
    public void showA1();
}
interface A2 extends A
{
    int a2 = 300;
    public void showA2();
}
interface A12 extends A1,A2
{
    int a12 = 400;
    public void showA12();
}
class B implements A12
{
    public void showA()
    {
        System.out.println("Value of A is: "+ a);
    }
    public void showA1()
    {
        System.out.println("Value of A1 is: "+ a1);
    }
    public void showA2()
    {
        System.out.println("Value of A2 is: "+ a2);
    }
    public void showA12()
    {
        System.out.println("Value of A12 is: "+ a12);
    }
}
public class P7A2 
{
    public static void main(String[] args) 
    {
        B b1 = new B();
        b1.showA();
        b1.showA1();
        b1.showA2();
        b1.showA12();
    }
}
