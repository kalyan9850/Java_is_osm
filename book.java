package set;
import java.util.*;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class book {

	public static void main(String[] args) {
		HashSet<Book> set=new HashSet<Book>();
		//books
		Book b1=new Book(101,"let us x","yashwanth","bpb",8);
		Book b2=new Book(102,"data communication&net..","forouz","mc graw",4);
		Book b3=new Book(103,"os","galvin","wiley",6);
		
		//set
	     set.add(b1);
		set.add(b2);
		set.add(b3);
		
		for(Book b:set) {
			System.out.println(b.id+""+b.name+""+b.author+""+b.quantity);
		}
		
	}

}
