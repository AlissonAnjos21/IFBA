<?php

require_once "conectabanco.php";

$id = filter_input(INPUT_GET, "id");

$sql = "SELECT * FROM atividades WHERE id = ?";

$preparada = mysqli_prepare($con, $sql);
mysqli_stmt_bind_param($preparada, "i", $id);
mysqli_stmt_execute($preparada);

$resultado = mysqli_stmt_get_result($preparada);

$dados = mysqli_fetch_assoc($resultado);

$titulo = $dados["titulo"];
$disciplina = $dados["disciplina"];

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastar Atividades</title>
</head>
<body>
    
    <form action="atividades_acao_editar.php" method="post">

        <label>
            Título da Atividade:
            <input type="text" name="titulo" value="<?=$titulo?>">
        </label>

        <br>

        <label>
            Disciplina da Atividade:
            <input type="text" name="disciplina" value="<?=$disciplina?>">
        </label>

        <br>

        <button>Salvar</button>

    </form>

</body>
</html>
