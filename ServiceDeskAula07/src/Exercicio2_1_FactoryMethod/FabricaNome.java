package Exercicio2_1_FactoryMethod;

//* Jo�o Victor Bonfim Rocha 816118224

public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
