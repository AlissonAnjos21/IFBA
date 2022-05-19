import java.util.ArrayList;

public class Banco {
    private String nome;
    private int codigo;
    private ArrayList clientes;
    private ArrayList funcionarios;
    private ArrayList contas;
    private int agencias;

    public Banco() {
        this.nome = null;
        this.codigo = 0;
        this.clientes = null;
        this.funcionarios = null;
        this.contas = null;
        this.agencias = 0;
    }

    public Banco(String nome, int codigo, ArrayList clientes, ArrayList funcionarios, ArrayList contas, int agencias) {
        this.nome = nome;
        this.codigo = codigo;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
        this.contas = contas;
        this.agencias = agencias;

    }

}
