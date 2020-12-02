
/**
 * @author Adriano
 *
 */
public class ListaFuncionarios {

	private NodoFuncionarios inicio = null;
	private NodoFuncionarios  fim = null;
	private NodoFuncionarios  aux = null;
	private NodoFuncionarios  anterior = null;
	private int quantidade = 0;
	
	public void inserirInicio(String nome, float salario){
		NodoFuncionarios  novo = new NodoFuncionarios ();
		novo.nome = nome;
		novo.salario = salario;
		if (inicio == null){
			//a lista está vazia e o elemento será o primeiro e o último
			inicio = novo;
			fim = novo;
			novo.prox = null; 
		}
		else
		{
			if (inicio.salario >= fim.salario) {
				novo.prox = inicio;
				inicio = novo;
			}else {
				fim.prox = novo;
				fim = novo;
				fim.prox = null;
				
			}
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
				System.out.println("Nome: " + aux.nome + ", Salario: " + aux.salario);
				aux = aux.prox;
			}
		}
	}
	
	public void removerNodo(String nome){
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
			while (aux !=null){
				if (aux.nome == nome){
					achou++;
					//o número foi encontrado na lista e será removido
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
			System.out.println("Nome: "+nome+" removido "+achou+" vezes");
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
				System.out.println("Nome: " + aux.nome + ", Salario: " + aux.salario);
				aux = aux.prox;
				quantidade = quantidade + 1;
			}
			System.out.println("Valor Total: " + quantidade);
		}
	}
	
	public void inserirFinal(String nome, float salario){
		NodoFuncionarios  novo = new NodoFuncionarios ();
		novo.nome = nome;
		novo.salario = salario;
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
