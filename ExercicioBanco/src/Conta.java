public class Conta {
    private int id;
    private int numero;
    private String tipo;

    public Conta() {
        this.tipo = null;
    }

    public Conta(int id, int numero, String tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
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
