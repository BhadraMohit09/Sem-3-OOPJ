class str {
    public static void main(String args[]) {
        String s1 = "DARSHAN";
        int i;
        i = s1.charAt(0);

        for (i = 0; i <= s1.length(); i++) {
            if (i % 2 == 0) {
                System.out.println("The number is even");
                System.out.println(s1.toLowerCase() + i);
            } else {
                System.out.println("The number is odd");
                System.out.println(s1.toUpperCase() + i);
            }
        }

    }
}