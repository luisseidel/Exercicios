package br.com.luis.exercicios.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("51 981.808.860");
		
		//Endereço
		Endereco endereco = new Endereco();
		endereco.setNomeRua("GOT");
		endereco.setNumeroRua("N/A");
		endereco.setComplemento(" Fuloni ");
		endereco.setCidade("Kings Landing");
		endereco.setEstado("Westeros");
		endereco.setCep("9999999");
		contato.setEndereco(endereco);
		
		//Telefone1
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("51");
		telefone.setNumero("981.808.860");
		
		//Telefone2
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("51");
		telefone2.setNumero("981.808.860");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		
		
		System.out.println("Nome: " + contato.getNome());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println("Endereço: " + contato.getEndereco().getCidade());
		}
		
		if(contato != null && contato.getTelefones() != null) {
			for (Telefone telefone3 : contato.getTelefones()) {
				System.out.println(telefone3.getDdd() + " - " + telefone3.getNumero());
			}
		}
	}
}
