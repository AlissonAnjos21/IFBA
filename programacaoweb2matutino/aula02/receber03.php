<?php

$nome = filter_input(INPUT_POST,'nome');
$curso = filter_input(INPUT_POST,'curso');
$sexo = filter_input(INPUT_POST,'sexo');
$disciplinas = filter_input(INPUT_POST,'disciplinas', FILTER_DEFAULT, FILTER_REQUIRE_ARRAY); //Informando para o filter input que estou recebendo um array;


echo "<h3>$nome</h3>";
echo "<h3>$curso</h3>";
echo "<h3>$sexo</h3>";
echo "<h3>";

echo implode(', ', $disciplinas);

echo "</h3>";