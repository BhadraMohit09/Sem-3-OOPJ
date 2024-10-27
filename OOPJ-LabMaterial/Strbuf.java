class Strbuf {
    public static void main(String args[]) {
        StringBuffer sb1 = new StringBuffer("Darshan");
        StringBuffer sb2 = new StringBuffer("Uni");
        System.out.println("string append :- " + sb1.append(sb2));
        System.out.println("inser :- " + sb1.insert(1, sb1));

    }

}