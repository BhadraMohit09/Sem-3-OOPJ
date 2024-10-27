import java.util.*;

class Game {
    public void play() {
        System.out.println("Outdoor and Indoor Game");
    }
}

class Cricket extends Game {
    public void play() {
        System.out.println("Outdoor Game");
    }
}

class Football extends Game {
    public void play() {
        System.out.println("Outdoor Game");
    }
}

class Chess extends Game {
    public void play() {
        System.out.println("Indoor Game");
    }
}

class Dynamic {
    public static void main(String args[]) {
        Game g1 = new Game();
        Cricket c1 = new Cricket();
        Football f1 = new Football();
        Chess c2 = new Chess();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name Of a Game");

        String s1 = sc.nextLine();
        if (s1.equals("cricket")) {
            g1 = c1;
        } else if (s1.equals("football")) {
            g1 = f1;
        }
        if (s1.equals("chess")) {
            g1 = c2;
        }
        g1.play();

    }

}