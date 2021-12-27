<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>javaguides.net</title>

</head>
<body>
<div class="container">
    <div class="col-md-offset-1 col-md-10">
        <hr />

        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Danh sách bài đăng</div>
            </div>
            <div class="panel-body">
                <table class="table table-striped table-bordered">
                    <tr>
                        <th>STT</th>
                        <th>Title</th>
                        <th>Author</th>
                        <th>OriginalResource</th>
                    </tr>

                    <!-- loop over and print our customers -->
                    <c:forEach var="news" items="${newResponse}">

                        <tr>
                            <td>${news.id}</td>
                            <td>${news.title}</td>
                            <td>${news.author}</td>
                            <td>${news.originalResource}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>