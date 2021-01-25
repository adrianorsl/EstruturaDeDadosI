
public class Mesas {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;
	private Nodo anterior = null;
	private int quantidade = 0;
	private int almo�ando = 0;
	

	public void inserirInicio(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		if (inicio == null){
			inicio = novo;
			fim = novo;
			novo.prox = null;
			almo�ando --;
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
			System.out.println("N�o h� mesas dispon�veis");
		}
		else
		{
			System.out.println("Mostrando todas as mesas dispon�veis");
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
			System.out.println("N�o h� mesas dispon�veis");
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
						almo�ando ++;
					}
					else if(aux == fim){
						anterior.prox = null;
						fim = anterior;
						aux=  null;
						almo�ando ++;
					}
					else
					{
						anterior.prox = aux.prox;
						aux = aux.prox;
						almo�ando ++;
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
			System.out.println("N�o h� mesas dispon�veis");
		}
		else
		{
			aux = inicio;
			while (aux !=null){
				aux = aux.prox;
				quantidade = quantidade + 1;
			}
			System.out.println("Quantidade de mesas dispon�veis: " + quantidade);
			System.out.println("Qunatidade de pessoas almo�ando: " + almo�ando);
		}
	}
	
	public void inserirFinal(int num){
		Nodo novo = new Nodo(); 
		novo.num = num;
		if (inicio == null){
			inicio = novo;
			fim = novo;
			novo.prox = null;
			almo�ando --;
		}
		else
		{
			novo.prox = inicio;
			inicio = novo;
			almo�ando --;
		}
		System.out.println("Valor inserido com sucesso!!");
	}
}
