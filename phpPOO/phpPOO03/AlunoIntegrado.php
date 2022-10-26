<?php

require_once "Aluno.php";

class AlunoIntegrado extends Aluno{

    protected $numeroMatricula;

    public function __construct(){
        $this->numeroMatricula = rand(10000, 99999);

    }

    public function matricular(){
        echo "<h5>Matriculado no Integrado</h5>";

    }

    public function imprimirDados(){
        echo "<h4 style='color:blue'>{$this->numeroMatricula} -> {$this->nome} -> {$this->curso}</h4>";

    }

}