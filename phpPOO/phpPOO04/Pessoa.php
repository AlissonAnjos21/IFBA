<?php

class Pessoa{

    protected $nome;
    protected $dataNascimento;

    public function salvar(){

        $con = new PDO("mysql:host=localhost;dbname=matutino","root", "");
        $sql = "INSERT INTO pessoa(nome, datanascimento) VALUES (?, ?)";

        $preparada = $con->prepare($sql);
        $preparada->bindValue(1, $this->getNome());
        $preparada->bindValue(2, $this->getDataNascimento());

        $preparada->execute();

    }

    public function getNome(){
        return $this->nome;

    }

    public function setNome($nome){
        $this->nome = $nome;

    }

    public function getDataNascimento(){
        return $this->dataNascimento;

    }

    public function setDataNascimento($dataNascimento){
        $this->dataNascimento = $dataNascimento;

    }

}