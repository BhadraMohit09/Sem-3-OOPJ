
interface A {
    final int var1 = 10;

    void disp1();
}

interface A1 extends A {
    final int var2 = 20;

    void disp2();
}

interface A2 extends A {
    final int var3 = 30;

    void disp3();

}

interface A12 extends A1, A2 {
    final int var4 = 40;

    void disp4();
}

class B implements A12 {
    public void disp1() {
        System.out.println("var 1 is:" + var1);
    }

    public void disp2() {
        System.out.println("var 2 is:" + var2);
    }

    public void disp3() {
        System.out.println("var 3 is:" + var3);
    }

    public void disp4() {
        System.out.println("var 4 is:" + var4);
    }
}

class Interface_inheritance {
    public static void main(String args[]) {
        B b1 = new B();
        b1.disp1();
        b1.disp2();
        b1.disp3();
        b1.disp4();

    }

}