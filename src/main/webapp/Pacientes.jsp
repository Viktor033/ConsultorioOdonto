<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Components/headJSP.jsp"%>
<%@ include file="Components/navBar.jsp"%>

<div class="botones-barra">
    <!-- Botón Agregar Paciente -->
    <button class="action-btn agregar-paciente-btn">
        <i class="fas fa-plus"></i>
    </button>
    
    <!-- Botón Modificar -->
    <button class="action-btn modificar-paciente-btn">
        <i class="fas fa-edit"></i>
    </button>
    
    <!-- Botón Eliminar -->
    <button class="action-btn eliminar-paciente-btn">
        <i class="fas fa-trash"></i>
    </button>
    
    <!-- Botón Buscar -->
    <button class="action-btn buscar-btn">
        <i class="fas fa-search"></i>
    </button>
    
    <!-- Botón Imprimir -->
    <button class="action-btn imprimir-btn">
        <i class="fas fa-print"></i>
    </button>
</div>

<%@ include file="Components/footer.jsp"%>
        
    </body>
</html>

