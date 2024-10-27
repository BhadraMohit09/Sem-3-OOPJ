class Arrofobject extends main
{
	int rno;
	String name;
	Arrofobject(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public void disp()
	{
		System.out.println("Roll no is :" +rno);
		System.out.println("Name  is :" +name);
	}
}
class main
{
	public static void main(String args[])
	{
		Arrofobject[] a1=new Arrofobject[5];

		a1[0] = new Arrofobject(101,"student");
		a1[1] = new Arrofobject(102,"stu");
		a1[2] = new Arrofobject(103,"demo");
		a1[3] = new Arrofobject(104,"hello");
	    a1[4] = new Arrofobject(105,"world");

		a1[0].disp();
		a1[1].disp();
		a1[2].disp();
		a1[3].disp();
		a1[4].disp();
	}
}