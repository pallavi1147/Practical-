package inheritance;
class Publisher{
	String name;
	String publisherID;
	String city;
	//Publisher class constructor
	Publisher(String name, String publisherID,String city){
		this.name=name;
		this.publisherID= publisherID;
		this.city= city;
	}
}
class Author{
	String authorName;
	int age;
	String place;
	//Author class constructor
	Author(String name, int age, String place)
	{
		this.authorName = name;
		this.age = age;
		this.place= place;
		
	}
}
 class Book {
String name;
int price;
//author details
Author author;
//Publisher details
Publisher publisher;
//Book class
Book(String n, int p, Author author,Publisher publisher)
{
	this.name = n;
	this.price=p;
	this.author = author;
	this.publisher= publisher;
}
public static void main(String[]args) {
	Author author =new Author("Micheal",32,"USA");
	Publisher publisher = new Publisher("Sun Publisher","ABC-1110","London");
	Book b= new Book("Core Java",800,author,publisher);
	System.out.println("Book Name: "+b.name);
	System.out.println("Book Price: "+b.price);
		System.out.println("---------------Author Details---------");
	System.out.println("Author Name : "+b.author.authorName);
	System.out.println("Author Age: "+b.author.age);
System.out.println("Author place: "+b.author.place);
System.out.println("---------------Publisher Details---------");
System.out.println("Publisher Name : "+b.publisher.name);
System.out.println("Publisher ID: "+b.publisher.publisherID);
System.out.println("Publisher City: "+b.publisher.city);



}
}
