<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Client Info</h2>
<br>

<form:form action="saveClient" modelAttribute="myClients">

    <form:hidden path="id"/>

    Company <form:input path="company"/>
    <br><br>
    Department <form:input path="department"/>
    <br><br>
    Position <form:input path="position"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Name <form:input path="name"/>
    <br><br>
    Patronymic <form:input path="patronymic"/>
    <br><br>
    Phone <form:input path="phone"/>
    <br><br>
    Mail <form:input path="mail"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>


</body>


</html>