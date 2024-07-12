
// Capturamos el evento de envío del formulario
document.getElementById('registrar').addEventListener('submit', function (event) {
    event.preventDefault() // Evitamos que se recargue la página

    // Obtenemos los valores del formulario
    var apellido = document.getElementById('apellido').value
    var nombre = document.getElementById('nombre').value
    var dni = document.getElementById('dni').value
    var telefono = document.getElementById('telefono').value
    var clave = document.getElementById('clave').value

    // Creamos un objeto con los datos del usuario
    var usuario = {
        'apellido': apellido,
        'nombre': nombre,
        'dni': dni,
        'telefono': telefono,
        'rol_id':1,
        'clave':clave
    } 
    console.log(usuario)
    // Realizamos la solicitud POST al servidor
    url = 'http://127.0.0.1:8080/api/V1/usuarios'
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
                throw new Error('Error al registrar el nuevo usuario.')
            }
        })
        .then(function (data) {
            alert('¡Su usuario se creó correctamente!')
            window.location = "index.html"
        })
        .catch(function (error) {
            console.log('Error:', error)
            alert('Error al registrar usuario.')
        })
})
