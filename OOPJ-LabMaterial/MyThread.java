class MyThread implements Runnable
{
    String greeting;
    int interval;
    public MyThread(String greeting, int interval)
    {
        this.greeting = greeting;
        this.interval = interval;
    }
    public void run()
    {
        while(true)
        {
            System.out.println(greeting);
            try
            {
                Thread.sleep(interval);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
    }
    public static void main(String[] args) 
    {
        Runnable r1 = new MyThread("Good Morning",1);   
        Runnable r2 = new MyThread("Good Afternoon", 2);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start(); 
    }
}
