//1.w.a.p to create circle class with area function to find area of circle.
//2. w.a.p difine time class which constructer to initialize hour and minute also difine addition method to an array to time objects.
//3.create a class name bank account with data membars ,account no,username,email,accounttyape,and account balance also create method get account detals and display account details.




import java.util.*;

public class Circle 
 {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }
}

class circ {
    public static void main(String args[]) 
     {
        Scanner s1 = new Scanner(System.in);
         System.out.println("Enter the radious");
        double r = s1.nextDouble();
        Circle c = new Circle(r);
        double a = c.area();
        System.out.println("Result is : " + a);
    }
}
