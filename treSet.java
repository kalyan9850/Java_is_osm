package set;

import java.security.AlgorithmConstraints;
import java.util.Iterator;
import java.util.TreeSet;

public class treSet {

	public static void main(String[] args) {
	TreeSet<String> al=new TreeSet<String>();
	al.add("ravi");
	al.add("vijya");
	al.add("ravi");
	al.add("ajay");
	
	Iterator<String> itr= al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

}
}
