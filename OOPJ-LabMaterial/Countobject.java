 class object {
    static int count=0;
    object()
    {
        count++;
    }
    void disp()
    {
        System.out.println("Number of count is :"+count);
    }
            
}
class Countobject
{
    public static void main (String args[])
    {
        object o1=new object();
        object o2=new object();
        object o3=new object();
        o1.disp();
        

    }
}
