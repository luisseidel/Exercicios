package br.com.luis.exercicios.aula32;

public class Carro {

	private String marca;
	private String modelo;
	private Integer numeroPassageiros;
	private Double quantidadeCombustivel;
	private Double consumoCombustivel;
	
	public Carro(String marca, String modelo, Integer numeroPassageiros, Double quantidadeCombustivel,
			Double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		this.quantidadeCombustivel = quantidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Integer getNumeroPassageiros() {
		return numeroPassageiros;
	}
	
	public void setNumeroPassageiros(Integer numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	
	public Double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	
	public void setQuantidadeCombustivel(Double quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public Double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(Double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	
	
	
	
}
