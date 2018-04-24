package Exercicio1_1_Abstract_Factory;

//* João Victor Bonfim Rocha 816118224

//Fabrica de impressão no arquivo
public class FabricaArquivo implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoArquivo("output.txt");

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
