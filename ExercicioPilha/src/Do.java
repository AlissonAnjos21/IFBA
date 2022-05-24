public class Do<T> {

    private T valor;
    private Do itemDo;

    public Do() {
        this.itemDo = null;
    }

    public Do(T valor, Do itemDo) {
        this.valor = valor;
        this.itemDo = itemDo;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Do getItemDo() {
        return itemDo;
    }

    public void setItemDo(Do item) {
        this.itemDo = item;
    }

}
