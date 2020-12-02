/**
 * @author Adriano
 *
 */

public class ListaCircularProdutos {
	private NodoProdutos inicio = null;
	private NodoProdutos fim = null;
	private NodoProdutos aux = null;
	private NodoProdutos anterior = null;
	
	public void inserirInicio(int codigo, float preco, int quantidade ){
		NodoProdutos novo = new NodoProdutos();
		novo.codigo = codigo;
		novo.preco = preco;
		novo.quantidade = quantidade;
		
		if (inicio == null){
			//a lista está vazia e o elemento será o primeiro e o último
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		}
		else 
		{
			//a lista já contém elementos e o novo elemento
			//será inserido no início da lista
			novo.prox = inicio;
			inicio = novo;
			fim.prox = inicio;
		}
		System.out.println("Valor inserido com sucesso!!");
	}
	
	public void mostraLista(){
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println("Mostrando toda a lista");
			aux = inicio;
			do{
				System.out.println("Codigo: " + aux.codigo + " Preço: " + aux.preco + " Quantidade: " + aux.quantidade);
				aux = aux.prox;
			}while (aux !=inicio);
		}
	}
	public void inserirFinal(int codigo, float preco, int quantidade){
		NodoProdutos novo = new NodoProdutos();
		novo.codigo = codigo;
		novo.preco = preco;
		novo.quantidade = quantidade;
		if (inicio == null){
			//a lista está vazia e o elemento será o primeiro e o último
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		}
		else
		{
			//a lista contém elementos e o novo elemento
			//será inserido no fim da lista
			fim.prox = novo;
			fim = novo;
			fim.prox = inicio;
		}
		System.out.println("Número inserido no fim da lista");
	}	
	public void removerNodo(int codigo){
		int achou = 0;
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			//a lista contém elementos e o elemento a ser
			//removido foi passado como parâmetro
			aux = inicio;
			anterior = null;
			do{
				if (aux.codigo == codigo){
					achou++;
					//o código foi encontrado na lista e será removido
					if (inicio == fim){
						inicio= null;
					}
					if (aux == inicio){
						inicio = aux.prox;
						fim.prox = inicio;
						aux = inicio;
					}
					else if(aux == fim){
						fim = anterior;
						fim.prox = inicio;
						aux = aux.prox;
					}
					else
					{
						anterior.prox = aux.prox;
						aux = aux.prox;
					}
				}
				else
				{
					anterior = aux;
				    aux= aux.prox;	
				}
			
			}while (aux !=inicio);
		}	
		if (achou == 0){
			System.out.println("Número não encontrado");
		}
		else
		{
			System.out.println("Código "+codigo+" removido "+achou+" vezes");
		}
	  }
	
	public void desconto (float desconto) {
		desconto = desconto / 100;
		if (inicio == null) {
			System.out.println("Lista está vazia.");
		}else {
			aux = inicio;
			do {
				aux.preco = aux.preco - (desconto * aux.preco);
				aux = aux.prox;
			}while (aux != inicio);
			System.out.println("Mostrando toda a lista");
			aux = inicio;
			do{
				System.out.println("Codigo: " + aux.codigo + " Preço: " + aux.preco);
				aux = aux.prox;
			}while (aux !=inicio);
			aux = inicio;
			System.out.println("Produtos em estoque com mais de 100 produtos.");
			do {
				if (aux.quantidade > 100) {
					System.out.println("Código: " + aux.codigo + " Quantidade: " + aux.quantidade);
				}
				aux = aux.prox;
			}while (aux != inicio);
			
		}	
	}
	}