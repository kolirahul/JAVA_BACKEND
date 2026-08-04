package servercontoller;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter
public class Filter1 extends HttpFilter {

	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		String uname=req.getParameter("username");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String pass=req.getParameter("password");
		String cpass=req.getParameter("confirm_password");
		
		RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
		if(uname==" " ||uname ==null)
			{
			  req.setAttribute("unameErr", "username required !!!");
			rd.forward(req, resp);
			}
		
		if(email==" " ||email ==null)
		{
		  req.setAttribute("emailErr", "Email required !!!");
		  rd.forward(req, resp);
		}
		
		if(phone==" " ||phone ==null)
		{
		  req.setAttribute("phoneErr", "phone required !!!");
		  rd.forward(req, resp);
		}

		if(pass==" " ||pass ==null)
		{
		  req.setAttribute("passErr", "Password required !!!");
		  rd.forward(req, resp);
		}

		if(cpass==" " ||cpass ==null)
		{
		  req.setAttribute("cpassErr", "Password required !!!");
		  rd.forward(req, resp);
		}

		
		
		
		chain.doFilter(req, resp);
		
	
		
		
		
	}
}
