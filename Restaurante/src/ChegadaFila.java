
public class ChegadaFila {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	private Nodo anterior = null;
	private int quantidade = 0;
	
	
	public void inserirInicio(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		if (inicio == null){
			inicio = novo;
			fim = novo;
			novo.prox = null;
		}
		else
		{
			novo.prox = inicio;
			inicio = novo;
		}
		System.out.println("Valor inserido com sucesso!!");
	}
	
	public void mostraLista(){
		if (inicio == null){
			System.out.println("Ninguém na fila");
		}
		else
		{
			System.out.println("Mostrando toda a lista de pessoas na fila de espera");
			aux = inicio;
			while (aux !=null){
				System.out.println(aux.num);
				aux = aux.prox;
			}
		}
	}
	
	public void removerNodo(int num){
		int achou = 0;
		if (inicio == null){
			System.out.println("Ninguém na fila");
		}
		else
		{
			aux = inicio;
			anterior = null;
			while (aux !=null){
				if (aux.num == num){
					achou++;
					
					if (aux == inicio){
						inicio = aux.prox;
						aux = inicio;
					}
					else if(aux == fim){
						anterior.prox = null;
						fim = anterior;
						aux=  null;
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
			}
		}	
		if (achou == 0){
			System.out.println("Número não encontrado");
		}
		else
		{
			System.out.println("Número "+num+" removido "+achou+" vezes");
		}
	  }
	
	public void contarNodo() {
		
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			aux = inicio;
			while (aux !=null){
				aux = aux.prox;
				quantidade = quantidade + 1;
			}
			System.out.println("Quantidade de pessoas na fila: " + quantidade);
		}
	}
	
	public void inserirFinal(int num){
		Nodo novo = new Nodo(); 
		novo.num = num;
		if (inicio == null){
			inicio = novo;
			fim = novo;
			novo.prox = null;
		}
		else
		{
			novo.prox = inicio;
			inicio = novo;
		}
		System.out.println("Valor inserido com sucesso!!");
	}
	
}
