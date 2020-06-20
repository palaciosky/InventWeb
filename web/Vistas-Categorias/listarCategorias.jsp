<%-- 
    Document   : 17
    Created on : 06-19-2020, 04:56:17 PM
    Author     : Palacios
--%>

<%@page import="Model.Categoria"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "Model.Categoria"%><!--Importa el modelo -->
<!--El id debe ser el mismo que le coloco de nombre a la sesion en el controlador  -->
<jsp:useBean id = "lista" scope="session" class = "java.util.List"  />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventario control</title>
        <%@include file="../WEB-INF/vistas-parciales/css-js.jspf" %>
    </head>
    <body>
        <%@include file="../WEB-INF/vistas-parciales/encabezado.jspf" %>
        <div style="width: 600px;" >
            <a href="#" class="btn btn-success btn-sm glyphicon glyphicon-pencil" role="button"  >Nueva Categoria</a>
            <h3>Listado de categorias Registradas</h3>
            <table class="table table-striped" >
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>ESTADO</th>
                        <th>ACCION</th>
                    </tr>
                    <% 
                        for (int i =0 ; i < lista.size(); i++){
                        Categoria categoria = new Categoria();
                        categoria = (Categoria)lista.get(i);//Categoria es para el casting
                        
                        
                        %>
                    <tr>
                        
                       <td> <%= categoria.getId_categoria() %> </td>
                       <td> <%= categoria.getNom_categoria() %> </td>
                       <td> <%= categoria.getEstado_categoria() %> </td>
                       <td>
                           <a href="#" class="btn btn-info btn-sm glyphicon glyphicon-edit " role="button" >Edit </a> 
                           <a href="#" class="btn btn-info btn-sm glyphicon glyphicon-remove " role="button"  >Delt </a> 
                       </td>
                    </tr>
                    <%
                       }
                    %>

                </table>
        </div>
      <%@include file="../WEB-INF/vistas-parciales/pie.jspf" %>               
    </body>
</html>
