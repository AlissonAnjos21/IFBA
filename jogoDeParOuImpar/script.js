/*
Vocês devem receber do usuário o valor numérico através de um campo de formulário. 

O Usuário deve informar um valor entre 0 e 10. 

O Computador deve gerar aleatoriamente um número entre 0 e 10. 

Sabendo que o Computador sempre está apostando nos números impares, o seu programa deve verificar se a soma do valor do usuário com o do computador é um número par ou um número ímpar e exibir o vencedor de cada rodada. 



Exigências:

1. Deve existir uma área para a contabilização de quantas rodadas cada um venceu.

2. Deve haver um botão para iniciar uma nova rodada.

3. Deve haver um botão para começar o jogo.

4. Um jogo só pode ser iniciado se o jogador digitar um valor

5. A cada final de rodada o campo de formulário do usuário deve ser esvaziado
*/

/* CAPTURA OS ELEMENTOS REFERENTES A INICIALIZAÇÃO DO JOGO  */

let inicio = document.getElementById('inicio');
let jogo = document.getElementById('jogo');

/* DECLARAÇÃO DA PONTUAÇÃO DOS COMPETIDORES */

let usuario = 0;
let pc = 0;

/* TORNA A PARTE JOGÁVEL VISÍVEL */

function comeca(){
    inicio.style.opacity = 0;
    jogo.style.opacity = 1;

}

/* O JOGO EM SI */

function jogando(){
    /* CAPTURANDO DOS ELEMENTOS NECESSÁRIOS PARA DAR ANDAMENTO AO JOGO */

    let campotexto = document.getElementById('campotexto');
    let valorusuario = parseInt(campotexto.value);

    let operacao = document.getElementById('operacao');
    let vencedor = document.getElementById('vencedor');
    let pontosusuario = document.getElementById('pontosusuario');
    let pontospc = document.getElementById('pontospc');

    /* VERIFICA SE O VALOR ESTÁ NO INTERVALO DEFINITO (ENTRE 0 E 10)*/

    if (isNaN(valorusuario) || valorusuario < 0 || valorusuario > 10){
        alert("O valor está fora do intervalo requerido");
        
    }else{
        /* GERA OS NÚMEROS, CALCULA O VENCEDOR, EXIBE NA TELA, USA O SOM, LIMPA A CAIXA E ATUALIZA O PLACAR */

        let valorpc = Math.floor(Math.random() * 11);
        let soma = valorusuario + valorpc;
        operacao.innerHTML = valorusuario+" + "+valorpc+" = "+soma;

        if (soma % 2 == 0){
            vencedor.style.color = "rgb(78, 241, 141)";
            vencedor.innerHTML = "O USUÁRIO venceu!";
            usuario++;

        }else{
            vencedor.style.color = "rgb(190, 35, 30)";
            vencedor.innerHTML = "O COMPUTADOR venceu!";
            pc++;

            }

            campotexto.value = "";
            pontosusuario.innerHTML = usuario;
            pontospc.innerHTML = pc;

        }

}

/* RESPONSÁVEL POR TORNAR A PARTE JOGÁVEL INVISÍVEL E LIMPAR OS DADOS */

function finaliza(){
    jogo.style.opacity = 0;
    inicio.style.opacity = 1;
    
    operacao.innerHTML = "";
    vencedor.innerHTML = "";

    usuario = 0;
    pc = 0;
    pontosusuario.innerHTML = usuario;
    pontospc.innerHTML = pc;

}
