<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="/Components/headJSP.jsp" %>
<%@ include file="/Components/BarraSup.jsp" %>
<%@ include file="/Components/navBar.jsp" %>

<link rel="stylesheet" href="../CSS/Style.css">
<body>
    <div class="main-content">
        <div class="form-background">
            <div class="form-container">
                <h2>Agregar Paciente</h2>
                <form action="procesarPaciente.jsp" method="POST" autocomplete="off">
                    <!-- Agrupando los campos en divs para mejor alineación -->
                    <div class="form-row">
                        <div class="form-group">
                            <label for="dni">DNI:</label>
                            <input type="text" id="dni" name="dni" placeholder="lo numerito eso laaargo" required>
                        </div>
                        <div class="form-group">
                            <label for="nombre">Nombre:</label>
                            <input type="text" id="nombre" name="nombre" placeholder="como t llama he" required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group">
                            <label for="apellido">Apellido:</label>
                            <input type="text" id="apellido" name="apellido" placeholder="Hijo de quien pa so vo" required>
                        </div>
                        <div class="form-group">
                            <label for="telefono">Teléfono:</label>
                            <input type="text" id="telefono" name="telefono" placeholder="Tene la Hora Ñeri?" required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group">
                            <label for="direccion">Dirección:</label>
                            <input type="text" id="direccion" name="direccion" placeholder="Donde VIVI NAEEEE" required>
                        </div>
                        <div class="form-group">
                            <label for="fechaNacimiento">Fecha de Nacimiento:</label>
                            <input type="date" id="fechaNacimiento" name="fechaNacimiento" placeholder="DD-MM-AAAA" required>
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group">
                            <label for="obraSocial">Seguro medico:</label>
                            <input type="text" id="obraSocial" name="obraSocial" placeholder="tu seguro medico pui" required>
                        </div>
                        <div class="form-group">
                            <label for="tutor">Tutor:</label>
                            <input type="text" id="tutor" name="tutor" placeholder="Quien t Trajo?" required>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="descripcion">Descripción:</label>
                        <textarea id="descripcion" name="descripcion" rows="100" cols="100" placeholder="Detalles adicionales..."></textarea>
                    </div>
                    <!-- Botones -->
                    <div class="form-buttons">
                        <button type="submit" class="form-action-btn-guardar">Guardar</button>
                        <button type="reset" class="form-action-btn-cancelar">Cancelar</button>
                        <button type="button" class="form-action-btn-reset">Borrar</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
<%@ include file="/Components/footer.jsp" %>
