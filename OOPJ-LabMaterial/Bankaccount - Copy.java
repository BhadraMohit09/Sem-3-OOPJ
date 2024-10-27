import java.util.*;

class Bankaccount {
    int acno;
    String username;
    String email;
    String atype;
    int balance;

    public void getacc() {

        Scanner s1 = new Scanner(System.in);
        System.out.println("enter account no: ");
        acno = s1.nextInt();
        System.out.println("enter username");
        username = s1.next();
        System.out.println("enter email");
        email = s1.next();
        System.out.println("enter atype");
        atype = s1.next();
        System.out.println("enter balance");
        balance = s1.nextInt();

    }

    public void disp() {
        System.out.println("account no is: " + acno);
        System.out.println("username is: " + username);
        System.out.println("email is: " + email);
        System.out.println("atype  is: " + atype);
        System.out.println("balance  is: " + balance);
    }

    public static void main(String s[]) {

        Bankaccount b1 = new Bankaccount();
        b1.getacc();
        b1.disp();
    }

}