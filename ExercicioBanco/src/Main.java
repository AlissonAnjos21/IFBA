public class Main {
    public static void main(String [] args) throws Exception {
        Banco banco = new Banco();
        banco.setNome("Banco do Bom Serviço");

        Cliente cliente1 = new Cliente();
        cliente1.setId(0);
        cliente1.setNome("Jurandir");

        Cliente cliente2 = new Cliente();
        cliente2.setId(1);
        cliente1.setNome("Valdir");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Marcelo");

        Funcionario funcionario2 = new Funcionario();
        funcionario1.setNome("Cleiton");

        Conta conta1 = new Conta();
        conta1.setNumero(1);

        Conta conta2 = new Conta();
        conta2.setNumero(2);

        banco.addCliente(cliente1);
        banco.addCliente(cliente2);
        banco.addConta(conta1);
        banco.addConta(conta2);
        banco.removeCliente(0);

        banco.imprimeNomeClientes();

        System.out.println(banco.buscaConta(1));

    }
}
