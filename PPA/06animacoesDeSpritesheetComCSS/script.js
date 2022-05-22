let personagem = document.querySelector('#personagem');
let personagemImagem = document.querySelector('#personagem img');
let personagemX = 200;
let personagemY = 200;
let personagemAltura = 90;
let personagemLargura = 75;
let containerAltura = 600;
let containerLargura = 800;
let velocidade = 10;

document.addEventListener('keydown', movimentacao);
document.addEventListener('keyup', parar);

function movimentacao(evento){
    evento.preventDefault();

    let tecla = evento.key;

    switch(tecla){
        case 'ArrowUp':
            personagemImagem.classList.add('movimentacao', 'cima');
            personagemImagem.classList.remove('baixo');
            personagemImagem.classList.remove('esquerda');
            personagemImagem.classList.remove('direita');

            personagemY -= velocidade;
            if(personagemY <= 0){
                personagemY = 0;
            }
            personagem.style.top = personagemY + 'px';
        break;
        case 'ArrowDown':
            personagemImagem.classList.add('movimentacao', 'baixo');
            personagemImagem.classList.remove('cima');
            personagemImagem.classList.remove('esquerda');
            personagemImagem.classList.remove('direita');
            personagemY += velocidade;
            if(personagemY >= containerAltura - personagemAltura){
                personagemY = containerAltura - personagemAltura;
            }
            personagem.style.top = personagemY + 'px';        
        break;
        case 'ArrowLeft':
            personagemImagem.classList.add('movimentacao', 'esquerda');
            personagemImagem.classList.remove('baixo');
            personagemImagem.classList.remove('cima');
            personagemImagem.classList.remove('direita');
            personagemX -= velocidade;
            if(personagemX <= 0){
                personagemX = 0;
            }
            personagem.style.left = personagemX + 'px';        
        break;
        case 'ArrowRight':
            personagemImagem.classList.add('movimentacao', 'direita');
            personagemImagem.classList.remove('baixo');
            personagemImagem.classList.remove('esquerda');
            personagemImagem.classList.remove('cima');
            personagemX += velocidade;
            if(personagemX >= containerLargura - personagemLargura){
                personagemX = containerLargura - personagemLargura;
            }
            personagem.style.left = personagemX + 'px';
        break;

    }

}

function parar(evento){
    evento.preventDefault();

    let tecla = evento.key;

    switch(tecla){
        case 'ArrowUp':
        case 'ArrowDown':
        case 'ArrowLeft':
        case 'ArrowRight':
            personagemImagem.classList.remove('movimentacao');
        break;

    }
}
