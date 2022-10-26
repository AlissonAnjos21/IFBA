<?php

require_once "conectabanco.php";

$sql = "SELECT * FROM atividades";

$resultado = mysqli_query($con, $sql);

$quant = mysqli_num_rows($resultado);
$dados = mysqli_fetch_all($resultado, MYSQLI_ASSOC);

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listar Atividades</title>
</head>
<body>
    
    <?php 

        foreach($dados as $dado){
    ?>

            <li>
                Título: <?=$dado["titulo"]?> <?="<br>"?> Disciplina: <?=$dado["disciplina"]?><br>

                <a href="atividades_acao_excluir.php?id=<?=$dado["id"]?>">Excluir</a>
                <a href="atividades_editar.php?id=<?=$dado["id"]?>">Editar</a><br><br>
            </li>

    <?php 
    }
    ?>




</body>
</html>