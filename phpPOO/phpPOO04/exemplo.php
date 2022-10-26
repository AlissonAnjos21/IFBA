<?php

/*
    Relacionamento  entre classes e Objetos

    - Associação -> É o relacionamento mais comum entre objetos, neste relacionamento um ATRIBUTO de uma classe é apontado para um objeto de outra classe.
    - Composição -> Um relacionamento em que um objeto de uma classe é instanciado dentro de outra classe.
    - Agregação -> Um Objeto externo é (Pertencente a uma outra classe) é utilizado como um parâmetro em um método.
    

    -> PESSOA
        -> nome
        -> datanascimento

        + SALVAR -> MÉTODO SALVAR -> SALVA A PESSOA NO BANCO DE DADOS
            Mysqli_querry -> Classe Orientada a Objetos
            PDO -> Php Data Object -> Multiplos BDs -> CLASSE



    
    -Produto
        ->nome
        ->valor

    -Carrinho
        ->produtos -> ARRAY COM VÁRIOS OBJETOS DO TIPO PRODUTO
        +addProduto(PRODUTO) -> ADICIONAR O PRODUTO NO ARRAY

*/

require_once "Pessoa.php";

$p1 = new Pessoa();
$p1->setNome("João");
$p1->setDataNascimento(2005-05-08);

$p1->salvar();
