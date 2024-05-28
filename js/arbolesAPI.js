url = 'https://perenual.com/api/species-list?key=sk-ipG06655d8ec042e35685'
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

let arrayPlantas = JSON.parse(sessionStorage.getItem("plantas")).data

let body = ''
for (let i = 1; i < arrayPlantas.length-2; i++) { 
    imagen=(arrayPlantas[i].default_image)
    body += `<div class="plant-section">
                    <div id="imagen">
                            <a href="${imagen.medium_url}" target="_blank">
                                <img src="${imagen.thumbnail}" alt=""/>
                            </a>
                    </div>
                    <p><b>Nombre común: </b><br> ${arrayPlantas[i].common_name}</p>
                    <div id="descripcion">
                        <p><b>Nombre Científico:  </b><br>  ${arrayPlantas[i].scientific_name}</p>
                    </div>
                    <div id="datos_basicos">
                        <p> <b>Expocisión solar:  </b> <br> ${arrayPlantas[i].sunlight}</p>
                    </div>
            </div>`
   
}
document.getElementById("listaPlantas").innerHTML = body