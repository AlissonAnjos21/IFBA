<?php

class ContaCorrente extends Conta{

    private $limite;

    public function getLimite(){
        return $this->limite;

    }

    public function setLimite($limite){
        $this->limite = $limite;

    }

    public function sacar($valor){
        $saldo = $this->getSaldo();
        $limite = $this->getLimite();
        $total = $saldo + $limite;
        if($valor <= $total){
            $total -= $valor;
            $this->setSaldo($total);
            echo "<h1>Sucesso!!!</h1>";
        }else{
            echo "<h1>ERRO!!!</h1>";

        }

    }

}