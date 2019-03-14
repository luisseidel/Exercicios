package br.com.luis.exercicios.aula34;

public class Contador {

	private static Integer contador;
	
	public Contador() {
		contador++;
	}

	public static void incrementarContador() {
		contador++;
	}
	
	public static void zerarContador() {
		contador = 0;
	}

	public static Integer getContador() {
		return contador;
	}
	
	public static void setContador(Integer contador) {
		Contador.contador = contador;
	}

	
}
