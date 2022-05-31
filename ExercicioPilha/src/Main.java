public class Main {
    public static void main(String[] args) {

        No no1 = new No();
        No no2 = new No();
        No no3 = new No();

        Pilha pilha = new Pilha(no1);

        pilha.empilhar(no2);
        pilha.empilhar(no3);

        pilha.desempilhar();

    }
}
