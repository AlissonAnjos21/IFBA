<?php 

include "funcoes.php";

$msg = "";
$dados = recuperarDados();

$indice = filter_input(INPUT_GET, "indice");
if($indice != NULL){
    
    $dados = excluirAnimacao($indice, $dados);
    $msg = "Item Excluído com Sucesso!";
    
}

$series = prepararDados($dados);

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
<body id="cima">
    
    <?php
    
    include "header.php";
    
    ?>
    
    <main>
    <ul>
        
        <?php
        
        if($msg != ""){
        
        ?>
        <div class="msg">😎 <?=$msg?></div>
        
        <?php } ?>
        
        <?php
        
        if(count($series) == 0){
        
        ?>
        <div class="msg">🥺👉👈 Nenhuma Animação Cadastrada</div>
        
        <?php } ?>
        
        
    <?php foreach($series as $i => $s){ ?>

    <li>
    <h4><?=$i+1?><?=" - ".$s[0] ?><a href="index.php?indice=<?=$i?>" title="Excluir Item">❌</a></h4>
    
    <div class="info">
    <p>Quantidade Total de Episódios: <?=$s[1]?></p>
    <p>Quantidade de Episódios Assistidos: <?=$s[2] ?></p>
    
    </div>
        
        <?php if($s[4]=="Completo 😎") { 
    
        ?>
        <p class="completo"><?=$s[4]?></p>
        
        <?php } else{ ?> 
        
        <p class="assistindo"><?=$s[4]?></p>
        
        <?php }
        
        ?>

        <div class="desc"><p><?=$s[3] ?></p></div>

    </li>
    
    <?php } ?>

    </ul>
        
        <?php 
        
        if(count($series) != 0){
            
            ?>
        
    <div class="baixo"><a href="#cima" title="Leva ao Topo da Lista">🔺</a></div>
    
        <?php
            
            }
        
        ?>
        
    </main>


</body>
</html>