abstract class abst {
    abstract void meth1();

    void meth2() {
        System.out.println("This is a Concreate Method");
    }
}

class A extends abst {
    void meth1() {
        System.out.println("This is a Abstract Method");
    }
}

class Abstractdemo {
    public static void main(String args[]) {
        A a1 = new A();
        a1.meth2();
        a1.meth1();
    }
}