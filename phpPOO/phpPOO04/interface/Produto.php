<?php

class Produto implements InterfaceItem{

    public $nome;
    public $valor;

    public function __construct($nome, $valor){
        $this->nome = $nome;
        $this->valor = $valor;

    }

    public function getValor(){

        return $this->valor;

    }

    public function getDados(){

        return "PRODUTO -> $this->nome : R$ {$this->getValor()}";

    }

}