package br.com.luis.exercicios.aula39;

public class Aluno extends Pessoa{
	

	private String curso;
	private double[] notas;
	
	
	
	public Aluno() {
		
	}
	public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
		super(nome, endereco, telefone, cpf);
		this.curso = curso;
		this.notas = notas;
	}
	
	public void verificarAcesso() {
		
	}

	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
}
