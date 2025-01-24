<%@include file="comunes/cabesero.jsp"%>
<%@include file="comunes/navegacion.jsp"%>

<div class="container">
    <div class="text-center" style="margin-top:30px;">
        <h3>Agregar Empleado</h3>
    </div>
    <form action="${urlAgregar}" modelAttribute="empleadoForma" method="post">
        <div class="mb-3">
            <label for="nombreEmpleado" class="form-label">Nombre</label>
            <input type="text" class="form-control" id="nombreEmpleado" name="nombreEmpleado" required>
        </div>
        <div class="mb-3">
            <label for="departamento" class="form-label">Departamento</label>
            <input type="text" class="form-control" id="departamento" name="departamento" >
        </div>
        <div class="mb-3">
            <label for="sueldo" class="form-label">Sueldo</label>
            <input type="number" step="any" class="form-control" id="sueldo" name="sueldo" >
        </div>
        <div class="text-center p-1" style="background-color: #DDA853;">
            <button type="submit" class="btn btn-info btn-sm me-3">Agregar</button>
            <a href="${urlInicio}"  class="btn btn-danger btn-sm me-3">Regresar</a>
        </div>
    </form>
</div>
<%@include file="comunes/pie-pagina.jsp"%>