import java.util.Scanner;

class demo
{
    static int rno;
    static String name;

    demo(int rno,String name)
    {
        this.rno=rno;
        this.name=name;
    }
    void disp()
    {
        System.out.println("Roll no :"+rno);
        System.out.println("Name is :"+name);
    }
}  
 class thiskey 
 {

    public static void main(String args[])
    {
        
        demo d1=new demo (10,"jay");
        d1.disp();
    }
    
}
