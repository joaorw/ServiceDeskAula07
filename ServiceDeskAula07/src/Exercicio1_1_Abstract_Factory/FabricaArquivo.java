package Exercicio1_1_Abstract_Factory;

//* Jo�o Victor Bonfim Rocha 816118224

//Fabrica de impress�o no arquivo
public class FabricaArquivo implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoArquivo("output.txt");

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
