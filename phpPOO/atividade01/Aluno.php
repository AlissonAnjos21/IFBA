<?php

class Aluno{
    
    protected string $nome;
    protected Turma $turma;

    public function setNome(string $nome){
        $this->nome = $nome;

    }

    public function getNome(){
        return $this->nome;

    }

    public function setTurma(Turma $turma){
        $this->turma = $turma;

    }

    public function getTurma(){
        return $this->turma;

    }

    public function imprimir(){
        echo "{$this->nome}<br>";
        echo $this->turma->imprimirTurma();

    }

}