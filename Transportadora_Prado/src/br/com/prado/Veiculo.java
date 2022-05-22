package br.com.prado;

public class Veiculo {
	
	private String codigo;
	private String renavam;
	private String chassi;
	private float preco;
	private String placa;
	
	public Veiculo(String codigo, String renavam, String chassi, float preco, String placa){
		this.codigo = codigo;
		this.renavam = renavam;
		this.chassi = chassi;
		this.preco = preco;
		this.placa = placa;
	}
	
	public Veiculo(String codigo, String renavam){
		this.codigo = codigo;
		this.renavam = renavam;
		this.chassi = "";
		this.preco = 0;
		this.placa = "";
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	
	//-----------------------------//
	
	public String getRenavam(){
		return this.renavam;
	}
	
//	private void setRenavam(String renavam){
//		this.renavam = renavam;
//	}
	
	//-----------------------------//
	
	public String getChassi(){
		return this.chassi;
	}
	
//	private void setChassi(String chassi){
//		this.chassi = chassi;
//	}
	
	//-----------------------------//
	
	public float getPreco(){
		return this.preco;
	}
	
	public void setPreco(float preco){
		this.preco = preco;
	}
	
	//-----------------------------//
	
	public String getPlaca(){
		return this.placa;
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}
	
	
	

}
