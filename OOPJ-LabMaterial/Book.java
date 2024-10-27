/*Declare a class called book having author_name as private data member 
Extend book class tohave two sub classes called book_publication & 
paper_publication. Each of these classes have privatemember called 
title. Write a complete program to show usage of dynamic method 
dispatch (dynamic polymorphism) to display book or paper publications 
of given author.Use command line arguments for inputting data.*/


import java.util.*;
class Book
{
	private String author_name;
	void disp(String bookname)
	{
		System.out.println(bookname);
	}

}
class book_publication extends Book
{
	private String title;
	void disp(String bookname)
	{
		System.out.println(bookname);
	}

}
class paper_publication extends Book
{
	private String title;
	void disp(String papername)
	{
		System.out.println(papername);
	}
}
class Bookdemo
{
	public static void main(String args[])
	{
		book_publication b1=new book_publication();
		b1.disp("Hello i am programer");
		paper_publication p1=new paper_publication();
		p1.disp("Nobat");

	}
}







