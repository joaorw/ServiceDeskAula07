package Exercicio2_1_FactoryMethod;

//* Jo�o Victor Bonfim Rocha 816118224

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Anderson";
		String sobrenome = "Castro";
		
		fn.getNome(nome, sobrenome);

	}

}