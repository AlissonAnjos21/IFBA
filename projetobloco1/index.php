<?php 

define("ARQUIVO","dados.txt");

$msg = "";

//1- RECUPERAR O CONTEÚDO DO ARQUIVO
$conteudo = file_get_contents(ARQUIVO);

//2- TRANSFORMAR O CONTEÚDO DE STRING PARA ARRAY
$dados = explode("\n", $conteudo);


$indice = filter_input(INPUT_GET, "indice");

if($indice != NULL){
    
    array_splice($dados, $indice, 1);
    $aberto = fopen(ARQUIVO, "w");
    $conteudo = implode("\n", $dados);
    fwrite($aberto, $conteudo);
    fclose($aberto);
    
    $msg = "Item Excluído com Sucesso";
    
}




//3- PASSAR POR TODAS AS LINHAS E TRANSFORMAR PEDAÇOS DESTA LINHA EM COLUNAS DE UM ARRAY
$series = [];
foreach($dados as $linha){

    if($linha != ""){
        $serie = explode(";", $linha);
        array_push($series, $serie);
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
    <ul>
        
        <?php
        
        if($msg != ""){
        
        ?>
        <div class="msg">🤓 <?=$msg?></div>
        
        <?php } ?>
        
        <?php
        
        if(count($series) == 0){
        
        ?>
        <div class="msg">🥴 Não Existem Séries ou Filmes Cadastrados.</div>
        
        <?php } ?>
        
        
    <?php foreach($series as $i => $s){ ?>

    <li>
    <h4><?=$s[0] ?><a href="index.php?indice=<?=$i?>" title="Excluir Item">❌</a></h4>
    <p><?=$s[1] ?></p>
    <div class="info">
    <div class="nota">
    <?php
    for($i = 0; $i < $s[2]; $i++){

        echo "⭐";

    }
    ?>
    
    </div>
    <div class="assistiu">Assistiu:<?= (trim($s[3]) == "true") ? "✅" : "🛑" ?></div>
    </div>
    </li>
    
    <?php } ?>

    </ul>
    
    </main>


</body>
</html>