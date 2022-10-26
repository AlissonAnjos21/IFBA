<?php

class Empresa{

    protected string $nome;
    protected Endereco $endereco;

    public function setNome(string $nome){
        $this->nome = $nome;

    }

    public function setEndereco(Endereco $endereco){
        $this->endereco = $endereco;

    }

    public function imprimir(){
        echo "<h1>{$this->nome}</h1>";
        echo $this->endereco->imprimirEndereco();

    }

}