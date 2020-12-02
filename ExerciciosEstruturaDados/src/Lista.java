public class Lista {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	private Nodo anterior = null;
	private int quantidade = 0;
	
	
	public void inserirInicio(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		if (inicio == null){
			//a lista est� vazia e o elemento ser� o primeiro e o �ltimo
			inicio = novo;
			fim = novo;
			novo.prox = null;
		}
		else
		{
			//a lista j� cont�m elementos e o novo elemento
			//ser� inserido no in�cio da lista
			novo.prox = inicio;
			inicio = novo;
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
			while (aux !=null){
				System.out.println(aux.num);
				aux = aux.prox;
			}
		}
	}
	
	public void removerNodo(int num){
		int achou = 0;
		if (inicio == null){
			System.out.println("Lista vazia");
		}
		else
		{
			//a lista cont�m elementos e o elemento a ser
			//removido foi passado como par�metro
			aux = inicio;
			anterior = null;
			while (aux !=null){
				if (aux.num == num){
					achou++;
					//o n�mero foi encontrado na lista e ser� removido
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
			System.out.println("N�mero n�o encontrado");
		}
		else
		{
			System.out.println("N�mero "+num+" removido "+achou+" vezes");
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
				System.out.println(aux.num);
				aux = aux.prox;
				quantidade = quantidade + 1;
			}
			System.out.println("Valor Total: " + quantidade);
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
	
	public void deTrasFrente () {
		int[] arrayNovo = new int[quantidade];
		if (inicio == null) {
			System.out.println("Lista Vazia");
		}else {
			aux = inicio;
			for (int i = 0; i < quantidade; i++) {
				arrayNovo[i] = aux.num;
				aux = aux.prox;
			}
			for (int x = quantidade - 1; x >= 0; x--) {
				System.out.println(arrayNovo[x]);
			}			
		}
		
	}
	
}


