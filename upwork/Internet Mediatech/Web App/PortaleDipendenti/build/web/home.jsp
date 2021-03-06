<%-- 
    Document   : home
    Created on : May 3, 2017, 5:53:11 PM
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

    </head>

    <body>
        <%@ include file="menu.jspf" %>
        <c:import url="/DocumentList" />
        <!-- Page Content -->
        <div class="container">

            <div class="row">
                <div class="col-md-4">
                    <p>
                        Benvenuto <span style="color:green;">MATTEO ABRILE</span><br>
                        Via Giuseppe Casaregis 31/22 <br>
                        Genova<br>
                        16129
                    </p>
                </div>
                <div class="col-md-8">
                    <h1>Portale Dipendenti</h1>
                    <table style="width: 100%;" class="table table-hover table-inverse">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Document Name</th>

                            </tr>
                        </thead>
                        <tbody>
                            <%! int row = 0;%> 
                            <c:forEach items="${allDocuments}" var="stud">
                                <tr>
                                    <th scope="row"><%= row = row + 1%></th>
                                    <td>${stud.name}</td>

                                    <td><button type="button" class="btn btn-warning" name="edit" value="Download"onclick="location.href='${stud.downloadLink}';">Download</button></td>

                                </tr>
                            </c:forEach>
                            <% row = 0;%>
                        </tbody>
                    </table>
                </div>

            </div>
            <!-- /.row -->

        </div>
        <!-- /.container -->

        <!-- jQuery Version 1.11.1 -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>



    </body>

</html>
