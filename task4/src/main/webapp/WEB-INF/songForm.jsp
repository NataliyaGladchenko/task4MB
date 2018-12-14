<%@ page language="java" contentType="text/html;
charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>SONGS</title>
    <style type="text/css">
        fieldset {
            border: 1px solid #dedede;
        }

        legend {
            font-size: 20px;
            text-transform: uppercase;
        }

        .error {
            color: red;
        }

        .resltTable {
            width: 50%;
            border-collapse: collapse;
            border-spacing: 0px;
        }

        .resltTable td, .resltTable th {
            border: 1px solid #565454;
        }
    </style>
</head>
<body>
<fieldset>
    <legend>Song Input From</legend>
    <form:form action="saveSong" method="post" modelAttribute="song">
        <table>
            <tr>
                <th>songName</th>
                <td>
                    <form:input path="songName" />
                    <form:errors path="songName" cssClass="error" />
                </td>
                <th>duration</th>
                <td>
                    <form:input path="duration" />
                    <form:errors path="duration" cssClass="error" />
                </td>
                <td><button type="submit">Submit</button></td>
            </tr>
        </table>
    </form:form>
</fieldset>
<br>
<br>

<fieldset>
    <legend>Songs List</legend>
    <table class="resltTable">
        <tr>
            <th>Song Name</th>
            <th>Duration</th>
        </tr>
        <c:forEach items="${songs}" var="song">
            <tr>
                <td>${song.songName}</td>
                <td>${song.duration}</td>
            </tr>
        </c:forEach>

    </table>
</fieldset>

</body>
</html>