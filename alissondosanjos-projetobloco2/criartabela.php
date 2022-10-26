<?php

$con = mysqli_connect("localhost", "root", "", "projetobloco2");

$sql = "CREATE TABLE atividades(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    disciplina VARCHAR(21)
)";

mysqli_query($con, $sql);
