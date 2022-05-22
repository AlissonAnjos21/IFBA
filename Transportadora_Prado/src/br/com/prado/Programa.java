package br.com.prado;
import br.com.prado.Carro;
import br.com.prado.Caminhao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String [] args) throws Exception {
//		Carro carro = new Carro("123", "abc", "403", 1000, "abc123", 260, 4, 2);
//		Caminhao caminhao = new Caminhao("456", "def", "404", 10000, "def456", 7, 3000);
//
//		System.out.println(carro.getCodigo());
//		System.out.println(caminhao.getCodigo());

		CarroArrayList();
		CaminhaoArrayList();
		
	}

	public static void CarroArrayList() throws FileNotFoundException {
		System.out.println("############# - Lista de Carros - #############");
		System.out.println("############# Testando o ArrayList #############");
		System.out.println();
		ArrayList listaCarro = new ArrayList();

		Scanner scan = new Scanner(new File("src/br/com/prado/carro.csv"));

		while(scan.hasNext()){
			String linha = scan.nextLine();
			String[] itens = linha.split(",");

			Carro Carro00 = new Carro(itens[0], itens[1], itens[2], Float.parseFloat(itens[3]), itens[4], Float.parseFloat(itens[5]), Integer.parseInt(itens[6]), Integer.parseInt(itens[7]));
			listaCarro.add(Carro00);

			System.out.println(Carro00.getChassi());
			System.out.println(linha);
			System.out.println();
		}
		scan.close();

		System.out.println();
		System.out.println("############# Lendo os dados armazenados #############");
		System.out.println();
//		System.out.println(listaCarro);

		for(int i = 0; i < listaCarro.size(); i++){
			Carro ref = (Carro) listaCarro.get(i);
//			System.out.println(ref);
			System.out.println(ref.getPlaca());
		}
		System.out.println();
		System.out.println("####################################################");
		System.out.println();
	}

	public static void CaminhaoArrayList() throws FileNotFoundException {
		System.out.println("############# - Lista de Caminhões - #############");
		System.out.println("############# Testando o ArrayList #############");
		System.out.println();
		ArrayList listaCaminhao = new ArrayList();

		Scanner scan = new Scanner(new File("src/br/com/prado/caminhao.csv"));

		while(scan.hasNext()){
			String linha = scan.nextLine();
			String[] itens = linha.split(",");

			Caminhao Caminhao00 = new Caminhao(itens[0], itens[1], itens[2], Float.parseFloat(itens[3]), itens[4], Integer.parseInt(itens[5]), Float.parseFloat(itens[6]));
			listaCaminhao.add(Caminhao00);

			System.out.println(Caminhao00.getChassi());
			System.out.println(linha);
			System.out.println();
		}
		scan.close();

		System.out.println();
		System.out.println("############# Lendo os dados armazenados #############");
		System.out.println();
//		System.out.println(listaCaminhao);

		for(int i = 0; i < listaCaminhao.size(); i++){
			Caminhao ref = (Caminhao) listaCaminhao.get(i);
//			System.out.println(ref);
			System.out.println(ref.getPlaca());
		}
		System.out.println();
		System.out.println("####################################################");
		System.out.println();
	}

}
