<%-- 
    Document   : verOdontologos
    Created on : 9 oct 2024, 08:27:33
    Author     : vikdu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultorio Odontologico</title>
        <!-- Enlace al archivo CSS -->
        <link rel="stylesheet" href="CSS/Style.css">
        <!-- FontAwesome para los íconos -->
        <script src="https://kit.fontawesome.com/ca702ea505.js" crossorigin="anonymous"></script>
    </head>
    <body>
    <div class="principal">
        <!-- Sidebar de navegación -->
        <div class="sidebar">
            <h2><i class="fa-sharp fa-solid fa-tooth"></i> Consultorio Odontologico</h2>
            <ul>
                <li><a href="index.jsp"><i class="fas fa-home"></i> Inicio</a></li>

                <!-- Item Odontólogos con submenú desplegable -->
                <li class="has-submenu">
                    <a href="#" class="toggle-btn">
                        <i class="fas fa-user-md"></i> Odontólogos 
                        <i class="fas fa-chevron-down arrow-icon"></i> <!-- Icono de la flecha -->
                    </a>
                    <ul class="submenu">
                        <li><a href="verOdontologos.jsp">Ver Odontólogos</a></li>
                        <li><a href="">Alta Odontologo</a></li>
                    </ul>
                </li>

                <!-- Submenú de Pacientes -->
                <li class="has-submenu">
                    <a href="#" class="toggle-btn">
                        <i class="fas fa-users"></i> Pacientes 
                        <i class="fas fa-chevron-down arrow-icon"></i> <!-- Icono de la flecha -->
                    </a>
                    <ul class="submenu">
                        <li><a class="buscar-paciente" href="">Ver Pacientes</a></li>
                        <li><a class="alta-paciente" href="">Alta Paciente</a></li>
                    </ul>
                </li>
                
                <li><a href="#dondeEstamos"><i class="fas fa-map-marker-alt"></i> Dónde Estamos</a></li>
                <li><a href="#contacto"><i class="fas fa-envelope"></i> Contactos</a></li>
            </ul>
        </div>
        
        <!-- Contenedor principal Btn -->
        <div class="container-btn">
            <!--  contenido principal y el botón 
            <div class="botones-agregar">
                <a class="alta-odontologo-btn" href="altaOdontologo.jsp">
                    <div class="button-container">
                        <span class="circle"><i class="fas fa-plus"></i></span>
                        <span class="button-text">Alta Odontólogo</span>
                    </div>
            </div> 
        </div>
        <!-- Enlace al archivo JavaScript -->
        <script src="JS/scripts.js"></script>
    </body>
</html>