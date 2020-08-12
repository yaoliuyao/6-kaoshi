<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>学生管理系统</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/aa.css">
</head>
<body>

<h3>学生信息管理系统</h3>

<div class="mohu">
    <form action="${pageContext.request.contextPath}/like" method="post">
        <span>条件</span>
        <input name="cond">
        <input type="submit" value="模糊搜索">
    </form>
</div>

<div class="main">
    <c:if test="${empty students}">
        数据不存在
    </c:if>
    <c:if test="${students != null}">
        <table>
            <tr>
                <td>${stu.no}</td>
                <td>${stu.name}</td>
                <td>${stu.sex}</td>
                <td>${stu.age}</td>
                <td>${stu.score}</td>
                <td>${stu.regTime}</td>
            </tr>
            <c:forEach var="stu" items="${students}">
                <tr>
                    <td>${stu.no}</td>
                    <td>${stu.name}</td>
                    <td>${stu.sex}</td>
                    <td>${stu.age}</td>
                    <td>${stu.score}</td>
                    <td>${stu.regTime}</td>
                    <td>
                        <a href="#">修改</a> |
                        <a href="${pageContext.request.contextPath}/del?no=${stu.no}" class="del">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>

<script>
    document.querySelector(".del").addEventListener("click", (e) => {
        if (!confirm("是不是要删除TA?")) {
            e.preventDefault();
        }
    });
</script>

</body>
</html>
