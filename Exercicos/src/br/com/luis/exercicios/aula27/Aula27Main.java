package br.com.luis.exercicios.aula27;

import br.com.luis.exercicios.aula27.Carro;

public class Aula27Main {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.capacidadeCombustivel = 100;
		carro.consumoCombistivel = 1.8;
		carro.numeroPassageiros = 7;
		carro.marca = "Fiat";
		carro.modelo = "Ducatti";
		
		
		
		System.out.println("O carro é da marca " + carro.marca + " e modelo " + carro.modelo + ". Ele possui " + carro.numeroPassageiros + " lugares e, ainda, fornece um tanque com capacidade de " + carro.capacidadeCombustivel + " litros.");
	
		carro.exibirAutonomia();
		
		carro.obterAutonomia();

		double autonomia = carro.obterAutonomia();
		System.out.println(autonomia);
		
		double quantidadeCombustivel = carro.calculaCombustivel(10);
		System.out.println("O carro precisa de " + quantidadeCombustivel + " litros para rodar 10 quilometros");
	}
}
