public class Exception_demo {

    public static void main(String args[]) {
        int x = 0, y = 0;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        int ans = 1;
        try {
            if (y > 0) {
                for (int i = 1; i <= y; i++) {
                    ans = ans * x;
                }
                System.out.println(ans);
            } else if (y == 0) {
                System.out.println(ans);
            } else {
                throw new Exception("Not vaild number");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
