import java.util.*;

abstract class veg {
    static String color;

    abstract void disp();
}

class poteto extends veg {
    void disp() {
        color = "Yello";
        System.out.println(color.toString());
    }
}

class tometo extends veg {
    void disp() {
        color = "red";
        System.out.println(color.toString());
    }

}

class brinjal extends veg {
    void disp() {
        color = "perple";
        System.out.println(color.toString());
    }

}

class Veg_demo {
    public static void main(String args[]) {
        poteto p1 = new poteto();
        tometo t1 = new tometo();
        brinjal b1 = new brinjal();

        String veg_name;
        Scanner sc = new Scanner(System.in);
        veg_name = sc.next();

        switch (veg_name) {
            case "poteto":
                p1.disp();
                break;
            case "tometo":
                t1.disp();
                break;
            case "brinjal":
                b1.disp();
                break;
            default:
                System.out.println("Invaild name");
                break;
        }

    }
}
