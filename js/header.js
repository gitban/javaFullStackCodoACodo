document.addEventListener("DOMContentLoaded", function () {

    var encabezado = this.getElementById("cabecera")
    let head = `
            <!----------------------------------------------------Navbar de Boostrap----------------------------------------------------------------------->
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid" id="contenedorNav">
                <a class="nav-link active" aria-current="page" href="index.html">
                    <img src="images/logo.png" alt="Logo" width="30" height="24" class="d-inline-block align-text-top">
                    El Eden
                </a>
                <!--------------------------------------------Boton para el responsive----------------------------------------------------------------->
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <!--------------------------------------------Cabecera de la Pagina-------------------------------------------------------------------->
                <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" href="plantas.html">Plantas</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Arboles</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Huerta</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Flores</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="login.html">Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

`
encabezado.innerHTML = head
    console.log(document.getElementById("cabecera").id)

})

