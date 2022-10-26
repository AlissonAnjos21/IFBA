<?php

$nome = filter_input(INPUT_POST, "nome");
$n1 = filter_input(INPUT_POST, "n1");
$n2 = filter_input(INPUT_POST, "n2");
$n3 = filter_input(INPUT_POST, "n3");

$media = ($n1 + $n2 + $n3) / 3;

if($media >= 6 && $media != 10){

    echo "<h1>O aluno $nome foi APROVADO!!!</h1>";

}else if($media < 6){

    echo "<h1>O aluno $nome foi REPROVADO!!!</h1>";

}else{

    echo "<h1>O aluno $nome foi APROVADO COM DISTINÇÃO!!!</h1>";

}