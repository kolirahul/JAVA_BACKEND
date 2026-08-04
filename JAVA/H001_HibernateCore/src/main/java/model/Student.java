package model;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
	
	@Id // use for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //use for auto increment id
	@Column(name="id") //column name
	int id;
	
	@Column(name="name",length = 30)
	String name;
	
	@Column(name="email")
	String email;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
