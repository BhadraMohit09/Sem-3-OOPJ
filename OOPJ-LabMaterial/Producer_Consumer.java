class product {
    int item;

    synchronized void get(int item) {
        this.item = item;
        System.out.println("consumer" + item);
    }

    synchronized void put(int item) {
        this.item = item;
        System.out.println("producer" + item);
    }

}

class producer extends Thread {
    product p;

    producer(product p) {
        this.p = p;
        start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            p.put(i);
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}

class consumer extends Thread {

    product p;

    consumer(product p) {
        this.p = p;
        start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            p.put(i);
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

}

class Producer_Consumer {
    public static void main(String args[]) {
        product obj = new product();
        producer p1 = new producer(obj);
        consumer c1 = new consumer(obj);
    }
}