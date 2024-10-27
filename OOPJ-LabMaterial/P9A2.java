class OddEven extends Thread
{
    final int n;
    final boolean isOdd;
    OddEven(int n, boolean isOdd)
    {
        this.n = n;
        this.isOdd = isOdd;
    }
    
    public void run()
    {
        int start = isOdd?1:2;
        for(int i = start; i<= n; i = i+2)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
    }
}
class P9A2 
{
    public static void main(String[] args) 
    {
        OddEven e1 = new OddEven(20, true);
        OddEven e2 = new OddEven(20, false);
        e1.start();
        e2.start();    
    }
}