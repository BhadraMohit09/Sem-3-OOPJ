public class Exception_handling {
    public static void main(String args[]) {

        try {
            for (int i = 0; i < args.length; i++) {
                int x = Integer.parseInt(args[i]);
                if (x < 0) {
                    throw new Exception("This number is less than 0");
                } else if (x % 10 == 0) {
                    throw new Exception("This number is divisible by 10");
                } else if (x > 1000 && x < 2000) {
                    throw new Exception("This number grater than 1000 and less than 2000");
                } else if (x > 7000) {
                    throw new Exception("This number grater than 7000");
                } else {
                    x = x + x;
                    System.out.println(x);
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
