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
                    <h1>INSERTAR DEPARTAMENTO</h1>
                    <html:form action="/ActionInsertarDepartamento">
                        <label>Número departamento</label>
                        <html:text property="numero" styleClass="form-control"/>                   
                        <label>Nombre</label>
                        <html:text property="nombre" styleClass="form-control"/>                    
                        <label>Localidad</label>
                        <html:text property="localidad" styleClass="form-control"/>
                        <button class="btn btn-outline-dark">Insertar</button>
                    </html:form>

                </div>

            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>

