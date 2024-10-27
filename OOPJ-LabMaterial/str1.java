
//write a java program for DaRsHaN using string function.
import java.util.*;

public class str1 {
    public static void main(String[] args) {
        String s1 = new String("DARSHAN");
        // char r = s1.charAt(0);

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 1) {
                // System.out.println("The number is even");
                System.out.print(s1.toLowerCase().charAt(i));
            }

            else {
                // System.out.println("The number is odd");
                System.out.print(s1.toUpperCase().charAt(i));
            }

        }

    }
}
