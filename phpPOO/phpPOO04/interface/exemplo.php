<?php

/*
    Interface -> Um Contrato -> Uma forma de assegurar a implementação de métodos por uma classe.

    -> InterfaceItem
        getValor() -> Todos que implementarem esta interface são obrigados a escrever o método getValor()
        getDados() -> Todos que implementarem esta interface são obrigados a escrever o método getDados()
    
    
    - Produto implementar InterfaceItem
        -nome
        -valor
        ->getValor()
        ->getDados()
    
    - Servico implementar InterfaceItem
        -nome
        -preco
        ->getValor()
        ->getDados()

    - Visitas implementar InterfaceItem
        -local
        -taxa
        ->getValor()
        ->getDados()
    
    -> Orçamento
        -> itens -> Array com Vários Produtos
        + addItens(InterfaceItem)

*/

require_once "InterfaceItem.php";
require_once "Produto.php";
require_once "Servico.php";
require_once "Orcamento.php";

$p1 = new Produto("Mouse", 50);
$p2 = new Produto("Teclado", 100);

$s1 = new Servico("Formatação", 50);

$o1 = new Orcamento();
$o1->addItem($p1);
$o1->addItem($p2);
$o1->addItem($s1);

$o1->imprime();
