<?php

class Servico implements InterfaceItem{

    public $nome;
    public $preco;

    public function __construct($nome, $preco){
        $this->nome = $nome;
        $this->preco = $preco;

    }

    public function getValor(){

        return $this->preco;

    }

    public function getDados(){

        return "SERVIÇO -> $this->nome : R$ {$this->getValor()}";

    }

}