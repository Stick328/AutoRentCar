// Seleccionar elementos del DOM
const btnIniciarSesion = document.querySelector('.btn-danger');
const modal = document.querySelector('.modal');
const cerrarModal = document.querySelector('.cerrar');

// Abrir el modal al hacer clic en el botón "Iniciar Sesión"
btnIniciarSesion.addEventListener('click', () => {
    modal.style.display = 'flex';
});

// Cerrar el modal al hacer clic en la "X"
cerrarModal.addEventListener('click', () => {
    modal.style.display = 'none';
});

// Cerrar el modal si se hace clic fuera del contenido
window.addEventListener('click', (event) => {
    if (event.target === modal) {
        modal.style.display = 'none';
    }
});