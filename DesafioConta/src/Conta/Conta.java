package Conta;

import java.util.Random;

import javax.swing.JOptionPane;

public class Conta {
	private int id;
	private int numeroConta; //Valor máximo 99999
	private int codigoCliente;
	private double saldo;
	private int digitoVerificador; //Entre 0 e 9
	
	//GETTERS
	public int getId() {
		return this.id;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public int getCodigoCliente() {
		return this.codigoCliente;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getDigitoVerificador() {
		return this.digitoVerificador;
	}
	
	//SETTERS
	private void setId(int id) throws Exception{
		// O valor é valido?
		if(id < 0) {
			throw new Exception("O ID não pode ser negativo.");
		}
		this.id = id;
	}
	
	private void setNumeroConta(int numeroConta) throws Exception {
		// O valor é valido?
		if(numeroConta < 0 || numeroConta > 99999) {
			throw new Exception("O número da conta não pode ser negativo.");
		}
		this.numeroConta = numeroConta;
	}
	
	private void setCodigoCliente(int codigoCliente) throws Exception{
		// O valor é valido?
		if(codigoCliente < 0) {
			throw new Exception("O código do cliente não pode ser negativo.");
		}
		this.codigoCliente = codigoCliente;
	}
	
	private void setSaldo(double saldo) throws Exception {
		//Verificação baseado em Conta Poupança
		if(saldo < 0) {
			throw new Exception("O saldo não pode ser negativo");
		}
		this.saldo = saldo;
	}
	
	private void setDigitoVerificador(int digitoVerificador) throws Exception{
		// O valor é valido?
		if(digitoVerificador < 0 || digitoVerificador > 9) {
			throw new Exception("O digito verificador não pode ser negativo.");
		}
		this.digitoVerificador = digitoVerificador;
	}
	
	//Construtores
	public Conta() throws Exception {
		this.setSaldo(0);
		this.setNumeroConta(this.gerarNumeroConta());
		this.setDigitoVerificador(this.gerarDigitoVerificador());
	}
	
	public Conta(int id, int codigoCliente) throws Exception {
		this.setSaldo(0);
		this.setId(id);
		this.setCodigoCliente(codigoCliente);
		this.setNumeroConta(this.gerarNumeroConta());
		this.setDigitoVerificador(this.gerarDigitoVerificador());
	}
	
	public Conta(int id, int codigoCliente, int numeroConta) throws Exception {
		this.setSaldo(0);
		this.setId(id);
		this.setCodigoCliente(codigoCliente);
		this.setNumeroConta(numeroConta);
		this.setDigitoVerificador(this.gerarDigitoVerificador());
	}
	
	//Métodos Utilitários
	private int gerarNumeroConta() {
		Random random = new Random();
		// Gera um valor aleatório que vai de 0 até o número informado -1
		return random.nextInt(100000);
	}
	
	private int gerarDigitoVerificador() throws Exception {
		/*O digito verificador é encontrado multiplicando os algarismos do número 
		 * da conta e buscando o resto da divisão por 11 desse produto.
		 * Se o resto da divisão por 11 for 10, o digito verificador deve ser 0.*/
		int qtdDigitos = 0;
		float divisao = this.getNumeroConta() / 10000;
		
		//O valor máximo para o número da conta é 99999, logo o máximo de digitos é 5
		if(divisao >= 1) {
			qtdDigitos = 5;
		}else if(divisao < 1 && divisao >= 0.1) {
			qtdDigitos = 4;
		}else if(divisao < 0.1 && divisao >= 0.01) {
			qtdDigitos = 3;
		}else if(divisao < 0.01 && divisao >= 0.001) {
			qtdDigitos = 2;
		}else {
			//divisao < 0.001 && divisao >= 0.0001
			qtdDigitos = 1;
		}
		
		int[] digitos = new int[5];
		int valor = this.getNumeroConta();
		int multiplicador = 0;
		
		switch(qtdDigitos) {
		case 5:
			//Tem que ficar fora para que consiga diminuir na próxima iteração
			multiplicador = 10000;
			// Sempre menor que a quantidade total de dígitos
			for(int i = 0; i < qtdDigitos; i++) {
				digitos[i] = (int) valor/multiplicador;
				valor = valor - (digitos[i] * multiplicador);
				multiplicador *= 0.1;
			}
//			digitos[5] = (int) valor/10000;
//			valor = valor - (digitos[5] * 10000);
//			digitos[4] = (int) valor/1000;
//			valor = valor - (digitos[4] * 1000);
//			...
			break;
		case 4:
			//Abaixa uma dezena
			multiplicador = 1000;
			for(int i = 0; i < qtdDigitos; i++) {
				digitos[i] = (int) valor/multiplicador;
				valor = valor - (digitos[i] * multiplicador);
				multiplicador *= 0.1;
			}
			break;
		case 3:
			multiplicador = 100;
			for(int i = 0; i < qtdDigitos; i++) {
				digitos[i] = (int) valor/multiplicador;
				valor = valor - (digitos[i] * multiplicador);
				multiplicador *= 0.1;
			}
			break;
		case 2:
			multiplicador = 10;
			for(int i = 0; i < qtdDigitos; i++) {
				digitos[i] = (int) valor/multiplicador;
				valor = valor - (digitos[i] * multiplicador);
				multiplicador *= 0.1;
			}
			break;
		case 1:
			digitos[0] = valor;
			break;
		default:
			throw new Exception("Algum erro ocorreu");
		}
		
		int digitosMultiplicados = 1;
		for (int i = 0; i < qtdDigitos; i++) {
			digitosMultiplicados *= digitos[i];
		}
		
		//Obtendo o dígito verificador por meio do resto da divisão
		int resultado = digitosMultiplicados % 11;
		if(resultado == 10) {
			resultado = 0;
		}
		return resultado;
	}
	
	//Métodos de Manipulação de Saldo (Conta Poupança)
	public void sacar(double quantia) throws Exception {
		if(quantia > this.getSaldo()) {
			throw new Exception("Você não pode sacar um valor maior que o seu limite.");
		}else if(quantia < 0) {
			throw new Exception("Você não pode sacar um valor negativo.");
		}
		this.setSaldo(this.getSaldo() - quantia);
	}
	
	public void depositar(double quantia) throws Exception {
		if(quantia < 0) {
			throw new Exception("Você não pode depositar um valor negativo.");
		}
		this.setSaldo(quantia + this.getSaldo());
	}
	
	//Método de Visualização
	public void imprimirSaldo() {
		JOptionPane.showMessageDialog(null,"Você possui o saldo de: R$" + this.getSaldo());
	}

}
