<?php

define("ARQUIVO","dados.txt");

$erro = "";
$msg = "";

if($_POST){
    
    $titulo = filter_input(INPUT_POST, "titulo");
    $descricao = filter_input(INPUT_POST, "descricao");
    $nota = filter_input(INPUT_POST, "nota");
    $assistiu = filter_input(INPUT_POST, "assistiu");
    
    $assistiu = ($assistiu == NULL) ? "false" : $assistiu;
    
    
    
    if($titulo != ""){
        //CADASTRAR
        
        $linha = "$titulo;$descricao;$nota;$assistiu\n";
        
        $aberto = fopen(ARQUIVO, "a");
        fwrite($aberto, $linha);
        fclose($aberto);
        
        $msg = "Cadastro Realizado com Sucesso!";
        
    }else{
        //MOSTRAR ERRO
        $erro = "O Título é um Campo Obrigatório";
        
    }
    
}

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de Gestão de Séries e Filmes</title>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,500;0,700;1,400;1,700&display=swap" rel="stylesheet">
    <link href="estilo.css" rel="stylesheet">
</head>
<body>
    
    <?php
    
    include "header.php";
    
    ?>
    
    <main>
        <h2>Cadastro de Séries e Filmes</h2>

        <form action="cadastro.php" method="post">
        
        <label>
        Título:
            <input type="text" name="titulo">
        </label>

        <label>
        Descrição:
            <input type="text" name="descricao">
        </label>

        <label>
        Nota:
            <select name="nota">
            
            <option value="0"> - </option>
            <option value="1"> 1 </option>
            <option value="2"> 2 </option>
            <option value="3"> 3 </option>
            <option value="4"> 4 </option>
            <option value="5"> 5 </option>
            
            </select>
        </label>

        <label>
        Assistiu:
            <input name="assistiu" type="checkbox" value="true">
        </label>

        <button>Salvar</button>
        
        </form>
        
        <?php
        
        if($msg != ""){ ?>
        
        <div class="msg">🤓 <?=$msg?></div>
        
        <?php } ?>
            
        <?php 
        
        if($erro != ""){ ?>
        
        <div class="erro">😡 <?=$erro?></div>
        
        <?php } ?>

    </main>


</body>
</html>