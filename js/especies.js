url = 'http://127.0.0.1:8080/api/V1/plantas'
            fetch(url, {
                method: 'GET',
                redirect:'follow',
                //mode: 'no-cors',
                headers: {
                    'Content-Type': 'application/json; charset=utf-8',
                },
            })    
            .then(response => response.text())
            .then(result => mostrarData(result))
            .catch(error => console.log('error', error));

            const mostrarData = (result) => {
                let plantas = result
                sessionStorage.setItem("plantas", plantas)
            }

/*obtengo los datos desde el sessionStore para usarlos en esta página*/

let arrayPlantas = JSON.parse(sessionStorage.getItem("plantas"))
let body = ''
for (let i = 0; i < arrayPlantas.length; i++) { 
    console.log(arrayPlantas.length)
    //imagen=(arrayPlantas[i].default_image)
    body += `<div class="plant-section">
                <!------------------------------------------------Fila que contiene al producto------------------------------------------------------------------->
                <div class="row">
                    <!--------------------------------------------Columnas del producto--------------------------------------------------------------------------->
                    <div class="col-md-3">
                        <!----------------------------------------Columna de la izquierda Imagen------------------------------------------------------------------>
                        <img src="images/plantas/girasoles.jpg" alt="" class="plant-image ">
                    </div>
                    <div class="col-md-6">
                        <!----------------------------------------Columna de en medio Información----------------------------------------------------------------->
                        <div class="plant-info">
                            <!------------------------------------Filas de Información---------------------------------------------------------------------------->
                            <div class="row">
                                <!--------------------------------Fila de arriba Nombre, Descripcion-------------------------------------------------------------->
                                <h2 class="plant-name">Girasoles</h2>
                                <p class="plant-description">
                                    Es una planta herbácea anual de la familia Asteraceae, originaria de América del Norte. Es una de las flores más populares del mundo, conocida por su gran tamaño, color amarillo brillante y capacidad para seguir el movimiento del sol (heliotropismo).
                                </p>
                            </div>
                            <div class="row">
                                <!--------------------------------Fila de abajo Atributos------------------------------------------------------------------------->
                                <div class="plant-attributes">
                                    <!----------------------------Columnas de cada Atributo----------------------------------------------------------------------->
                                    <div class="col" >
                                        <!------------------------Atributo Luz solar------------------------------------------------------------------------------>
                                        <!------------------------Columna de Icono, Texto------------------------------------------------------------------------->
                                        <div class="col">
                                            <img src="images/iconos/sol.svg" alt="" class="icon-info">Luz Solar
                                        </div>
                                        <!------------------------Columna de Barras de progreso------------------------------------------------------------------->
                                        <div class="col">
                                            <!--------------------Barra de progreso------------------------------------------------------------------------------->
                                            <div class="progress" role="progressbar" aria-label="Basic example" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100">
                                                <div class="progress-bar bg-warning" style="width: 30%"></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col">
                                        <!------------------------Atributo Riego---------------------------------------------------------------------------------->
                                        <!------------------------Columna de Icono, Texto------------------------------------------------------------------------->
                                        <div class="col">
                                            <img src="images/iconos/gota.svg" alt="" class="icon-info">Riego
                                        </div>
                                        <!------------------------Columna de Barras de progreso------------------------------------------------------------------->
                                        <div class="col">
                                            <!--------------------Barra de progreso------------------------------------------------------------------------------->
                                            <div class="progress" role="progressbar" aria-label="Basic example" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100">
                                                <div class="progress-bar bg-info" style="width: 55%"></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col">
                                        <!------------------------Atributo Temperatura---------------------------------------------------------------------------->
                                        <!------------------------Columna de Icono, Texto------------------------------------------------------------------------->
                                        <div class="col">
                                            <img src="images/iconos/termometro.svg" alt="" class="icon-info">Temperatura
                                        </div>
                                        <!------------------------Columna de Barras de progreso------------------------------------------------------------------->
                                        <div class="col">
                                            <!--------------------Barra de progreso------------------------------------------------------------------------------->
                                            <div class="progress" role="progressbar" aria-label="Basic example" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100">
                                                <div class="progress-bar bg-danger" style="width: 50%"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <!----------------------------------------Columna de la izquierda Botones----------------------------------------------------------------->
                        <!----------------------------------------Icono, Texto------------------------------------------------------------------------------------>
                        <img src="images/iconos/dineromoneda.svg" alt="" class="icon-info">$30.000 ARG
                        <br>
                        <!----------------------------------------Botones----------------------------------------------------------------------------------------->
                        <button class="btn btn-info plant-button"><img src="images/iconos/dineromoneda.svg" alt=""> Comprar</button>
                        <button class="btn btn-info plant-button"><img src="images/iconos/carritoplus.svg" alt=""> Añadir</button>
                    </div>
                </div>
            </div>`
   
}
document.getElementById("listarPlantas").innerHTML = body