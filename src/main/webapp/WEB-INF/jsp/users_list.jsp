<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Users</title>
 <link href="../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../webjars/jquery/3.0.0/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <div class="card-deck mt-2">
   <div class="card">
   
    <div class="card-header" style="background:gray">
        <center><span class="font-weight-bold" style="color:black" ><b>USERS LIST</b></span></center>
    </div>
    <div class="card-body"style="background:rgb(255, 0, 0)">
     <table class="table table-striped" cellspacing="0" width="100%">
      <thead style="background:blue">
       <tr >
           <th scope="row" style="color:white"><i>USER ID</i></th>
        <th scope="row" style="color:white"><i>USER NAME</i></th>
        <th scope="row" style="color:white"><i>EMAIL</i></th>
        <th scope="row" style="color:white"><i>DATABASES</i></th>
       </tr>
      </thead>
      <tbody>
       <c:forEach items="${usersList }" var="user" >
        <tr>
        <td style="color:white"><i>${user.id}</i></td>
         <td style="color:white"><i>${user.username }</i></td>
         <td style="color:white"><i>${user.email }</i></td>
        <td style="color:white"><i>${user.dbs}</i></td>
        </tr>
       </c:forEach>
      </tbody>
     </table>
    </div>
   </div>
  </div>
 </div>
</body>
</html>