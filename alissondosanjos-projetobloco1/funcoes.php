<?php

define("ARQUIVO","dados.txt");

function recuperarDados(){

    $conteudo = file_get_contents(ARQUIVO);

    $dados = explode("\n", $conteudo);

    return $dados;

}

function prepararDados($dados){

    $series = [];
    foreach($dados as $linha){
    
        if($linha != ""){
            $serie = explode(";", $linha);
            array_push($series, $serie);
        }
    }

    return $series;

}

function cadastrarAnimacao($titulo, $epstotal, $epsassis, $descricao, $completo){

    $linha = "$titulo;$epstotal;$epsassis;$descricao;$completo\n";
        
        $aberto = fopen(ARQUIVO, "a");
        fwrite($aberto, $linha);
        fclose($aberto);

}

function excluirAnimacao($indice, $dados){

    array_splice($dados, $indice, 1);
    $aberto = fopen(ARQUIVO, "w");
    $conteudo = implode("\n", $dados);
    fwrite($aberto, $conteudo);
    fclose($aberto);

    return $dados;

}