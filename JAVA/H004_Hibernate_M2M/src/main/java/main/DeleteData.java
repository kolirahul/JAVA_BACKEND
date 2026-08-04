package main;

import java.time.Period;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Author;
import model.Book;






public class DeleteData {
	public static void main(String[] args) {
			
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Author.class)
				.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
//	  Book b =s.load(Book.class, 1);
//	  s.delete(b);
//	  tx.commit();
//		
		Author a =s.load(Author.class, 1);
		s.delete(a);
		tx.commit();
				

		
		
		
	}
}
