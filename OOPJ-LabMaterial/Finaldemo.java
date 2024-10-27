import java.util.*;
class Finaldemo
{
	final int a=5;
	int b=6;
	int temp;

	void swap()
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap a is"+a+"b is"+b);
	}

	public static void main(String args[])
	{
		
		
		Finaldemo f1=new Finaldemo();
		f1.swap();
	}


}