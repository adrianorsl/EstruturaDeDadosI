/**
 * @author Adriano
 *
 */

public class TesteListaAritmetica {

public static void main(String[] args) {
		
		ListaDuplaAritmetica minhaLista2 = new ListaDuplaAritmetica();
		
		minhaLista2.inserirInicio(9);
		minhaLista2.inserirFinal(9);
		minhaLista2.inserirFinal(3);
		minhaLista2.inserirFinal(7);
		minhaLista2.inserirFinal(5);
		minhaLista2.inserirFinal(9);
		
		minhaLista2.mostraLista();
		
		
		minhaLista2.removerNodo(3);
		minhaLista2.removerNodo(5);
		
		minhaLista2.mostraLista();
		
		minhaLista2.ContandoNodo();
		minhaLista2.aritmetica();
		
		
		
		
	}
}
