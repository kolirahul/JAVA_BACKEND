<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bootstrap Form</title>

    <!-- Bootstrap CSS -->
    <link 
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
      rel="stylesheet"
    >
</head>
<body class="bg-light">

    <div class="container mt-5">
        <div class="card shadow p-4 mx-auto" style="max-width: 500px;">
            
            <h2 class="text-center mb-4">Update Registration Form</h2>

            <span class ="text-sucess">${msg}</span>
            <form action="update" method="post">
            <input type="hidden" name="id" value="${st.getId()}">
                <!-- Name -->
                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" class="form-control" placeholder="Enter your name"
                    name="name"
                    value="${st.getName()}"
                    >
                </div>

                <!-- Email -->
                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" class="form-control" placeholder="Enter your email"
                    name="email"
                     value="${st.getEmail()}"
                    >
                </div>

                <!-- Age -->
                <div class="mb-3">
                    <label class="form-label">Age</label>
                    <input type="number" class="form-control" placeholder="Enter your age"
                    name="age"
                     value="${st.getAge()}"
                    >
                </div>

                <!-- Button -->
                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">
                        Submit
                    </button>
                </div>
                <br>
                
                <div class="d-grid">
                    <a href="display" class ="btn btn-primary">View all Student</a>

                </div>
                

            </form>

        </div>
    </div>

</body>
</html>