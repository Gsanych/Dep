<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <FORM action="/servlet/View" method="post">
      <input type="text" name="department" value="<c:if test="${department ne null}"><c:out value="${department}"/></c:if>"/></td>
      <table>
          <tr>
              <td><b>Department</b></td>
          </tr>
          <c:set var="departments" value="${ViewDep}" ></c:set>
          <c:forEach var="d" items="${departments}">
              <tr>

                  <form action="/servlet/UpdateDep" method="post">
                      <td><input type="text" value="${d.nameDep}" name="depart"/>
                      <td><input type="hidden" value="${d.id}" name="id"/>
                      <td><input type="submit" value="Update"/></td>
                  </form>
                  <form action="/servlet/DeleteDep" method="get">
                      <td><input type="hidden" value="${d.id}" name="id"/>
                      <td><input type="submit" value="Delete"/></td>
                  </form>
                  <form action="/servlet/ViewEmp" method="get">
                      <td><input type="hidden" value="${d.id}"  name="id"/>
                      <td><input type="submit" value="List"/></td>
                  </form>
              </tr>
          </c:forEach>
      <input type="submit" value="Show">
        </table>
  </FORM>
  </body>
</html>