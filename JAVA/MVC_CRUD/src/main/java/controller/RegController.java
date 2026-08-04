package controller;

import java.io.IOException;

import dao.Studentdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/reg")
public class RegController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		int age=Integer.parseInt(req.getParameter("age"));
		
		
		Student st = new Student();
		st.setName(name);
		st.setEmail(email);
		st.setAge(age);
		
		Studentdao dao =new Studentdao();
		 int i= dao.addStudent(st);
		 if(i>0)
		 {
			 req.setAttribute("msg", "registration sucess");
			 req.getRequestDispatcher("index.jsp").forward(req, resp);
		 }
		
	}

}
