package br.com.luis.exercicios.aula43;

public class ContaPoupanca extends ContaBancaria{

	private Integer diaRendimento;
	
	public double calcularNovoSaldo(Double taxaRendimento) {
		return taxaRendimento*getSaldo();
	}

	public Integer getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(Integer diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
}
