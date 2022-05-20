public class Conta {
    private int id;
    private int numero;
    private String tipo;
    private int idCliente;
    private int idFuncionario;

    public Conta(int idCliente, int idFuncionario) {
        this.idCliente = idCliente;
        this.idFuncionario = idFuncionario;

    }

    public Conta(int id, int numero, String tipo, int idCliente, int idFuncionario) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.idCliente = idCliente;
        this.idFuncionario = idFuncionario;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
