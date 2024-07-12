
// Capturamos el evento de envío del formulario
document.getElementById('registrarEspecie').addEventListener('submit', function (event) {
    event.preventDefault() // Evitamos que se recargue la página

    // Obtenemos los valores del formulario
    var nombre = document.getElementById('nombre').value
    var especie = document.getElementById('especie').value
    var descripcion = document.getElementById('descripcion').value
    var imagen = document.getElementById('imagen').value
    var sol = document.getElementById('sol').value
    var agua = document.getElementById('agua').value
    var temperatura = document.getElementById('temperatura').value
    var precio = document.getElementById('precio').value
    
    // Creamos un objeto con los datos de la planta
    var usuario = {
        'nombre': nombre,
        'especie': especie,
        'descripcion': descripcion,
        'imagen':imagen,
        'sol':sol,
        'agua':agua,
        'temperatura':temperatura,
        'precio':precio
    } 
    console.log(usuario)
    // Realizamos la solicitud POST al servidor
    url = 'http://127.0.0.1:8080/api/V1/plantas'
    fetch(url, {
        method: 'POST',
        //mode: 'no-cors',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(usuario)
    })
        .then(function (response) {
            if (response.ok) {
                return response.json() // Parseamos la respuesta JSON
            } else {
                throw new Error('Error al agregar.')
            }
        })
        .then(function (data) {
            alert('¡se agregó correctamente!')
            window.location = "plantas.html"
        })
        .catch(function (error) {
            console.log('Error:', error)
            alert('Error al agregar.')
        })
})
