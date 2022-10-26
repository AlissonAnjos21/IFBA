<?php

$n1 = filter_input(INPUT_POST, "n1");
$n2 = filter_input(INPUT_POST, "n2");
$n3 = filter_input(INPUT_POST, "n3");

if($n1 > $n2 && $n1 > $n3){

    echo "<h1>$n1 é o maior</h1>";

}else if($n2 > $n1 && $n2 > $n3){

    echo "<h1>$n2 é o maior</h1>";

}else{

    echo "<h1>$n3 é o maior</h1>";

}