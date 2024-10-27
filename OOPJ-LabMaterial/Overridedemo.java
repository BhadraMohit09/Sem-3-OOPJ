class car {

    void buy() {
        System.out.println("car buy");
    }
}

class audi extends car {

    void buy() {
        super.buy();
        System.out.println("audi buy");
    }
}

class mercedas extends car {
    void buy() {
        System.out.println("mercedas buy");
    }
}

class Overridedemo {
    public static void main(String args[]) {
        audi a1 = new audi();
        a1.buy();
        mercedas m1 = new mercedas();
        m1.buy();

    }
}