package br.com.luis.exercicios.aula43;

public class Teste {

	public static void main(String[] args) {
		
		String str = "aeiou";
		String k = "";
		String resultado = "";
		System.out.println(str.length());
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < k.length(); j++) {
				if(str.charAt(i) == k.charAt(j)) {
					resultado = str.replaceAll(Character.toString(k.charAt(j)), "");
					str = resultado;
				}
			}
		}
		System.out.println(resultado);
	}
}
