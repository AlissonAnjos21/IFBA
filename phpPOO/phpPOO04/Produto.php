<?php

class Produto{

    public $nome;
    public $valor;

    public function __construct($nome, $valor){
        $this->nome = $nome;
        $this->valor = $valor;

    }

}