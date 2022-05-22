let div = document.querySelector('#novaDiv');

document.addEventListener('keydown', keyDown);
document.addEventListener('keyup', keyUp);

function keyDown(evento){
    let tecla = evento.key;
    console.log('A tecla pressionada foi: '+tecla);

    switch(tecla){
        case 'r':
            div.style.background = 'red';
        break;
        case 'y':
            div.style.background = 'yellow';
        break;
        default:
            div.style.background = 'black';
        break;

    }

}

function keyUp(evento){
    let tecla = evento.key;
    console.log('A tecla solta foi: '+tecla);

    switch(tecla){
        case 'r':
            div.style.background = 'yellow';
        break;
        case 'y':
            div.style.background = 'red';
        break;
        default:
            div.style.background = 'gray';
        break;
        
    }

}
