<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" 
        rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" 
        crossorigin="anonymous">
        <title>STRUTS Page</title>
    </head>
    <body>
        <h1>DEPARTAMENTOS</h1>
        <html:link href="webeliminardepartamento.jsp">Eliminar Departamento</html:link>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Número</th>
                    <th>Nombre</th>
                    <th>Localidad</th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="LISTDEPARTAMENTOS" id="dept">
                    <tr>
                        <td><bean:write name="dept" property="numero"/></td>
                        <td><bean:write name="dept" property="nombre"/></td>
                        <td><bean:write name="dept" property="localidad"/></td>
                    </tr>
                </logic:iterate>
            </tbody>
        </table>
    </body>
</html>
