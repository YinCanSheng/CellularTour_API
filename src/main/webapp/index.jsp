<%--
  Created by IntelliJ IDEA.
  User: 今夜犬吠
  Date: 2017/7/13
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap 实例</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/Css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="Css/system/index.css">
    <script src="Js/jquery-3.2.1.min.js"></script>
    <script src="Js/bootstrap/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row row-centered">
        <div class="col-xs-12 col-centered">
            <h3 class="text-info text-center">
                CellularTour.
            </h3>
            <div class="row clearfix">
                <div class="col-md-4 column">
                </div>
                `
                <div class="col-md-4 column">
                    <form role="form" action="/api/Account/Login" method="post">
                        <div class="form-group">
                            <label for="userNmae">用户名</label>
                            <input type="text"
                                   name="name"
                                   class="form-control"
                                   id="userNmae" placeholder="请输入用户名"/>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">密码</label>
                            <input type="password"
                                   name="passWord"
                                   class="form-control"
                                   id="exampleInputPassword1"
                                   placeholder="请输入密码"/>
                        </div>
                        <%--<div class="form-group">--%>
                        <%--<label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile"/>--%>
                        <%--<p class="help-block">--%>
                        <%--Example block-level help text here.--%>
                        <%--</p>--%>
                        <%--</div>--%>
                        <div class="checkbox">
                            <label><input type="checkbox"/>记住密码</label>
                        </div>
                        <button type="submit" class="btn btn-default">登录</button>
                        <input id="testBtn" type="button" value="测试文件上传"
                               onclick="location.href='http://localhost:8080/upload.jsp'"/>
                    </form>
                </div>
                <div class="col-md-4 column">
                </div>
            </div>
        </div>
    </div>
</div>
<%--<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"></script>--%>
<%--<script src="https://pingendo.com/assets/bootstrap/bootstrap-4.0.0-alpha.6.min.js"></script>--%>
</body>
</html>