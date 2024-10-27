import java.io.*;
class FileDemo 
{
    public static void main(String args[]) throws IOException
    {
        FileOutputStream fout = new FileOutputStream("Demo1.txt");
        String str = "Hello";
        byte[] b1 = str.getBytes();
        fout.write(b1);
        fout.close();
    }
}