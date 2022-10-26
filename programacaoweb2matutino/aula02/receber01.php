<?php 

$nome = $_GET['nomecompleto'] ?? ""; //Nullscape
$idade = isset($_GET['idade']) ? $_GET['idade'] : "10"; //Operador Ternário

$curso = filter_input(INPUT_GET, 'curso');

echo "<h1>$nome</h1>";
echo "<h2>$idade anos</h2>";
echo "<h3>Curso de $curso</h3>";