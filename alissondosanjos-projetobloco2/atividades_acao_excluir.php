<?php

require_once "conectabanco.php";

$id = filter_input(INPUT_GET, "id");

$sql = "DELETE FROM atividades WHERE id = ?";

$preparada = mysqli_prepare($con, $sql);
mysqli_stmt_bind_param($preparada, "i", $id);

if(mysqli_stmt_execute($preparada)){

    echo "<h2>Atividade Excluída Com Sucesso!!! :D</h2>";
    echo "<a href='atividadeslistar.php'>Voltar</a>";

}
