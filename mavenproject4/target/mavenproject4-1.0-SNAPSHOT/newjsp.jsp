<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Libros</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h2>Listado de Libros</h2>
        
        <div class="table-responsive mt-3">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Título</th>
                        <th>Autor</th>
                        <th>ISBN</th>
                        <th>Tipo de Pasta</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="libro" items="${libros}">
                        <tr>
                            <td>${libro.id}</td>
                            <td>${libro.titulo}</td>
                            <td>${libro.autor}</td>
                            <td>${libro.isbn}</td>
                            <td>${libro.tipoPasta.descripcion}</td>
                            <td>
                                <button class="btn btn-sm btn-warning" onclick="editarLibro(${libro.id})">Editar</button>
                                <button class="btn btn-sm btn-danger" onclick="eliminarLibro(${libro.id})">Eliminar</button>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.2/js/bootstrap.bundle.min.js"></script>
    <script>
        function editarLibro(id) {
            // Implementar lógica de edición
            alert('Editar libro ' + id);
        }
        
        function eliminarLibro(id) {
            if (confirm('¿Está seguro de que desea eliminar este libro?')) {
                // Implementar lógica de eliminación
                alert('Eliminar libro ' + id);
            }
        }
    </script>
</body>
</html>