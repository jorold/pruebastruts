<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<header>
            <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
                <a class="navbar-brand" href="#">Struts jsp</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <!--<a class="nav-link" href="webdepartamentos.jsp">-->
                            <html:link href="webdepartamentos.jsp" styleClass="nav-link">
                                Departamentos
                                <span class="sr-only">(current)</span>
                            </html:link>
                            <!--</a>-->
                        </li>
                        <li class="nav-item active">
                            <html:link href="webeliminardepartamento.jsp" styleClass="nav-link">
                            <!--<a class="nav-link" href="#">-->
                                Eliminar Departamento
                                <span class="sr-only">(current)</span>
                            </html:link>
                            <!--</a>-->
                        </li>
                        <li class="nav-item active">
                            <html:link href="webinsertardepartamento.jsp" styleClass="nav-link">                            
                                Insertar Departamento
                                <span class="sr-only">(current)</span>
                            </html:link>                            
                        </li>
                    </ul>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="text" placeholder="Buscar" aria-label="Search">
                        <button class="btn btn-secondary my-2 my-sm-0" type="submit">Buscar</button>
                    </form>
                </div>
            </nav>            
        </header>
