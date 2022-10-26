<?php

require_once "conectabanco.php";

if($_SERVER["REQUEST_METHOD"] == "POST"){

    $titulo = filter_input(INPUT_POST, "titulo");
    $disciplina = filter_input(INPUT_POST, "disciplina");

    $sql = "INSERT INTO atividades(titulo, disciplina) VALUES (?, ?)";

    $preparada = mysqli_prepare($con, $sql);
    mysqli_stmt_bind_param($preparada, "ss", $titulo, $disciplina);

    if(mysqli_stmt_execute($preparada)){

        echo "<h2>Atividade Cadastrada com Sucesso! :D</h2>";
        echo "<a href='atividades_cadastrar.php'>Voltar</a>";

    }

}else{

    header("location: atividades_cadastrar.php");

}
