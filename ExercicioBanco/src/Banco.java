import java.util.ArrayList;

public class Banco {
    private String nome;
    private int codigo;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();;
    private ArrayList<Conta> contas = new ArrayList<>();;
    private int agencias;

    public Banco() {
        this.nome = "";
    }

    public Banco(String nome, int codigo, Cliente cliente, Funcionario funcionario, Conta conta, int agencias) {
        this.nome = nome;
        this.codigo = codigo;
        this.addCliente(cliente);
        this.addFuncionario(funcionario);
        this.addConta(conta);
        this.agencias = agencias;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void addCliente(Cliente cliente) {this.clientes.add(cliente);}

    public void removeCliente(int id) {this.clientes.remove(this.clientes.stream().filter(cliente -> cliente.getId() == id).findFirst());}

    public void addFuncionario(Funcionario funcionario) {this.funcionarios.add(funcionario);}

    public void removeFuncionario(int id) {this.funcionarios.remove(this.funcionarios.stream().filter(funcionario -> funcionario.getId() == id).findFirst());}

    public void addConta(Conta conta) {this.contas.add(conta);}

    public void removeConta(int id) {this.contas.remove(this.contas.stream().filter(conta -> conta.getId() == id).findFirst());}

    public void imprimeNomeClientes() {
        clientes.forEach(cliente -> System.out.println(cliente.getNome()));
    }

    public Conta buscaConta(int numeroConta) throws Exception {
        return this.contas.stream().filter(conta -> conta.getNumero() == numeroConta).findFirst().orElseThrow(() -> new Exception("Conta não existente"));
    }

}
