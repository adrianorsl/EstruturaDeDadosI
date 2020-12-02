public class ListaDuplaAritmetica {
	private NodoDuplo inicio = null;
	private NodoDuplo fim = null;
	private NodoDuplo aux = null;
	
	public void inserirInicio(int num){
		NodoDuplo novo = new NodoDuplo();
		novo.num = num;
		if (inicio == null){
			//a lista est� vazia e o elemento ser� o primeiro e o �ltimo
			inicio = novo;
			fim = novo;
			novo.prox = null;
			novo.ant = null;
		}
		else
		{
			//a lista j� cont�m elementos e o novo elemento
			//ser� inserido no in�cio da lista
			novo.prox = inicio;
			inicio.ant = novo;
			novo.ant = null;
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
				aux =  aux.prox;
			}
		}
	}
public void inserirFinal(int num){
		NodoDuplo novo = new NodoDuplo(); 
		novo.num = num;
		if (inicio == null){
			//a lista est� vazia e o elemento ser� o primeiro e o �ltimo
			inicio = novo;
			fim = novo;
			novo.prox = null;
			novo.ant = null;
		}
		else
		{
			//a lista cont�m elementos e o novo elemento
			//ser� inserido no fim da lista
			fim.prox = novo;
			novo.ant = fim;
			novo.prox = null;
			fim = novo;
			
		}
		System.out.println("N�mero inserido no fim da lista");
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
			while (aux !=null){
				if (aux.num == num){
					achou++;
					//o n�mero foi encontrado na lista e ser� removido
					if (aux == inicio){
						inicio =  aux.prox;
						if (inicio != null){
							inicio.ant = null;
						}
						aux = inicio;
					}
					else if(aux == fim){
						fim = fim.ant;
						fim.prox = null;
						aux=  null;
					}
					else
					{
					      aux.ant.prox = aux.prox;
					      aux.prox.ant  = aux.ant;
					      aux = aux.prox; 
					}
				}
				else
				{
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
	  // Quantos nodos h� na lista 
	  public void ContandoNodo() {
		  int quantos = 0;
		  int vezes = 0;
		  int posicao = 0;
		  aux = inicio;
		  if (inicio == null) {
			  System.out.println("Lista vazia");
		  }else {
			  while (aux !=null){
					quantos++;
					aux =  aux.prox;
				}
			  System.out.println("Existem " + quantos + " Nodos.");
		  }	
		  if (inicio == null) {
			  System.out.println("Lista vazia");
		  }else {
			  aux = inicio;
			  while (aux !=null){
				 if (inicio.num == aux.num) {
					 vezes++;
					 posicao++;
					 System.out.println("Posi��o " + posicao);
				 }else {
					 posicao++;
				 }
				 aux = aux.prox; 
			  }
			  System.out.println("H� " + vezes + " do primeiro nodo que � " + inicio.num);
			  quantos = 0;
			  aux = inicio;
			  while(aux != null) {
				  if (inicio.num < aux.num) {
					  quantos++;
				  }
				  aux = aux.prox;
			  }
			  System.out.println("Existem " + quantos + " Nodos maiores que " + inicio.num);
		  }
	  }
	  
	  /**
	   * @author Adriano Zimmermann
	   *
	   */
	  
	  public void aritmetica() {
		  int menor = 10000;
		  int maior = 0;
		  float media = 0;
		  int quantidade = 0;
		  if (inicio == null) {
			  System.out.println("Lista vazia");
		  }else {
			  aux = inicio;
			  while (aux !=null){
				  quantidade++;
				  if (aux.num < menor) {
					  menor = aux.num;
				  }
				  if (aux.num > maior) {
					  maior = aux.num;
				  }
				  media = media + aux.num;
				  aux = aux.prox;
				 }
			  System.out.println("Maior n�mero: " + maior + " Menor n�mero: " + menor + " Media aritm�tica: " + media / quantidade);  
			  }
	  }
	  
	  
	}