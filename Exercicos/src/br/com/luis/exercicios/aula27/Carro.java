package br.com.luis.exercicios.aula27;

public class Carro {

	String marca;
	String modelo;
	double capacidadeCombustivel;
	int numeroPassageiros;
	double consumoCombistivel;
	
	Carro() {
		
	}
	Carro(String marca, String modelo, double capacidadeCombustivel, int numeroPassageiros, double consumoCombustivel){
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombistivel = consumoCombustivel;
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
	}
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + (consumoCombistivel * capacidadeCombustivel) + " km");
	}
	
	double obterAutonomia() {
		return capacidadeCombustivel * consumoCombistivel;
	}
	
	double calculaCombustivel(double km) {
		return km/consumoCombistivel;
	}
}
