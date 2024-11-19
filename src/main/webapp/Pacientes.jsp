<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Components/headJSP.jsp"%>
<%@ include file="Components/navBar.jsp"%>

<div class="botones-barra">
    <button class="action-btn action-btn-agregar" title="Agregar" onclick="abrirFormulario()">
        <i class="fa fa-plus"></i>
    </button>
    <button class="action-btn action-btn-modificar" title="Modificar">
        <i class="fa fa-edit"></i>
    </button>
    <button class="action-btn action-btn-eliminar" title="Eliminar">
        <i class="fa fa-trash"></i>
    </button>
    <button class="action-btn action-btn-buscar" title="Buscar">
        <i class="fa fa-search"></i>
    </button>
    <button class="action-btn action-btn-imprimir" title="Imprimir">
        <i class="fa fa-print"></i>
    </button>
</div>

<script>
    function abrirFormulario() {
        window.location.href = "Components/agregarPaciente.jsp";
    }
</script>


<%@ include file="Components/footer.jsp"%>

</html>

