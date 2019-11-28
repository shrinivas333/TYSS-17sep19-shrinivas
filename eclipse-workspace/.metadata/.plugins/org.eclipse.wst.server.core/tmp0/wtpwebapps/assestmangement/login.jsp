<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <div class="card col-md-6 offset-3 mt-5">
            <div class="card-body ">
                
                <form action="./login" method="POST" role="form">
                    <legend>Login</legend>
                
                    <div class="form-group">
                        <label for="">User Id</label>
                        <input type="number" class="form-control" name="id" placeholder="Enter a user name">
                    </div>
                
                    <div class="form-group">
                            <label for="">Password</label>
                            <input type="password" class="form-control" name="password" placeholder="Enter a password">
                        </div>
                    
                 <!-- Material unchecked -->
				<div class="form-check">
 					   <input type="checkbox" class="form-check-input" name="rememberme">
 					   <label class="form-check-label" for="materialUnchecked">Remember Me</label>
				</div>
				<br>
                  <div class="form-group" >
                  <input type="radio" name="usertype" >Manager
                  <input type="radio" name="usertype" >Admin
                  
                  </div>
                  
                  <div class="form-group">
                     <input type="reset" class="btn btn-outline btn-primary float-right" value="login">
                    </div> 
                   
                </form>
                
            </div>
        </div>
    </div>
 
  
</body>
</html>