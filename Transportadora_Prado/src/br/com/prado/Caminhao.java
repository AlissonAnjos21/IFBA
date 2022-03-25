package br.com.prado;
import br.com.prado.Veiculo;

public class Caminhao extends Veiculo{
	
	private int num_eixos;
	private float capac_carga;
	
	public Caminhao(String codigo, String renavam, String chassi, float preco, String placa, int num_eixos, float capac_carga){
		super(codigo, renavam, chassi, preco, placa);
		this.num_eixos = num_eixos;
		this.capac_carga = capac_carga;
	}
	
	public Caminhao(String codigo, String renavam, int num_eixos, float capac_carga){
		super(codigo, renavam);
		this.num_eixos = num_eixos;
		this.capac_carga = capac_carga;
	}
	
	public int getNum_eixos(){
		return this.num_eixos;
	}
	
	public void setNum_eixos(int num_eixos){
		this.num_eixos = num_eixos;
	}
	
	//-----------------------------//
	
	public float getCapac_carga(){
		return this.capac_carga;
	}
	
	public void setCapac_carga(float capac_carga){
		this.capac_carga = capac_carga;
	}

}
