<?php

class Turma{

    protected $curso;
    protected $serie;

    public function setCurso($curso){
        $this->curso = $curso;

    }

    public function getCurso(){
        return $this->curso;

    }

    public function setSerie($serie){
        $this->serie = $serie;

    }

    public function getSerie(){
        return $this->serie;

    }

    public function imprimirTurma(){
        echo "{$this->curso} - {$this->serie}";

    }

}