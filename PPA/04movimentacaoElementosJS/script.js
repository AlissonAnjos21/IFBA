let quadrado = document.querySelector('#quadrado');
let quadradoX = 700;
let quadradoY = 200;

document.addEventListener('keydown', movimentacao);

function movimentacao(evento){
    evento.preventDefault();

    let tecla = evento.key;
    console.log('A tecla selecionado foi: '+tecla);

    switch(tecla){
        case 'ArrowUp':
            quadradoY -= 100;
            quadrado.style.top = quadradoY + 'px';
        break;
        case 'ArrowDown':
            quadradoY += 100;
            quadrado.style.top = quadradoY + 'px';        
        break;
        case 'ArrowLeft':
            quadradoX -= 100;
            quadrado.style.left = quadradoX + 'px';        
        break;
        case 'ArrowRight':
            quadradoX += 100;
            quadrado.style.left = quadradoX + 'px';
        break;

    }

}
