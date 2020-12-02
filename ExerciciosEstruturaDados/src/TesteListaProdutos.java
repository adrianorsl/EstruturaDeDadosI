
/**
 * @author Adriano
 *
 */

public class TesteListaProdutos {

	public static void main(String[] args) {
		
		ListaCircularProdutos produtos = new ListaCircularProdutos();
		
		produtos.inserirInicio(1, 50, 150);
		produtos.inserirInicio(35, 80, 50);
		produtos.inserirInicio(28, 10, 120);
		
		
		produtos.mostraLista();
		
		produtos.desconto(10);
	}

}
