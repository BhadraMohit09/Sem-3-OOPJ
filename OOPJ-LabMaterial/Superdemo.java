import java.util.*;
class Superdemo extends Superdemmo
{
	void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Swap is="+"a="+a+"b="+b);
	}
}
class Subclass extends Superdemo
{
	Subclass()
	{
		super.swap(7,8);
	}
}
class Superdemmo
{
	public static void main(String args[])
	{
		Subclass s1=new Subclass();
	}
}