<?php

include "funcoes.php";

$erro = "";
$msg = "";

if($_POST){
    
    $titulo = filter_input(INPUT_POST, "titulo");
    $epstotal = filter_input(INPUT_POST, "epstotal");
    $epsassis = filter_input(INPUT_POST, "epsassis");
    $descricao = filter_input(INPUT_POST, "descricao");
    $completo = "";
    
    if($epsassis == NULL){
        
        $epsassis = 0;
        
    }
    
    if($titulo != "" && $epstotal >= $epsassis ){
        
        if($epstotal == $epsassis){
            
            $completo = "Completo 😎";
            
        }else{
            
            $completo = "Assistindo 😲";
            
        }

        cadastrarAnimacao($titulo, $epstotal, $epsassis, $descricao, $completo);
        
        $msg = "😎 Cadastro Realizado com Sucesso!";
        
    }else{
        
        if($titulo == "" && $epstotal >= $epsassis){

            $erro = "😡 ERRO! Você Precisa Preencher o Título";
            
        }else if($titulo != "" && $epsassis > $epstotal){

            $erro = "😡 ERRO! O Número de Episódios Assistidos Deve Ser Menor ou Igual ao Total de Episódios";

        }else if($titulo == "" && $epsassis > $epstotal){

            $erro = "😡 ERRO! Você Precisa Preencher o Título e o Número de Episódios Assistidos Deve Ser Menor ou Igual ao Total de Episódios";

        }
        
    }
    
}

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de Administração de Animações</title>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,500;0,700;1,400;1,700&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
    <link href="estilo.css" rel="stylesheet">
</head>
<body>
    
    <?php
    
    include "header.php";
    
    ?>
    
    <main>
        <h2>Cadastro de Animações</h2>

        <form action="cadastro.php" method="post">
        
        <label>
        Título:
            <input type="text" name="titulo">
        </label>

        <label>
        Quantidade Total de Episódios:
            <input type="number" name="epstotal" min="1">
        </label>

        <label>
        Quantidade de Episódios Assistidos:
            <input type="number" name="epsassis" min="0">
        </label>

        <label>
        Descrição:
            <input type="text" name="descricao">
            
        </label>

        <button>Salvar</button>
        
        </form>
        
        <?php
        
        if($msg != ""){ ?>
        
        <div class="msg"><?=$msg?></div>
        
        <?php } ?>
            
        <?php 
        
        if($erro != ""){ ?>
        
        <div class="erro"><?=$erro?></div>
        
        <?php } ?>

    </main>


</body>
</html>