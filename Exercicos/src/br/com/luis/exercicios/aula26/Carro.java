package br.com.luis.exercicios.aula26;

public class Carro {
	String marca;
	String modelo;
	double capacidadeCombustivel;
	int numeroPassageiros;
	double consumoCombistivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é " + (consumoCombistivel * capacidadeCombustivel) + " km");
	}
	
	double obterAutonomia() {
		return capacidadeCombustivel * consumoCombistivel;
	}
}
