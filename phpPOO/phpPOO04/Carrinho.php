<?php

class Carrinho{

    protected Array $produtos;

    /*
        Agregação -> Um parâmetro que é um objeto de uma outra classe é utilizado como parâmetro para um método.
    */

    public function addProduto(Produto $produto){
        $this->produtos[] = $produto;

    }

    public function imprime(){

        foreach($this->produtos as $p){
            echo "<li>{$p->nome} - R$ {$p->valor}</li>";

        }

    }

}