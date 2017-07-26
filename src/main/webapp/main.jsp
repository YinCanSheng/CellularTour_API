<%--
  Created by IntelliJ IDEA.
  User: 今夜犬吠
  Date: 2017/7/13
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/Css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="Css/system/index.css">
    <script src="Js/jquery-3.2.1.min.js"></script>
    <script src="Js/bootstrap/bootstrap.min.js"></script>
</head>
<body style="height: 350px">
<div class="container">
    <div class="row clearfix">
        <div class="col-md-1 column">
        </div>

        <div class="col-md-10 column">

            <div class="col-md-12">
                <div class="col-md-8">
                    <div class="page-header">
                        <h3>
                            CellularTour
                            <small>蜂窝探路者</small>
                        </h3>
                    </div>
                </div>
                <div class="col-md-4" style="text-align: center">
                    <a id="modal-875643" href="#modal-container-875643" role="button" class="btn"
                       data-toggle="modal">注销</a>
                    <a href="#modal-container-875643" role="button" class="btn"
                       data-toggle="modal">关于</a>
                    <div class="modal fade" id="modal-container-875643" role="dialog" aria-labelledby="myModalLabel"
                         aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
                                    </button>
                                    <h4 class="modal-title" id="myModalLabel">
                                        注销
                                    </h4>
                                </div>
                                <div class="modal-body">
                                    您即将离开
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                    <button type="button" class="btn btn-primary">离开</button>
                                </div>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
            <br>
            <div class="tabbable" id="tabs-518149">
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a href="#panel-http" data-toggle="tab">http</a>
                    </li>
                    <li>
                        <a href="#panel-ping" data-toggle="tab">ping</a>
                    </li>
                    <li>
                        <a href="#panel-dns" data-toggle="tab">dns</a>
                    </li>
                    <li>
                        <a href="#panel-road" data-toggle="tab">路测</a>
                    </li>
                    <li>
                        <a href="#panel-roompPoints" data-toggle="tab">室分测试</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane " id="panel-dns">
                        <p> dns测试结果</p>
                    </div>
                    <div class="tab-pane" id="panel-http">
                        <p> http测试结果</p>
                    </div>
                    <div class="tab-pane active" id="panel-road">
                        <p>
                        <table class="table table-hover table-striped">
                            <thead>
                            <tr>
                                <th>
                                    时间
                                </th>
                                <th>
                                    SINR
                                </th>
                                <th>
                                    RSRP
                                </th>
                                <th>
                                    RSRQ
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>
                                    1
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    01/04/2012
                                </td>
                                <td>
                                    Default
                                </td>
                            </tr>
                            <tr class="success">
                                <td>
                                    1
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    01/04/2012
                                </td>
                                <td>
                                    Approved
                                </td>
                            </tr>
                            <tr class="error">
                                <td>
                                    2
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    02/04/2012
                                </td>
                                <td>
                                    Declined
                                </td>
                            </tr>
                            <tr class="warning">
                                <td>
                                    3
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    03/04/2012
                                </td>
                                <td>
                                    Pending
                                </td>
                            </tr>
                            <tr class="info">
                                <td>
                                    4
                                </td>
                                <td>
                                    TB - Monthly
                                </td>
                                <td>
                                    04/04/2012
                                </td>
                                <td>
                                    Call in to confirm
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <ul class="pagination pagination-sm">
                            <li>
                                <a href="#">Prev</a>
                            </li>
                            <li>
                                <a href="#">1</a>
                            </li>
                            <li>
                                <a href="#">2</a>
                            </li>
                            <li>
                                <a href="#">3</a>
                            </li>
                            <li>
                                <a href="#">4</a>
                            </li>
                            <li>
                                <a href="#">5</a>
                            </li>
                            <li>
                                <a href="#">Next</a>
                            </li>
                        </ul>
                        </p>
                    </div>
                    <div class="tab-pane" id="panel-roompPoints">
                        <p>
                            室内测试结果
                        </p>
                    </div>
                    <div class="tab-pane" id="panel-ping">
                        <p>
                            ping测试结果
                        </p>
                    </div>
                </div>
            </div>


        </div>
        <div class="col-md-1 column">

        </div>
    </div>

</div>
</body>
</html>