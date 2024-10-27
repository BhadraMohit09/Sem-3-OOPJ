
public class complexno {
    float rel, image;

    complexno(int r, int i) {
        rel = r;
        image = i;
    }

    String addition(complexno c1) {
        rel = rel + c1.rel;
        image = image + c1.image;
        return ("Addition is : " + rel + " " + image + " ");
    }

    public static void main(String[] args) {
        complexno d = new complexno(7, 2);
        complexno d1 = new complexno(6, 8);
        String s = d.addition(d1);
        System.out.println(s);
    }

}
