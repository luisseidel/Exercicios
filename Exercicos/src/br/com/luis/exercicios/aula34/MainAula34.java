package br.com.luis.exercicios.aula34;

public class MainAula34 {
	
	public static void imprimirContador() {
		System.out.println(Contador.getContador());
	}
	
	public static void main(String[] args) {
		
		Contador.setContador(0);
		imprimirContador();
		Contador.incrementarContador();
		Contador.incrementarContador();
		Contador.incrementarContador();
		imprimirContador();
		Contador.zerarContador();
		
		imprimirContador();
		
		Contador c = new Contador();
		Contador c1 = new Contador();
		imprimirContador();
	}
}
