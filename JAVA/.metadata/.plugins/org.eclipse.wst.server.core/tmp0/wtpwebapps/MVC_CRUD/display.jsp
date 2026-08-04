<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <title>View Data</title>

  <!-- Bootstrap CSS -->
  <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
    rel="stylesheet"
  >
</head>

<body class="bg-light">
  <% 
    ArrayList<Student> all =  (ArrayList)request.getAttribute("data");
  %>

  <div class="container mt-5">

    <div class="card shadow p-4">

      <h2 class="text-center mb-4">User Details</h2>

      <table class="table table-bordered table-hover text-center">

        <thead class="table-dark">
          <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
            <th>Edit</th>
            <th>Delete</th>
          </tr>
        </thead>

        <tbody>
        <%
        for(Student st:all){  %>
        	
        
          <tr>
          <td><%=st.getId() %></td>
            <td><%=st.getName() %></td>
            <td><%=st.getEmail() %></td>
            <td><%=st.getAge() %></td>
            
            <td>
            <a href="update?action=update&id=<%=st.getId() %>" class="btn btn-warning btn-sm"> Edit</a>
            </td>
             
            <td>
            <a href="update?action=delete&id=<%=st.getId() %>" class="btn btn-danger btn-sm"> Delete</a>
            </td>  
            
          </tr>
         <%  }  %>

          
        </tbody>

      </table>

    </div>

  </div>

</body>
</html>