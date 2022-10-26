<?php

/*
    Relacionamento  entre classes e Objetos

    - Associação -> É o relacionamento mais comum entre objetos, neste relacionamento um ATRIBUTO de uma classe é apontado para um objeto de outra classe.
    - Composição -> Um relacionamento em que um objeto de uma classe é instanciado dentro de outra classe.
    - Agregação -> Um Objeto externo é (Pertencente a uma outra classe) é utilizado como um parâmetro em um método.
    
    -Produto
        ->nome
        ->valor

    -Carrinho
        ->produtos -> ARRAY COM VÁRIOS OBJETOS DO TIPO PRODUTO
        +addProduto(PRODUTO) -> ADICIONAR O PRODUTO NO ARRAY

*/

require_once "Produto.php";
require_once "Carrinho.php";

$p1 = new Produto("TV", 2000);
$p2 = new Produto("Som", 500);
$p3 = new Produto("Cafeteira", 100);

$car1 = new Carrinho();
$car1->addProduto($p1);
$car1->addProduto($p2);
$car1->addProduto($p3);

$car1->imprime();
