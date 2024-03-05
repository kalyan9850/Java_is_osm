package set;
import java.util.*;
class TreeBook1 implements Comparable<TreeBook1>{
	int id;
	String name,author,publisher;
	int quantity;
	public TreeBook1(int id,String name,String author,String publisher,int quantity) {
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
	
	}
	
	@Override
	public int compareTo(TreeBook1 b) {
		if(id>b.id) {
			return 1;
		}
		else if(id<b.id) {
			return -1;
			
		}else {
			return 0;
		}
	}
}
public class TreeBook {

	public static void main(String[] args) {
		Set<TreeBook1>set=new TreeSet<TreeBook1>();
		TreeBook1 b1=new TreeBook1(121,"let us","Yashwant","Bps",8);
		TreeBook1 b2=new TreeBook1(223,"os","galvin","wiley",6);
		TreeBook1 b3=new TreeBook1(101,"Data Communication&net","forouzan","mc graw",4);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for(TreeBook1 b:set) {
			  System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);    
			
		}
	}

}
