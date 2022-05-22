public class Do<T> {

    private T valor;
    private Do item;

    public Do() {
        this.item = null;
    }

    public Do(T valor, Do item) {
        this.valor = valor;
        this.item = item;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Do getItem() {
        return item;
    }

    public void setItem(Do item) {
        this.item = item;
    }

}
