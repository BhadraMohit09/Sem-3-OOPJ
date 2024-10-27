class multiplication {
    int a, b, c;

    void multi(int a) {
        System.out.println("A is:" + a);
    }

    void multi(int a, int b) {
        System.out.println("A*B is:" + (a * b));
    }

    void multi(int a, int b, int c) {
        System.out.println("A*B*C is:" + (a * b * c));
    }
}

class overloaddemo {
    public static void main(String args[]) {
        multiplication m1 = new multiplication();
        m1.multi(10);
        m1.multi(10, 5);
        m1.multi(10, 5, 2);

    }
}