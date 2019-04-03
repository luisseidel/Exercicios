package br.com.luis.exercicios.aula43;
import calculadora.Calculadora;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println(" 7 em Decimal para binário: " + Calculadora.converterDecToBin(7));
		
		System.out.println("111 em Binário para Decimal: " + Calculadora.converterBinToDec(111));
		
		System.out.println("83 em Decimal para Octal: " + Calculadora.converterDecToOctal(83));
	
		System.out.println("123 em Octal para Decimal " + Calculadora.converterOctaltoDec(123));
		
		System.out.println("3F2 em Hexadecimal para Decimal " + Calculadora.converterHexToDec("3F2"));
	}
}