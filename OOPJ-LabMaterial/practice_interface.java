
import java.util.*;

interface event_listener {
    void performevent();
}

interface mouse_listener extends event_listener {
    void mouse_Clicked();

    void mouse_Pressed();

    void mouse_Relesed();

    void mouse_Moved();

    void mouse_Dragged();
}

interface key_listener extends event_listener {
    void key_pressed();

    void key_relesed();

}

class event_demo implements mouse_listener, key_listener {
    public void performevent() {
        System.out.println("perform event");
    }

    public void mouse_Clicked() {
        System.out.println("mouse clicked");
    }

    public void mouse_Pressed() {
        System.out.println("mouse pressed");
    }

    public void mouse_Relesed() {
        System.out.println("mouse relesed");
    }

    public void mouse_Moved() {
        System.out.println("mouse moved");
    }

    public void mouse_Dragged() {
        System.out.println("mouse dragged");
    }

    public void key_pressed() {
        System.out.println("key pressed");
    }

    public void key_relesed() {
        System.out.println("key relesed");
    }

}

class practice_interface {
    public static void main(String[] args) {
        event_demo e1 = new event_demo();
        e1.performevent();
        e1.mouse_Clicked();
        e1.mouse_Dragged();
        e1.mouse_Moved();
        e1.mouse_Pressed();
        e1.mouse_Relesed();
        e1.key_pressed();
        e1.key_relesed();
    }
}
