<%-- 
    Document   : edituser
    Created on : May 5, 2017, 5:37:49 PM
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
        
         <script language="javascript">
            function editRecord() {
                var f = document.form;
                f.method = "post";
                f.action = 'home.jsp';
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
        <c:import url="/GetSingleUserServlet" />

        <!-- Page Content -->
        <!-- User Info -->
        <div class="container">
            <div class="row vertical-offset-100">
                <div class="col-md-8 col-md-offset-2">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Edit User Information</h3>
                        </div>
                        <form class="form-horizontal">
                            <input type="hidden" name="id" value="${singleUser.id}">
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="fullName">Full Name:</label>
                                <div class="col-sm-9">
                                    <input class="form-control" data-error="Please enter full name field." placeholder="Full name" name="fullName" type="text" value="${singleUser.fullName}" required />
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="userName">User Name:</label>
                                <div class="col-sm-9">          
                                    <input class="form-control" data-error="Please enter user name field." placeholder="User name" name="username" type="text" value="${singleUser.username}" required />
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="email">E-mail:</label>
                                <div class="col-sm-9">
                                    <input class="form-control" data-error="Please enter e-mail field." placeholder="E-mail" name="email" type="email" value="${singleUser.email}" required />
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="addrerss">Address:</label>
                                <div class="col-sm-9">          
                                    <input class="form-control" data-error="Please enter address field." placeholder="Address" name="address" type="text" value="${singleUser.address}" required />
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="city">City:</label>
                                <div class="col-sm-9">
                                    <input class="form-control" data-error="Please enter city field." placeholder="City" name="city" type="text" value="${singleUser.city}" required />
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="zip">Zip:</label>
                                <div class="col-sm-9">          
                                    <input class="form-control" data-error="Please enter zip field." placeholder="Zip Code" name="zip" type="text" value="${singleUser.zipCode}" required />
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                            <div class="form-group">        
                                <div class="col-sm-offset-3 col-sm-9">
                                    <div class="checkbox">
                                        <label><input type="checkbox" id="admin" name="admin"> Admin</label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <div class="col-sm-offset-3 col-sm-9">
                                    <div class="col-sm-3">
                                        <input class="btn btn-lg btn-success btn-block" type="submit" value="Save"  onclick="form.action='UpdateUser';">
                                    </div>
                                    <div class="col-sm-6">
                                        <input class="btn btn-lg btn-warning btn-block" type="submit" value="Change Password"  onclick="form.action='changepassword.jsp';">
                                    </div>
                                </div>

                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>
        <!-- end user info -->
        <!-- /.container -->

        <script language="javascript">
            if (${singleUser.admin}) {
                document.getElementById("admin").checked = true;
            }

        </script>

        <!-- jQuery Version 1.11.1 -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>



    </body>

</html>
