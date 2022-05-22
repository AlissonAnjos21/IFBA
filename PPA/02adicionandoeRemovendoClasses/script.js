let div = document.querySelector('#novaDiv');

document.addEventListener('keydown', keyDown);
document.addEventListener('keyup', keyUp);

function keyDown(evento){
    let tecla = evento.key;
    console.log('A tecla pressionada foi: '+tecla);

    switch(tecla){
        case 'r':
            //div.style.background = 'red';
            div.classList.add("red");
            div.classList.remove("yellow");
        break;
        case 'y':
            //div.style.background = 'yellow';
            div.classList.add("yellow");
            div.classList.remove("red");
        break;
        default:
            //div.style.background = 'black';
            div.classList.remove("red");
            div.classList.remove("yellow");
        break;

    }

}

function keyUp(evento){
    let tecla = evento.key;
    console.log('A tecla solta foi: '+tecla);

    switch(tecla){
        case 'r':
            //div.style.background = 'yellow';
            div.classList.add("yellow");
            div.classList.remove("red");
        break;
        case 'y':
            //div.style.background = 'red';
            div.classList.add("red");
            div.classList.remove("yellow");
        break;
        default:
            //div.style.background = 'gray';
            div.classList.remove("red");
            div.classList.remove("yellow");
        break;
        
    }

}
