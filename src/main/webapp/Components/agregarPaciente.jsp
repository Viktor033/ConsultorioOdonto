<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Paciente</title>
    <link rel="stylesheet" href="../CSS/Style.css">
</head>
<body>
    <div class="form-background">
        <div class="form-container">
            <h2>Agregar Paciente</h2>
            <form action="procesarPaciente.jsp" method="POST" autocomplete="off">
                <label for="dni">DNI:</label>
                <input type="text" id="dni" name="dni" required>

                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre" required>

                <label for="apellido">Apellido:</label>
                <input type="text" id="apellido" name="apellido" required>

                <label for="telefono">Teléfono:</label>
                <input type="text" id="telefono" name="telefono" required>

                <label for="direccion">Dirección:</label>
                <input type="text" id="direccion" name="direccion" required>

                <label for="fechaNacimiento">Fecha de Nacimiento:</label>
                <input type="date" id="fechaNacimiento" name="fechaNacimiento" required>

                <label for="descripcion">Descripción:</label>
                <textarea id="descripcion" name="descripcion" rows="4" placeholder="Detalles adicionales..."></textarea>

                <div class="form-buttons">
                    <button type="submit" class="form-action-btn form-action-btn-guardar">Guardar</button>
                    <button type="reset" class="form-action-btn form-action-btn-cancelar">Cancelar</button>
                    <button type="submit" class="form-action-btn form-action-btn-reset">Borrar</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
