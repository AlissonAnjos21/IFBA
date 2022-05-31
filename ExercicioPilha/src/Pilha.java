public class Pilha {
    private No topo;

    public Pilha(No topo) {
        this.topo = topo;
    }

    public No getTopo() {
        return this.topo;
    }

    public void setTopo(No no) {
        this.topo = topo;
    }

    public void empilhar(No no) {
        if(this.topo.getProx() == null) {
            this.topo.setProx(no);
        }else {
            no.setProx(this.topo.getProx());
            this.topo.setProx(no);
        }
    }

    public void desempilhar() {
        if (this.topo.getProx() != null) {
            this.topo.setProx(this.topo.getProx().getProx());
        }else {
            System.out.println("Você precisa ter um elemento inferior para conseguir desempilhar!!!");
        }

    }
}
