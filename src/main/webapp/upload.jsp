<%--
  Created by IntelliJ IDEA.
  User: 今夜犬吠
  Date: 2017/8/23
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/Css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="Css/system/index.css">
    <script src="Js/jquery-3.2.1.min.js"></script>
    <script src="Js/bootstrap/bootstrap.min.js"></script>
    <title>文件上传实例</title>
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
                <div class="col-md-4 column">
                    <form method="post" action="/api/Log/unite" enctype="multipart/form-data" accept-charset="utf-8">
                        请选择测试文件<br/><br/>
                        <input type="file" name="file"/>
                        <br/><br/>
                        <input type="submit" value="上传"/>
                    </form>
                </div>
                <div class="col-md-4 column">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
