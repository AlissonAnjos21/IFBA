<?php

abstract class Conta{

    protected $nome;
    protected $saldo;

    public function __construct($nome, $saldo){
        $this->nome = $nome;
        $this->saldo = $saldo;

    }
    
    public function getNome(){
        return $this->nome;

    }

    public function setNome($nome){
        $this->nome = $nome;

    }

    public function getSaldo(){
        return $this->saldo;

    }

    protected function setSaldo($valor){
        $this->saldo = $valor;

    }

    public function depositar($valor){
        $saldo = $this->getSaldo();
        $saldo += $valor;
        $this->setSaldo($saldo);

    }

    abstract public function sacar();


}