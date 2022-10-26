<?php

$nome = filter_input(INPUT_POST, "nome");
$salarioatual = filter_input(INPUT_POST, "salarioatual");

if($salarioatual <= 1100){

    $aumento = $salarioatual * 0.2;
    $novosalario = $salarioatual + $aumento;

    echo "<h1>O Funcionário $nome</h1>";
    echo "<h2>Possuia um Salário de: R$ $salarioatual</h2>";
    echo "<h2>Recebeu um Percentual de Aumento de: 20%</h2>";
    echo "<h2>Recebeu um Aumento de: R$ $aumento</h2>";
    echo "<h2>O Seu Novo Salário é: R$ $novosalario</h2>";

}else if($salarioatual > 1100 && $salarioatual < 1700){

    $aumento = $salarioatual * 0.15;
    $novosalario = $salarioatual + $aumento;

    echo "<h1>O Funcionário $nome</h1>";
    echo "<h2>Possuia um Salário de: R$ $salarioatual</h2>";
    echo "<h2>Recebeu um Percentual de Aumento de: 15%</h2>";
    echo "<h2>Recebeu um Aumento de: R$ $aumento</h2>";
    echo "<h2>O Seu Novo Salário é: R$ $novosalario</h2>";


}else if($salarioatual > 1700 && $salarioatual < 2500){

    $aumento = $salarioatual * 0.1;
    $novosalario = $salarioatual + $aumento;

    echo "<h1>O Funcionário $nome</h1>";
    echo "<h2>Possuia um Salário de: R$ $salarioatual</h2>";
    echo "<h2>Recebeu um Percentual de Aumento de: 10%</h2>";
    echo "<h2>Recebeu um Aumento de: R$ $aumento</h2>";
    echo "<h2>O Seu Novo Salário é: R$ $novosalario</h2>";

}else if($salarioatual >= 2500){

    $aumento = $salarioatual * 0.05;
    $novosalario = $salarioatual + $aumento;

    echo "<h1>O Funcionário $nome</h1>";
    echo "<h2>Possuia um Salário de: R$ $salarioatual</h2>";
    echo "<h2>Recebeu um Percentual de Aumento de: 5%</h2>";
    echo "<h2>Recebeu um Aumento de: R$ $aumento</h2>";
    echo "<h2>O Seu Novo Salário é: R$ $novosalario</h2>";

}