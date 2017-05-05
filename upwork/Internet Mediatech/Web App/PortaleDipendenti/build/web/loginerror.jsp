<%-- 
    Document   : index
    Created on : May 2, 2017, 11:28:54 PM
    Author     : Abdullah Shekhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link href="css/login.css" rel="stylesheet">

        <!-- FORM Validation -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.5/validator.min.js"></script>
        <!-- end FORM Validation -->

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
        <!-- Page Content -->
        <div class="container">

            <div class="row">
                <div class="col-lg-12 text-center">
                    <h1><span class="header">SITAV</span></h1>
                </div>
            </div>
            <!-- /.row -->
            
            <div class="row">
                <div class="col-lg-12 text-center">
                    <span style="color:red;">User name and password mismatch</span>
                </div>
            </div>
        </div>
        <!-- /.container --> 

        <!-- login -->
        <div class="container">
            <div class="row vertical-offset-100">
                <div class="col-md-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Please sign in</h3>
                        </div>
                        
                        <div class="panel-body">
                            <form accept-charset="UTF-8" role="form" method="POST" action="LoginServlet">
                                <fieldset>
                                    <div class="form-group">
                                        <input class="form-control" data-error="Please enter user name field." placeholder="User name" name="user" type="text" required />
                                        <div class="help-block with-errors"></div>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" data-error="Please enter password field." placeholder="Password" name="password" type="password" value="" required />
                                         <div class="help-block with-errors"></div>
                                    </div>
                                    <input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end login -->
        <!-- footer -->
        <div class="col-lg-12 text-center">
            <span class="footer">© 2017 SITAV</span>
        </div>
        <!-- end footer -->

        <!-- jQuery Version 1.11.1 -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

    </body>

</html>

