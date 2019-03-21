package br.com.luis.exercicios.aula43;

public class ContaBancaria {
	
	private String nomeCliente;
	private Integer numConta;
	private Double saldo;
	
	public ContaBancaria() {
		
	}
	
	public boolean sacar(Double valor) {
		if(saldo < valor) {
			System.out.println("O seu saldo é menor que o valor que quer sacar");
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	

	
}
