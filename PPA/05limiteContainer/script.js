let quadrado = document.querySelector('#quadrado');
let quadradoX = 700;
let quadradoY = 200;
let quadradoTamanho = 100;
let containerAltura = 600;
let containerLargura = 800;

document.addEventListener('keydown', movimentacao);

function movimentacao(evento){
    evento.preventDefault();

    let tecla = evento.key;
    console.log('A tecla selecionado foi: '+tecla);

    switch(tecla){
        case 'ArrowUp':
            quadradoY -= 100;
            if(quadradoY <= 0){
                quadradoY = 0;
            }
            quadrado.style.top = quadradoY + 'px';
        break;
        case 'ArrowDown':
            quadradoY += 100;
            if(quadradoY >= containerAltura - quadradoTamanho){
                quadradoY = containerAltura - quadradoTamanho;
            }
            quadrado.style.top = quadradoY + 'px';        
        break;
        case 'ArrowLeft':
            quadradoX -= 100;
            if(quadradoX <= 0){
                quadradoX = 0;
            }
            quadrado.style.left = quadradoX + 'px';        
        break;
        case 'ArrowRight':
            quadradoX += 100;
            if(quadradoX >= containerLargura - quadradoTamanho){
                quadradoX = containerLargura - quadradoTamanho;
            }
            quadrado.style.left = quadradoX + 'px';
        break;

    }

}
