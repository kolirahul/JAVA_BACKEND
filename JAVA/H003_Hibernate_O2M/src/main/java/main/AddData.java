package main;

import java.time.Period;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;




public class AddData {
	public static void main(String[] args) {
		
		
		
		
	
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s  =sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
//		Category c = new Category();
//		c.setName("Sports");
//		
//		
	
		
		
		
		
		Category c = s.load(Category.class, 2);
		
		Product p1 = new Product();
		p1.setName("Fans");
		p1.setPrice(1000);
		p1.setCategory(c);
		
		Product p2 = new Product();
		p1.setName("A C");
		p1.setPrice(40000);
		p1.setCategory(c);
		
		
		s.persist(p1);
		s.persist(p2);
		
		
		tx.commit();
		
		
		
	}
}
