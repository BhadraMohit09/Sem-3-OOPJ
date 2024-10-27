class outerdemo
{
	 static private int a=10;
	void demoout() 
	{
		System.out.println("A is a :" +a);
		indemo i1=new indemo();
		i1.demoin();
	}
	static class indemo
	{
		int b=30;
		void demoin()
		{
			System.out.println("sum is a : " +(a+b));
		}
	}
}
 class Nested
 {
 	public static void main(String args[])
 	{
 		outerdemo o1=new outerdemo();
 		o1.demoout();
 	}
 }