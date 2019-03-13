package br.com.luis.exercicios.aula26;

public class aula26main {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.capacidadeCombustivel = 100;
		carro.consumoCombistivel = 0.2;
		carro.numeroPassageiros = 7;
		carro.marca = "Fiat";
		carro.modelo = "Ducatti";
		
		System.out.println("O carro é da marca " + carro.marca + " e modelo " + carro.modelo + ". Ele possui " + carro.numeroPassageiros + " lugares e, ainda, fornece um tanque com capacidade de " + carro.capacidadeCombustivel + " litros.");
	
		carro.exibirAutonomia();
		
		carro.obterAutonomia();

		double autonomia = carro.obterAutonomia();
		System.out.println(autonomia);
	}
}
