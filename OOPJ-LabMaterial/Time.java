import java.util.*;

class Time {
    int h, m;

    public Time(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public void add(Time t1,Time t2) {
       Time t=new Time(0,0);
       t.h=t1.h+t2.h;
       t.m=t1.m+t2.m;
       t.h+=(t.m/60);
       t.m=(t.h%60);
       System.out.println("The Time is :" +t.h+":"+t.m);


    }
}

class Mtime {
    public static void main(String s[]) {

        int h = 0, m = 0;
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter hours, min");
        h = s1.nextInt();
        m = s1.nextInt();
        Time t1 = new Time(h, m);
        System.out.println("Enter hours,Min");

        h = s1.nextInt();
        m = s1.nextInt();
        Time t2 = new Time(h, m);
        t2.add(t1,t2);

    }
}
