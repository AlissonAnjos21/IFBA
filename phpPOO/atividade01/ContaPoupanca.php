<?php

class ContaPoupanca extends Conta{

    public function sacar($valor){
        $saldo = $this->getSaldo();
        if($valor <= $saldo){
            $saldo -= $valor;
            $this->setSaldo($saldo);
            echo "<h1>Sucesso!!!</h1>";
        }else{
            echo "<h1>ERRO!!!</h1>";

        }

    }

}