//BOTON CREAR PRODUCTO
let btnAbrirCrearProducto = document.querySelector("#btn-crearProducto");
let btnCerrarCrearProducto = document.querySelector("#btn-regresar-producto");
let formularioCrearProducto = document.querySelector("#formulario-crear");

btnAbrirCrearProducto.addEventListener("click", ()=>{
    formularioCrearProducto.showModal();
});

btnCerrarCrearProducto.addEventListener("click", ()=>{
    formularioCrearProducto.close();
});

//BOTON INCREMENTAR PRODUCTO
let btnAbrirAumentarProducto = document.querySelector("#btn-incrementar");
let btnCerrarAumentarProducto = document.querySelector("#btn-regresar-aumentar");
let formularioAumentarProducto = document.querySelector("#formulario-aumentar");

btnAbrirAumentarProducto.addEventListener("click", ()=>{
    formularioAumentarProducto.showModal();
})

btnCerrarAumentarProducto.addEventListener("click", ()=>{
    formularioAumentarProducto.close();
})

//BOTON DECREMENTAR PRODUCTO
let btnAbrirQuitarProducto = document.querySelector("#btn-decrementar");
let btnCerrarQuitarProducto = document.querySelector("#btn-regresar-quitar");
let formularioQuitarProducto = document.querySelector("#formulario-quitar");

btnAbrirQuitarProducto.addEventListener("click", ()=>{
    formularioQuitarProducto.showModal();
});

btnCerrarQuitarProducto.addEventListener("click", ()=>{
    formularioQuitarProducto.close();
});

//BOTON ELIMINAR PRODUCTO
let btnAbrirEliminarProducto = document.querySelector("#btn-eliminar");
let btnCerrarEliminarProducto = document.querySelector("#btn-regresar-eliminar");
let formularioEliminarProducto = document.querySelector("#formulario-eliminar");

btnAbrirEliminarProducto.addEventListener("click", ()=>{
    formularioEliminarProducto.showModal();
});

btnCerrarEliminarProducto.addEventListener("click", ()=>{
    formularioEliminarProducto.close();
});

let btnPaginaPrincipal = document.querySelector("#btn-inicio");

btnPaginaPrincipal.addEventListener("click", ()=>{
    window.location = "index.html";
})

document.addEventListener("DOMContentLoaded", function() {
    console.log('DOM fully loaded and parsed');
    fetch('http://localhost:8080/api/productos') // Corregido el endpoint
        .then(response => response.json())
        .then(data => {
            console.log(data);
            const table = document.querySelector('table tbody'); // Selecciona el tbody en lugar de la tabla directamente
            data.forEach(product => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${product.codigoProducto}</td>
                    <td>${product.productDescription}</td>
                    <td>${product.uniPrice}</td>
                    <td>${product.cantidad}</td>
                    <td>${product.total}</td>
                `;
                table.appendChild(row);
            });
        })
        .catch(error => console.error('Error fetching data:', error));
});
