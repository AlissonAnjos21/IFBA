<?php

/*
    Relacionamento  entre classes e Objetos

    - Associação -> É o relacionamento mais comum entre objetos, neste relacionamento um ATRIBUTO de uma classe é apontado para um objeto de outra classe.
    - Agregação
    - Composição

    EMPRESA
        - Nome
        - Endereço -> OBJETO DO TIPO ENDEREÇO
    
    ENDEREÇO
    -Rua
    -numero
    -bairro
    -cidade


*/

require_once "Endereco.php";
require_once "Empresa.php";

$end = new Endereco();
$end->rua = "Rua X";
$end->numero = 123;
$end->bairro = "Bairro Y";
$end->cidade = "Brumado";

$emp = new Empresa();
$emp->setNome("Microsoft");
$emp->setEndereco($end);

$emp->imprimir();