<?php

class Conta{
    
    private $nome;
    private $numero;
    private $saldo;

    public function __construct($nome, $numero, $saldo=0){
        $this->nome = $nome;
        $this->numero = $numero;
        $this->saldo = $saldo;

    }

    public function getNome(){
        return $this->nome;

    }

    public function setNome($nome){
        $this->nome = $nome;

    }

    public function getNumero(){
        return $this->numero;

    }

    public function getSaldo(){
        return $this->saldo;

    }

    private function setSaldo($valor){
        $this->saldo = $valor;

    }

    public function depositar($valor){
        $saldo = $this->getSaldo();
        $saldo += $valor;
        $this->setSaldo($saldo);
        echo "<h4>Deposito realizado no valor de R$ $valor</h4>";

    }

    public function sacar($valor){
        $saldo = $this->getSaldo();
        if($valor <= $saldo){
            $saldo -= $valor;
            $this->setSaldo($saldo);
            echo "<h4>Saque realizado no valor de R$ $valor</h4>";
        }else{
            echo "<h4>Saldo Insuficiente para o saque</h4>";

        }

    }

}

$c1 = new Conta("Thiago", 1234, 100);
$c1->depositar(50);
echo "O saldo é de {$c1->getSaldo()}<br>";
$c1->sacar(80);
echo "O saldo é de {$c1->getSaldo()}<br>";
$c1->sacar(80);
echo "O saldo é de {$c1->getSaldo()}<br>";