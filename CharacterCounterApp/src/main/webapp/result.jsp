<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Kết quả</title></head>
<body>
    <h2>Kết quả:</h2>
    <p>Chuỗi nhập: ${input}</p>
    <p>Số ký tự: ${count}</p>

    <c:if test="${count > 10}">
        <p style="color:red;">Chuỗi có độ dài lớn hơn 10!</p>
    </c:if>

    <a href="index.html">Nhập lại</a>
</body>
</html>
