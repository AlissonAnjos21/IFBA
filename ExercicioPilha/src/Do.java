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

}
