package Conta;

import javax.swing.JOptionPane;

public class Programa {
	
	public static void main(String[] args) throws Exception {
		Conta[] contas = new Conta[7];
		
		//Armazene 5 objetos
		
		//As informações para a criação das contas podem ser passadas pelo usuário.
		
		/*Utilize as funções sacar() e depositar() e imprima o saldo de todas as contas salvas,
		 *utilizando um laço de repetição.*/
		
		int qtdElementos = 0;
		int desligar = 0;
		int acao = -1;//Começando com menos -1 para conseguir entrar no laço while
		String input, input2, input3;//Variáveis de suporte
		int cadastro = -1;//Começando com menos -1 para conseguir entrar no laço while
		while(desligar != 1) {
			JOptionPane.showMessageDialog(null, "Seja Bem-Vindo(a)");
			
			//Evita valores incoerentes
			while(acao < 0 || acao > 5) {
				input = JOptionPane.showInputDialog("Informe o que você gostaria de realizar:\n"
						+ "1 - Cadastrar conta.\n"
						+ "2 - Sacar.\n"
						+ "3 - Depositar.\n"
						+ "4 - Imprimir.\n"
						+ "5 - Sair.");
				try {
					acao = Integer.parseInt(input);
				}catch(NumberFormatException e) {
					acao = -1;
				}
				
				if(acao < 0 || acao > 5) {
					JOptionPane.showMessageDialog(null, "O valor informado é inválido!");
				}
			}
			
			//Primeiro dos Switchs, responsável por definir a ação primária
			double quantia = -1;//Sacar ou Depositar
			int qualConta = -1;
			switch(acao) {
			case 1:
				//Mesma lógica anteriormente utilizada para valores incoerentes
				while(cadastro < 0 || cadastro > 3) {
					input = JOptionPane.showInputDialog("Informe que tipo de conta você deseja cadastrar:\n"
							+ "1 - Apenas criar conta.\n"
							+ "2 - Criar conta com ID e Código do Cliente.\n"
							+ "3 - Criar conta com ID, Código do Cliente e Número da Conta.");
					try {
						cadastro = Integer.parseInt(input);
					}catch(NumberFormatException e) {
						cadastro = -1;
					}
					
					if(cadastro < 0 || cadastro > 3) {
						JOptionPane.showMessageDialog(null, "O valor informado é inválido!");
					}
				}
				
				//Segundo switch, cadastra as contas
				int id = -1;
				int codigoCliente = -1;
				int numeroConta = -1;
				switch(cadastro) {
				case 1:
					contas[qtdElementos] = new Conta();
					acao = -1;//A acao precisa voltar a ser < 0 ou > 5 para pedir mais contas
					cadastro = -1;//Mesma lógica no cadastro
					break;
				case 2:
					while(id < 0 || codigoCliente < 0) {
						input = JOptionPane.showInputDialog("Informe o ID.");
						input2 = JOptionPane.showInputDialog("Informe o Código do Cliente.");
						try {
							id = Integer.parseInt(input);
							codigoCliente = Integer.parseInt(input2);
						}catch(NumberFormatException e) {
							id = -1;
							codigoCliente = -1;
						}
						
						//Verificando valores repetidos
						for(int i = 0; i < qtdElementos; i++) {
							if(contas[i].getId() == id || contas[i].getCodigoCliente() == codigoCliente) {
								id = -1;
								codigoCliente = -1;
							}
						}
						
						if(id < 0 || codigoCliente < 0) {
							JOptionPane.showMessageDialog(null, "Algum valor inválido foi informado!");
						}
					}
					contas[qtdElementos] = new Conta(id, codigoCliente);
					acao = -1;//A acao precisa voltar a ser < 0 ou > 5 para pedir mais contas
					cadastro = -1;//Mesma lógica no cadastro
					break;
				case 3:
					//Mesma lógica anterior só que expandido para o número da conta
					while(id < 0 || codigoCliente < 0 || numeroConta < 0) {
						input = JOptionPane.showInputDialog("Informe o ID.");
						input2 = JOptionPane.showInputDialog("Informe o Código do Cliente.");
						input3 = JOptionPane.showInputDialog("Informe o Número da Conta.");
						try {
							id = Integer.parseInt(input);
							codigoCliente = Integer.parseInt(input2);
							numeroConta = Integer.parseInt(input3);
						}catch(NumberFormatException e) {
							id = -1;
							codigoCliente = -1;
							numeroConta = -1;
						}
						
						for(int i = 0; i < qtdElementos; i++) {
							if(contas[i].getId() == id || contas[i].getCodigoCliente() == codigoCliente || contas[i].getNumeroConta() == numeroConta) {
								id = -1;
								codigoCliente = -1;
								numeroConta = -1;
							}
						}
						
						if(id < 0 || codigoCliente < 0 || numeroConta < 0) {
							JOptionPane.showMessageDialog(null, "Algum valor inválido foi informado!");
						}
					}
					contas[qtdElementos] = new Conta(id, codigoCliente, numeroConta);
					acao = -1;//A acao precisa voltar a ser < 0 ou > 5 para pedir mais contas
					cadastro = -1;//Mesma lógica no cadastro
					break;
				}
				//Só depois que ele cadastrar é que ele soma, sendo possível atingir todas posições
				qtdElementos++;
				break;
			case 2:
				//Peço ao usuário a conta desejada e verifico se ela realmente é válida
				while(qualConta < 0 || qualConta > qtdElementos) {
					input = JOptionPane.showInputDialog("Informe em qual conta você gostaria de sacar:");
					try {
						qualConta = Integer.parseInt(input);
					}catch(NumberFormatException e) {
						qualConta = -1;
					}
					
					if(qualConta < 0 || qualConta > qtdElementos) {
						JOptionPane.showMessageDialog(null, "O valor informado é inválido!");
					}
				}
				
				//Peço ao usuário a quantia e verifico se ela é válida
				//Caso o valor informado seja maior que o valor existente na conta, levanta uma exceção
				while(quantia < 0) {
					input = JOptionPane.showInputDialog("Informe quanto você gostaria de sacar:");
					try {
						quantia = Double.parseDouble(input);
					}catch(NumberFormatException e) {
						quantia = -1;
					}
					
					if(quantia < 0) {
						JOptionPane.showMessageDialog(null, "O valor informado é inválido!");
					}
				}
				
				contas[qualConta].sacar(quantia);
				JOptionPane.showMessageDialog(null, "Operação Realizada Com Sucesso!!!");
				acao = -1;
				break;
			case 3:
				//Mesma lógica do case anterior
				while(qualConta < 0 || qualConta > qtdElementos) {
					input = JOptionPane.showInputDialog("Informe em qual conta você gostaria de depositar:");
					try {
						qualConta = Integer.parseInt(input);
					}catch(NumberFormatException e) {
						qualConta = -1;
					}
					
					if(qualConta < 0 || qualConta > qtdElementos) {
						JOptionPane.showMessageDialog(null, "O valor informado é inválido!");
					}
				}
				
				while(quantia < 0) {
					input = JOptionPane.showInputDialog("Informe quanto você gostaria de depositar:");
					try {
						quantia = Double.parseDouble(input);
					}catch(NumberFormatException e) {
						quantia = -1;
					}
					
					if(quantia < 0) {
						JOptionPane.showMessageDialog(null, "O valor informado é inválido!");
					}
				}
				
				contas[qualConta].depositar(quantia);
				JOptionPane.showMessageDialog(null, "Operação Realizada Com Sucesso!!!");
				acao = -1;
				break;
			case 4:
				for(int i = 0;i < qtdElementos ;i++) {
					contas[i].imprimirSaldo();
				}
				acao = -1;
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Volte Sempre!");
				acao = -1;
				desligar = 1;
				break;
			}
			
			//Encerra o programa quando o limite de contas for atingido
			if(qtdElementos == 7) {
				JOptionPane.showMessageDialog(null, "Número máximo de contas atingido!\n"
						+ "Volte Sempre!");
				acao = -1;
				desligar = 1;
			}
			
		}
		
	}

}
