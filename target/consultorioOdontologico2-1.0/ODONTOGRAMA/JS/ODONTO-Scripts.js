    // Función para cambiar el color de la sección al hacer clic
    function cambiarColor(event) {
        const seccion = event.target;

        // Alternar entre diferentes clases de tratamiento
        if (seccion.classList.contains('normal')) {
            seccion.classList.remove('normal');
            seccion.classList.add('tratamiento1');  // Cambia a color rojo
        } else if (seccion.classList.contains('tratamiento1')) {
            seccion.classList.remove('tratamiento1');
            seccion.classList.add('tratamiento2');  // Cambia a color azul
        } else if (seccion.classList.contains('tratamiento2')) {
            seccion.classList.remove('tratamiento2');
            seccion.classList.add('tratamiento3');  // Cambia a color verde
        } else {
            seccion.classList.remove('tratamiento3');
            seccion.classList.add('normal');  // Vuelve al color blanco
        }
    }

    // Añadir el evento de clic a cada sección
    const secciones = document.querySelectorAll('.seccion');
    secciones.forEach(seccion => {
        seccion.addEventListener('click', cambiarColor);
    });