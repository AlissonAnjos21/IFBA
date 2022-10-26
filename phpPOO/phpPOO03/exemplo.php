<?php

/*
    4 Pilares da Orientação a Objeto
    X Abstração
    X Encapsulamento
    X Herança
    x Polimorfismo- Poli -> Muitas | morfismo -> formas 


    * Aluno
        - Nome
        - Idade
        - Curso

    * Aluno Integrado herdar o código Aluno
        - NumeroMatricula

    * Aluno Extensão herdar o código Aluno
        - CPF
    
*/

require_once "Aluno.php";
require_once "AlunoIntegrado.php";
require_once "AlunoExtensao.php";
require_once "AlunoSubsequente.php";


$a1 = new AlunoIntegrado();
$a1->setNome("João");
$a1->setIdade(15);
$a1->setCurso("Informática");
$a1->matricular();
$a1->imprimirDados();


$a2 = new AlunoExtensao();
$a2->setNome("Maria");
$a2->setIdade(20);
$a2->setCurso("Desenvolvedor Android");
$a2->setCpf("12345-8");
$a2->matricular();
$a2->imprimirDados();

$a3 = new AlunoSubsequente();
$a3->setNome("Pedro");
$a3->setIdade(20);
$a3->setCurso("Desenvolvedor Android");
$a3->chamada(1234);



var_dump($a1);
echo "<hr>";
var_dump($a2);
