<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/webhead.jsp"/>
        <title>JSP-STRUTS Page</title>
    </head>
    <body>
        <jsp:include page="includes/webmenu.jsp"/>
        <section>
            <main role="main" class="container">

                <div class="starter-template">
                    <h1>ELIMINAR DEPARTAMENTO</h1>
                    <html:form action="/ActionEliminarDepartamento"><label>Eliminar Departamento</label>
                        <html:text property="deptno"/>
                        <button type="submit" class="btn btn-outline-danger">Eliminar Departamento</button>
                    </html:form>


                </div>

            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>










