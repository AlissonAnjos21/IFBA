package Conta;

import javax.swing.JOptionPane;

public class Programa {
	
	public static void main(String[] args) throws Exception {
		Conta[] contas = new Conta[7];
		
		//Armazene 5 objetos
		
		//As informa��es para a cria��o das contas podem ser passadas pelo usu�rio.
		
		/*Utilize as fun��es sacar() e depositar() e imprima o saldo de todas as contas salvas,
		 *utilizando um la�o de repeti��o.*/
		
		int qtdElementos = 0;
		int desligar = 0;
		int acao = -1;//Come�ando com menos -1 para conseguir entrar no la�o while
		String input, input2, input3;//Vari�veis de suporte
		int cadastro = -1;//Come�ando com menos -1 para conseguir entrar no la�o while
		while(desligar != 1) {
			JOptionPane.showMessageDialog(null, "Seja Bem-Vindo(a)");
			
			//Evita valores incoerentes
			while(acao < 0 || acao > 5) {
				input = JOptionPane.showInputDialog("Informe o que voc� gostaria de realizar:\n"
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
					JOptionPane.showMessageDialog(null, "O valor informado � inv�lido!");
				}
			}
			
			//Primeiro dos Switchs, respons�vel por definir a a��o prim�ria
			double quantia = -1;//Sacar ou Depositar
			int qualConta = -1;
			switch(acao) {
			case 1:
				//Mesma l�gica anteriormente utilizada para valores incoerentes
				while(cadastro < 0 || cadastro > 3) {
					input = JOptionPane.showInputDialog("Informe que tipo de conta voc� deseja cadastrar:\n"
							+ "1 - Apenas criar conta.\n"
							+ "2 - Criar conta com ID e C�digo do Cliente.\n"
							+ "3 - Criar conta com ID, C�digo do Cliente e N�mero da Conta.");
					try {
						cadastro = Integer.parseInt(input);
					}catch(NumberFormatException e) {
						cadastro = -1;
					}
					
					if(cadastro < 0 || cadastro > 3) {
						JOptionPane.showMessageDialog(null, "O valor informado � inv�lido!");
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
					cadastro = -1;//Mesma l�gica no cadastro
					break;
				case 2:
					while(id < 0 || codigoCliente < 0) {
						input = JOptionPane.showInputDialog("Informe o ID.");
						input2 = JOptionPane.showInputDialog("Informe o C�digo do Cliente.");
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
							JOptionPane.showMessageDialog(null, "Algum valor inv�lido foi informado!");
						}
					}
					contas[qtdElementos] = new Conta(id, codigoCliente);
					acao = -1;//A acao precisa voltar a ser < 0 ou > 5 para pedir mais contas
					cadastro = -1;//Mesma l�gica no cadastro
					break;
				case 3:
					//Mesma l�gica anterior s� que expandido para o n�mero da conta
					while(id < 0 || codigoCliente < 0 || numeroConta < 0) {
						input = JOptionPane.showInputDialog("Informe o ID.");
						input2 = JOptionPane.showInputDialog("Informe o C�digo do Cliente.");
						input3 = JOptionPane.showInputDialog("Informe o N�mero da Conta.");
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
							JOptionPane.showMessageDialog(null, "Algum valor inv�lido foi informado!");
						}
					}
					contas[qtdElementos] = new Conta(id, codigoCliente, numeroConta);
					acao = -1;//A acao precisa voltar a ser < 0 ou > 5 para pedir mais contas
					cadastro = -1;//Mesma l�gica no cadastro
					break;
				}
				//S� depois que ele cadastrar � que ele soma, sendo poss�vel atingir todas posi��es
				qtdElementos++;
				break;
			case 2:
				//Pe�o ao usu�rio a conta desejada e verifico se ela realmente � v�lida
				while(qualConta < 0 || qualConta > qtdElementos) {
					input = JOptionPane.showInputDialog("Informe em qual conta voc� gostaria de sacar:");
					try {
						qualConta = Integer.parseInt(input);
					}catch(NumberFormatException e) {
						qualConta = -1;
					}
					
					if(qualConta < 0 || qualConta > qtdElementos) {
						JOptionPane.showMessageDialog(null, "O valor informado � inv�lido!");
					}
				}
				
				//Pe�o ao usu�rio a quantia e verifico se ela � v�lida
				//Caso o valor informado seja maior que o valor existente na conta, levanta uma exce��o
				while(quantia < 0) {
					input = JOptionPane.showInputDialog("Informe quanto voc� gostaria de sacar:");
					try {
						quantia = Double.parseDouble(input);
					}catch(NumberFormatException e) {
						quantia = -1;
					}
					
					if(quantia < 0) {
						JOptionPane.showMessageDialog(null, "O valor informado � inv�lido!");
					}
				}
				
				contas[qualConta].sacar(quantia);
				JOptionPane.showMessageDialog(null, "Opera��o Realizada Com Sucesso!!!");
				acao = -1;
				break;
			case 3:
				//Mesma l�gica do case anterior
				while(qualConta < 0 || qualConta > qtdElementos) {
					input = JOptionPane.showInputDialog("Informe em qual conta voc� gostaria de depositar:");
					try {
						qualConta = Integer.parseInt(input);
					}catch(NumberFormatException e) {
						qualConta = -1;
					}
					
					if(qualConta < 0 || qualConta > qtdElementos) {
						JOptionPane.showMessageDialog(null, "O valor informado � inv�lido!");
					}
				}
				
				while(quantia < 0) {
					input = JOptionPane.showInputDialog("Informe quanto voc� gostaria de depositar:");
					try {
						quantia = Double.parseDouble(input);
					}catch(NumberFormatException e) {
						quantia = -1;
					}
					
					if(quantia < 0) {
						JOptionPane.showMessageDialog(null, "O valor informado � inv�lido!");
					}
				}
				
				contas[qualConta].depositar(quantia);
				JOptionPane.showMessageDialog(null, "Opera��o Realizada Com Sucesso!!!");
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
				JOptionPane.showMessageDialog(null, "N�mero m�ximo de contas atingido!\n"
						+ "Volte Sempre!");
				acao = -1;
				desligar = 1;
			}
			
		}
		
	}

}
