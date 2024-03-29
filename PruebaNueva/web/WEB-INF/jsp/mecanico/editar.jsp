<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title><s:message code="libro.nuevo"/></title>
        <jsp:include page="/WEB-INF/jsp/cabecera.jsp"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/css/select2.min.css"
              rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/js/select2.min.js"></script>
    </head>
    <body>
        <jsp:include page="/WEB-INF/jsp/menu.jsp"/>
        <div class="container">
            <div class="row">
                <h3>Nuevo Cliente</h3>
            </div>
            <div class="row">
                <div class=" col-md-7">
                    <f:form action="create" 
                            modelAttribute="libro" method="post">
                        <f:errors cssClass="alert alert-danger" element="div" path="*" />
                        <div class="well well-sm"><strong><span class="glyphicon glyphicon-asterisk"></span>Campos requeridos</strong></div>
                        <div class="form-group">
                            <label for="nombreusu">Nombre Usuario:</label>
                            <div class="input-group">
                                <f:input path="nombreusu" cssClass="form-control"/>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password">password:</label>
                            <div class="input-group">
                                <f:input path="password" cssClass="form-control"/>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="nombre">Nombre:</label>
                            <div class="input-group">
                                <f:input path="nombre" cssClass="form-control"/>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="telefono">Telefono:</label>
                            <div class="input-group">
                                <f:input path="telefono" cssClass="form-control"/>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="telefono2">Telefono Dos:</label>
                            <div class="input-group">
                                <f:input path="telefono2" cssClass="form-control"/>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="dui">Dui:</label>
                            <div class="input-group">
                                <f:input path="dui" cssClass="form-control"/>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="nit">Nit:</label>
                            <div class="input-group">
                                <f:input path="nit" cssClass="form-control"/>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            </div>
                        </div>
                        <f:button class="btn btn-info">Guardar</f:button>
                        <a class="btn btn-danger" href="<s:url value="/mecanico/list"/>">Cancelar</a>
                    </f:form>
                </div>
            </div>
        </div>
        <script>
            $('#autor').select2();
        </script>
        <jsp:include page="/WEB-INF/jsp/pie.jsp"/>
    </body>
</html>
