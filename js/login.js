// Capturamos el evento de envío del formulario
document.getElementById("login").addEventListener("submit", function (event) {
    event.preventDefault(); // Evitamos que se recargue la página

    // Obtenemos los valores del formulario
    var dni = document.getElementById("dni").value;
    var clave = document.getElementById("clave").value;

    // Creamos un objeto con los datos del usuario
    var usuario = {
        dni: dni,
        clave: clave,
    };
    console.log(usuario);
    // Realizamos la solicitud POST al servidor
    url = "http://127.0.0.1:8080/api/V1/usuarios/login";
    fetch(url, {
        method: "POST",
        //mode: 'no-cors',
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(usuario),
    })
        .then(function (response) {
            if (response.ok) {
                return response.json(); // Parseamos la respuesta JSON
                window.open("index.html");
            } else {
                throw new Error("Error al ingresar al sistema!");
            }
        })
        .then(function (data) {
            alert("¡ingresó correctamente al sistema correctamente!");
            window.location = "index.html";
        })
        .catch(function (error) {
            console.log("Error:", error);
            alert("Error al registrar usuario.");
        });
});
