package main;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Author;
import model.Book;

public class AddData {

	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Author.class)
				.buildSessionFactory();
		
		Session s =sf.openSession();
	     Transaction tx =s.beginTransaction();
	     
	     Author a= new Author();
	     a.setName("Rahul");
	    
	     Author a1 = s.load(Author.class, 1);
	     
	     Book b= new Book();
	     b.setName("jjava");
	     b.addAuthor(a);
	     b.addAuthor(a1);
	     
//	     Book b1=new Book();
//	     b1.setName("python");
//	     b1.addAuthor(a1);
//	     
//	     Book b2=new Book();
//	     b2.setName("software");
//	     b2.addAuthor(a);
//	     
	     s.persist(b);
//	     s.persist(b1);
//	     s.persist(b2);
	     
	     tx.commit();
	   
	
		
		
	}
}
