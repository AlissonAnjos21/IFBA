package br.com.prado;
import br.com.prado.Veiculo;

public class Carro extends Veiculo{
	
	private float vel_max;
	private int num_passag;
	private int num_portas;
	
	public Carro(String codigo, String renavam, String chassi, float preco, String placa, float vel_max, int num_passag, int num_portas){
		super(codigo, renavam, chassi, preco, placa);
		this.vel_max = vel_max;
		this.num_passag = num_passag;
		this.num_portas = num_portas;
	}
	
	public Carro(String codigo, String renavam, float vel_max, int num_passag, int num_portas){
		super(codigo, renavam);
		this.vel_max = vel_max;
		this.num_passag = num_passag;
		this.num_portas = num_portas;
	}
	
	public float getVel_max(){
		return this.vel_max;
	}
	
	public void setVel_max(float vel_max){
		this.vel_max = vel_max;
	}
	
	//-----------------------------//
	
	public int getNum_passag(){
		return this.num_passag;
	}
	
	public void setNum_passag(int num_passag){
		this.num_passag = num_passag;
	}
	
	//-----------------------------//
	
	public int getNum_portas(){
		return this.num_portas;
	}
	
	public void setNum_portas(int num_portas){
		this.num_portas = num_portas;
	}

}
