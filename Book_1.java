package set;

import java.util.*;  
class Booksset {  
int id;  
String name,author,publisher;  
int quantity;  
public  Booksset(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
} 

public class Book_1{  
public static void main(String[] args) {  
    LinkedHashSet<Booksset> hs=new LinkedHashSet<Booksset>();  
     
    Booksset b1=new Booksset(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Booksset b2=new Booksset(102,"Data Communications & Networking","Forouzan","Mc Graw",4);  
    Booksset b3=new Booksset(103,"Operating System","Galvin","Wiley",6);  
     
    hs.add(b1);  
    hs.add(b2);  
    hs.add(b3);  
   
    for(Booksset b:hs){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  
