// Seleccionar todos los botones que despliegan submenús
document.querySelectorAll('.toggle-btn').forEach(function (btn) {
    btn.addEventListener('click', function () {
        // Seleccionar el submenú correspondiente al botón
        const submenu = this.nextElementSibling;

        // Alternar visibilidad del submenú
        submenu.style.display = submenu.style.display === 'block' ? 'none' : 'block';
        
        // Alternar la clase 'active' para el botón (opcional, si quieres cambiar el estilo del botón)
        this.classList.toggle('active');

        // Seleccionar el icono de la flecha dentro del botón y alternar entre 'fa-chevron-down' y 'fa-chevron-up'
        const arrowIcon = this.querySelector('.arrow-icon');
        if (submenu.style.display === 'block') {
            arrowIcon.classList.remove('fa-chevron-down');
            arrowIcon.classList.add('fa-chevron-up');
        } else {
            arrowIcon.classList.remove('fa-chevron-up');
            arrowIcon.classList.add('fa-chevron-down');
        }
    });
});


document.querySelectorAll('.submenu').forEach(function (submenu) {
    submenu.style.display = 'none';
});


