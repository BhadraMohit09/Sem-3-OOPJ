
class Patt {
    public static void main(String args[]) {
        String s = "Jay";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }
    }
}