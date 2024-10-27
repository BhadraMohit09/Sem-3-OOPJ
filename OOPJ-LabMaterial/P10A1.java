import java.util.*;
class ProducerConsumer
{
    int capacity;
    int buffer = 10;
    ProducerConsumer(int capacity)
    {
        this.capacity = capacity;
    }
    public synchronized void Produce(int item) throws Exception
    {
        while(buffer.size()==capacity)
        {
            wait();
        }
        buffer.add(item);
        System.out.println(item);
    }
}