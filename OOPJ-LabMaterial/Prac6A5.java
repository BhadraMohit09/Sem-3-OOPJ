import java.util.*;
class A
{
    private int a;
    public A(int a)
    {
        this.a = a;
    }
    public void disp()
    {
        System.out.println("Value of a is: "+ a); 
    }
}
class B extends A 
{
    int b;
    public B(int a, int b)
    {   
        super(a);
        this.b = b;
    }
    public void disp1()
    {
        System.out.println("Value of b is: "+ b);
    }
}
class Prac6A5
{
    public static void main(String args[])
    {
        B b1 = new B(10,5);
        b1.disp();
        b1.disp1();
    }
}