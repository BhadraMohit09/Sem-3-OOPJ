interface i1 {
    int a = 10;

    public void meth1();
}

interface i2 extends i1 {
    int b = 20;

    public void meth2();
}

class A implements i2 {
    public void meth1() {
        System.out.println("Value of A is" + a);
    }

    public void meth2() {
        System.out.println("Value of B is" + b);
    }
}

class Interfacedemo {
    public static void main(String args[]) {
        A a1 = new A();
        a1.meth1();
        a1.meth2();
    }
}
