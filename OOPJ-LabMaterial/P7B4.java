interface EventListener
{
    public void performEvent();
}
interface MouseListener extends EventListener
{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoveed();
    public void mouseDragged(); 
}
interface KeyListener extends EventListener
{
    public void keyPressed();
    public void keyReleased();
}
class EventDemo implements MouseListener, KeyListener
{
    public void performEvent()
    {
        System.out.println("Event Performed");
    }
    public void mouseClicked()
    {
        System.out.println("Mouse clicked");
    }
    public void mousePressed()
    {
         System.out.println("Mouse Pressed");
    }
    public void mouseReleased()
    {
        System.out.println("Mousee Released");
    }
    public void mouseMoveed()
    {
         System.out.println("Mouse Moved");
    }
    public void mouseDragged()
    {
         System.out.println("Mouse Moved");
    } 
    public void keyPressed()
    {
         System.out.println("Key Pressed");
    }
    public void keyReleased()
    {
         System.out.println("Key Released");
    }
}
class P7B4
{
    EventDemo e1 = new EventDemo();
}