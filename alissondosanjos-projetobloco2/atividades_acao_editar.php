<?php

require_once "conectabanco.php";

if($_SERVER["REQUEST_METHOD"] == "POST"){

    $titulo = filter_input(INPUT_POST, "titulo");
    $disciplina = filter_input(INPUT_POST, "disciplina");
    $id = filter_input(INPUT_GET, "id");

    $sql = "UPDATE atividades SET titulo = ?, disciplina = ? WHERE id = ?";
    
    $preparada = mysqli_prepare($con, $sql);
    mysqli_stmt_bind_param($preparada, "ssi", $titulo, $disciplina, $id);

    if(mysqli_stmt_execute($preparada)){

        echo "<h2>Atividade Editada Com Sucesso!!! :D</h2>";
        echo "<a href='atividades_editar.php?id=$id'>Voltar</a>";

    }

}
