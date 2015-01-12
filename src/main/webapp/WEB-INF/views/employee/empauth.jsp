<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Log In</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

  <div class="body">
    <form role="form">
      <div class="form-group">
        <label>Email address</label>
        <input type="email" class="form-control" id="username" placeholder="Enter email">
      </div>
      <div class="form-group">
        <label>Password</label>
        <input type="password" class="form-control" id="password" placeholder="Password">
      </div>

      <button type="submit" class="btn btn-default">Submit</button>
    </form>
  </div>
</div>
</body>
</html>
