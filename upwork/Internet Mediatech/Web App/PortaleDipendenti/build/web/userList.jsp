<%-- 
    Document   : userList
    Created on : May 4, 2017, 4:28:47 PM
    Author     : Abdullah Shekhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    if (session.getAttribute("loginName") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Portale Dipendenti</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <style>
            body {
                padding-top: 70px;
                /* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
            }
        </style>

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <script language="javascript">
            function editRecord(id) {
                var f = document.form;
                f.method = "post";
                f.action = 'edituser.jsp?id=' + id;
                f.submit();
            }
            function deleteRecord(id) {
                var f = document.form;
                f.method = "post";
                f.action = 'delete.jsp?id=' + id;
                f.submit();
            }
        </script>

    </head>

    <body>

        <%@ include file="menu.jspf" %>

        <!-- Page Content -->
        <div class="container">
            <div class="col-lg-12 text-center">
                <h1>User List</h1>
            </div>
            <!-- /.row -->
            <c:import url="/UserList" />
            <form method="post" name="form">
                <table style="width: 100%;" class="table table-hover table-inverse">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Full Name</th>
                            <th>User Name</th>
                            <th>E-mail</th>
                            <th>Address</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%! int row = 0;%> 
                        <c:forEach items="${allUsers}" var="stud">
                            <tr>
                                <th scope="row"><%= row = row + 1%></th>
                                <td>${stud.fullName}</td>
                                <td>${stud.username}</td>
                                <td>${stud.email}</td>
                                <td>${stud.address}</td>
                                
                                <td><button type="button" class="btn btn-warning" name="edit" value="Edit"onclick="editRecord(${stud.id});">Edit</button></td>
                                <td><button type="button" class="btn btn-danger">Delete</button></td>
                            </tr>
                        </c:forEach>
                        <% row = 0;%>
                    </tbody>
                </table>
            </form>

            <!-- /.row -->

        </div>


        <!-- /.container -->

        <!-- jQuery Version 1.11.1 -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

    </body>

</html>
