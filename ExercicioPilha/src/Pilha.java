public class Pilha {

    private Do itemPilha;

    public Pilha(Do itemPilha) {
        this.itemPilha = itemPilha;
    }

    public Do getItemPilha() {
        return itemPilha;
    }

    public void setItemPilha(Do itemPilha) {
        this.itemPilha = itemPilha;
    }

    public void Empilhar(Do itemPilha) {
        this.itemPilha.setItemDo(getItemPilha());
        this.setItemPilha(itemPilha);
    }

    public void Desempilhar() {}

}
