<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Registration Form</title>

  <!-- Bootstrap 5 CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-6">
      
      <div class="card shadow">
        <div class="card-header text-center bg-primary text-white">
          <h4>Register</h4>
        </div>

        <div class="card-body">
          
          <form method="post" action="reg">

            
            <div class="mb-3">
              <label class="form-label">Username</label>
              <input type="text"  name="username" class="form-control" placeholder="Enter username" required>
               <span class="text-danger">${unameErr}</span>           
              
            </div>

            
            <div class="mb-3">
              <label class="form-label">Email</label>
              <input type="email" name="email" class="form-control" placeholder="Enter email" required>
               <span class="text-danger">${emailErr}</span>
            </div>

           
            <div class="mb-3">
              <label class="form-label">Phone</label>
              <input type="tel"  name="phone" class="form-control" placeholder="Enter phone number" required>
               <span class="text-danger">${phoneErr}</span>
            </div>

            
            <div class="mb-3">
              <label class="form-label">Password</label>
              <input type="password"  name="password"class="form-control" placeholder="Enter password" required>
               <span class="text-danger">${passErr}</span>
            </div>

            
            <div class="mb-3">
              <label class="form-label">Confirm Password</label>
              <input type="password"  name="password" class="form-control" placeholder="Confirm password" required>
               <span class="text-danger">${cpassErr}</span>
            </div>

            <!-- Submit Button -->
            <div class="d-grid">
              <button type="submit" class="btn btn-primary">Register</button>
            </div>

          </form>
        </div>

      </div>

    </div>
  </div>
</div>

</body>
</html>