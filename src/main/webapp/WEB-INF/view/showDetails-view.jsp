<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>Welcome!</h2>
<br>

Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department is: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Your language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">

        <li> ${lang} </li>

    </c:forEach>
</ul>
<br>
Phone: ${employee.phoneNumber}
<br>
Email: ${employee.email}

</body>
</html>