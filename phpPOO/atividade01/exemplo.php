<?php

require_once "Turma.php";
require_once "Aluno.php";

$t1 = new Turma();
$t1->setCurso("Informática");
$t1->setSerie("2 Ano");

$a1 = new Aluno();
$a1->setNome("Jurandir");
$a1->setTurma($t1);

$a1->imprimir();
