<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>All Clients</h2>
<br>

<table>
    <tr>
        <th>Company</th>
        <th>Department</th>
        <th>Position</th>
        <th>Surname</th>
        <th>Name</th>
        <th>Patronymic</th>
        <th>Phone</th>
        <th>Mail</th>
        <th>Operations</th>

    </tr>

    <c:forEach var="Clients" items="${allClients}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="clId" value="${Clients.id}"/>

        </c:url>

        <c:url var="deleteButton" value="/deleteMyClients">
            <c:param name="clId" value="${Clients.id}"/>

        </c:url>

        <tr>
            <td>${Clients.company}</td>
            <td>${Clients.department}</td>
            <td>${Clients.position}</td>
            <td>${Clients.surname}</td>
            <td>${Clients.name}</td>
            <td>${Clients.patronymic}</td>
            <td>${Clients.phone}</td>
            <td>${Clients.mail}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'"/>
          
                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>

</table>
<br>

<input type="button" value="Add"
       onclick="window.location.href = 'addNewClient'"/>

</body>
</html>