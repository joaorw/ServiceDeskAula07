package Exercicio1_1_Abstract_Factory;

//* Jo�o Victor Bonfim Rocha 816118224

//Fabrica de impress�o na tela
public class FabricaTela implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoTela();

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
