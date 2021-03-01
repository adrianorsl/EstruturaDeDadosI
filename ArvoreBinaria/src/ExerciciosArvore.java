import java.util.Scanner;

public class ExerciciosArvore {
	//definindo a classe que representará
	//cada elemento da árvore binária
	private static class ARVORE{
		public int num;
		public ARVORE dir,esq;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//a árvore está vazia,logo, o objeto raiz tem valor nulo
		ARVORE raiz = null;
		//o objeto aux é um objeto auxiliar
		ARVORE aux;
		int op=0,achou,numero, maiorValor, menorValor;
		while (op!=15){
			System.out.println("Menu de opções");
			System.out.println("1- Inserir na árvore");
			System.out.println("2- Consultar um nó da árvore");
			System.out.println("3- Consultar toda a árvore em ordem");
			System.out.println("4- Excluir um nó da árvore");
			System.out.println("5- Esvaziar a árvore");
			System.out.println("6- Consultar o maior número");
			System.out.println("7- Consultar o menor número");
			System.out.println("8- Consultar nós folhas");
			System.out.println("9- Consultar um ancestral");
			System.out.println("10- Consultar os descendentes");
			System.out.println("11- Consultar a subárvore da direita");
			System.out.println("12- Consultar a subárvore da esquerda");
			System.out.println("13- Consultar quantos elementos existem nesta árvore");
			System.out.println("14- Consultar os números pares");
			System.out.println("15- Sair");
			System.out.println("Digite opção");
			op = entrada.nextInt();
			if (op==1){
				System.out.println("Digite número a ser inserido na árvore");
				numero = entrada.nextInt();
				raiz = inserir(raiz,numero);
				System.out.println("Número inserido na árvore");
			}
			if (op==2){
				if (raiz == null){
					System.out.println("Árvore vazia");
				}
				else{
					//a árvore contém elementos
					System.out.println("Digite elemento a ser consultado");
					numero = entrada.nextInt();
					achou = 0;
					achou = consultar(raiz,numero,achou);
					if (achou==0){
						System.out.println("Número não encontrado na árvore");
					}
					else{
						System.out.println("Número encontrado na árvore");
					}
				}
			}
			if (op == 3){
				if (raiz==null){
					System.out.println("Árvore vazia");
				}
				else{
					//a arvore contém elementos e estes serão
					//mostrados em ordem
					System.out.println("Listando todos os elementos da árvore em ordem");
					mostraremordem(raiz);
				}
				System.out.println();
					
			}
		  if (op == 4){
			  if (raiz == null){
				  System.out.println("Árvore vazia");
			  }
			  else{
				  System.out.println("Digite o número que deseja excluir");
				  numero =  entrada.nextInt();
				  achou = 0;
				  achou = consultar(raiz,numero,achou);
				  if (achou == 0){
					  System.out.println("Número não encontrado na árvore");
				  }
				  else{
					  raiz = remover(raiz,numero);
					  System.out.println("Número excluido da árvore");
				  }
			  }
		  }
		  if (op == 5){
			  if (raiz == null){
				  System.out.println("Árvore vazia");
			  }
			  else
			  {
				  raiz = null;
				  System.out.println("Árvore esvaziada");
			  }
		  }
		  // 2-a Mostrar o maior número
		  if (op == 6){
			  numero = 0;
			  maiorValor = 0;
			  maiorValor = maiorNumero(raiz,numero,maiorValor);
			  if (raiz == null){
					System.out.println("Árvore vazia");
				}
				else{
					System.out.println("O maior número é: " + maiorValor);
				}
		  }
		  // 2-b Mostrar o menor número
		  if (op == 7){
			  numero = 1500;
			  menorValor = 0;
			  menorValor = menorNumero(raiz,numero,menorValor);
			  if (raiz == null){
					System.out.println("Árvore vazia");
				}
				else{
					System.out.println("O menor número é: " + menorValor);
				}
		  }
		  // 2-c Mostrar os nós folhas
		  if (op == 8) {
			  if (raiz == null) {
				  System.out.println("Árvore vazia");
			  }else {
				  System.out.println("Mostrar nós folhas: ");
				  folhas(raiz);
			  }
			 System.out.println();
		  }
		  // 2-d Mostrar os nós ancestrais de um nó
		  if (op == 9) {
			  if (raiz == null){
					System.out.println("Árvore vazia");
				}
				else{
					System.out.println("Digite elemento a ser consultado");
					numero = entrada.nextInt();
					achou = 0;
					achou = ancestrais(raiz,numero,achou);
					if (achou==0){
						System.out.println("Número não encontrado na árvore");
					}
					else{
						System.out.println("O ancestral de "+ numero + " é: " + achou);
					}
				}
		  }
		  // 2-e Mostrar os nós descendentes de um nó
		  if (op == 10) {
			  if (raiz == null){
					System.out.println("Árvore vazia");
				}else {
					System.out.println("Digite elemento a ser consultado");
					numero = entrada.nextInt();
					achou = 0;
					achou = descendente(raiz,numero,achou);
					if (achou==0){
						System.out.println("Número não encontrado na árvore");
					}else {
						System.out.println("Os descendentes de "+ numero + " são: ");
						descendente(raiz,numero,achou);
					}
				}
			  
		  }
		  // 2-f Mostrar a subárvore da direita de um nó
		  if (op == 11) {
			  if (raiz == null){
					System.out.println("Árvore vazia");
				}
			  else {
				System.out.println("Digite elemento a ser consultado");
				numero = entrada.nextInt();
				achou = 0;
				achou = direita(raiz,numero,achou);
				if (achou==0){
					System.out.println("Número não encontrado na árvore");
				}else {
					System.out.println("A subárvore do "+ numero + " é: ");
					direita(raiz,numero,achou);
				}
			}
		  }
		  // 2-g Mostrar a subárvore da esquerda de um nó
		  if (op == 12) {
			  if (raiz == null){
					System.out.println("Árvore vazia");
				}
			  else {
				  System.out.println("Digite elemento a ser consultado");
				  numero = entrada.nextInt();
				  achou = 0;
				  achou = esquerda(raiz,numero,achou);
				  if (achou==0){
					  System.out.println("Número não encontrado na árvore");
				  }else {
					  System.out.println("A subárvore do "+ numero + " é: ");
					  esquerda(raiz,numero,achou);
				}
			}
		  }
		  // 2-h Contar quantos elementos existe na árvore
		  if (op == 13) {
			  if (raiz == null){
					System.out.println("Árvore vazia");
			  }else {				   
				  conta(raiz);
				  System.out.println("Existem "+soma2+ ", elementos na árvore");
			  }
		  }
		  // 2-j Mostrar somente os números pares
		  if (op == 14) {
			  if (raiz == null){
					System.out.println("Árvore vazia");
			  }else {
				  System.out.println("Os números pares são: ");
				  pares(raiz);
				  
			  }
		  }
		}
	}
	
	public static ARVORE inserir(ARVORE aux, int num){
		if (aux == null){
			aux = new ARVORE();
			aux.num = num;
			aux.esq = null;
			aux.dir = null;
		}
		else{
			if (num < aux.num){
				aux.esq = inserir(aux.esq,num);
			}
			else{
				aux.dir = inserir(aux.dir,num);
			}
		}
		return aux;
	}
	public static int consultar(ARVORE aux,int num, int achou){
		if (aux !=null && achou == 0){
			if (aux.num == num){
				achou = 1;
			}
			else if (num < aux.num)
					achou = consultar(aux.esq,num,achou);
				else
					achou = consultar(aux.dir,num,achou);	
		}
		return achou;
	}
	public static void mostraremordem(ARVORE aux){
		if (aux!=null){	
			mostraremordem(aux.dir);
			System.out.print(aux.num+" ");
			mostraremordem(aux.esq);	
		}
	}
	public static ARVORE remover(ARVORE aux, int num){
		ARVORE p, p2;
		if (aux.num == num){
			if (aux.esq == aux.dir){
				//o elemento a ser removido não tem filhos
				return null;
			}
			else if(aux.esq == null){
				//o elemento a ser removido não tem filho
				//para esquerda
				return aux.dir;
			}
			else if (aux.dir == null){
				//o elemento a ser removido não tem filho
				//para direita
				return aux.esq;
			}
			else{
				//o elemento a ser removido tem filhos
				//para ambos os lados
				p2 = aux.dir;
				p = aux.dir;
				while (p.esq !=null){
					p=p.esq;
				}
				p.esq = aux.esq;
				return p2;
			}
		}
		else if (aux.num < num){
			aux.dir = remover(aux.dir,num);
		}
		else{
			aux.esq = remover(aux.esq,num);
		}

		return aux;
	}
	// 2-a mostrar o maior número
	public static int maiorNumero (ARVORE aux,int num,int maiorValor) {
		if (aux !=null){
			if (aux.num > num){	
				num = aux.num;
				maiorValor = aux.num;
				maiorValor = maiorNumero(aux.dir,num,maiorValor);	
			}	
		}
		return maiorValor;
		
	}
	// 2-b mostrar o nenor número	
	public static int menorNumero (ARVORE aux,int num,int menorValor) {
		if (aux !=null){
			if (aux.num < num){	
				num = aux.num;
				menorValor = aux.num;
				menorValor = menorNumero(aux.esq,num,menorValor);	
			}
		}
		return menorValor;
			
	}
	// 2-c Mostrar os nós folhas	
	public static void folhas(ARVORE aux){
		if (aux.dir == null && aux.esq == null) {
			System.out.print(aux.num +" ");	

		}else {
			if (aux.dir != null) {
				folhas(aux.dir);
			}
			if (aux.esq != null) {
				folhas(aux.esq);
			}
		}
	}
	// 2-d Mostrar os nós ancestrais de um nó
	public static int ancestrais (ARVORE aux,int num, int achou) {
			if (aux !=null){	
				if (aux.num == num){
					
				}
				else if (num < aux.num) {
					achou = aux.num;
					achou = ancestrais(aux.esq,num,achou);
				}else {
					achou = aux.num;
					achou = ancestrais(aux.dir,num,achou);
				}
							
			}
			return achou;
	}
	// 2-e Mostrar os nós descendentes de um nó
	public static int descendente (ARVORE aux,int num,int achou) {
		if (aux !=null){	
			if (aux.num == num){
				if (aux.dir != null) {
					descendente2(aux.dir);	
				}
				else if (aux.esq != null) {
					descendente2(aux.esq);
				}
			}else if (num < aux.num) {
				 descendente(aux.esq,num,achou);	 
			}else {
				 descendente(aux.dir,num,achou);		 
			}
			return achou = 1;			
		}else{
			return achou = 0;
		}
	}
	// 2-e Mostrar os nós descendentes de um nó, classe auxiliar
	public static void descendente2 (ARVORE aux) {
		if (aux != null) {
			System.out.println(aux.num +" ");
			descendente2(aux.dir);
			descendente2(aux.esq);
		}
		
	}
	// 2-f Mostrar a subárvore da direita de um nó
	public static int direita (ARVORE aux, int num,int achou) {
		if (aux != null) {
			if (aux.num == num){
				if (aux.dir != null) {
					dir(aux.dir);	
				}
			}return achou = 1;
		}else {
			return achou = 0;
		}
	}
	// 2-f Mostrar a subárvore da direita de um nó classe auxiliar
	public static void dir (ARVORE aux) {
			if (aux != null) {
				System.out.println(aux.num +" ");
				dir(aux.dir);
				dir(aux.esq);
			}
	}
	// 2-g Mostrar a subárvore da esquerda de um nó
	public static int esquerda (ARVORE aux, int num,int achou) {
		if (aux != null) {
			if (aux.num == num){
				if (aux.esq != null) {
					esq(aux.esq);	
				}
			}return achou = 1;
		}else {
			return achou = 0;
		}
	}
	
	// 2-g Mostrar a subárvore da esquerda de um nó classe auxiliar
	public static void esq (ARVORE aux) {
		if (aux != null) {
			System.out.println(aux.num +" ");
			dir(aux.esq);
			dir(aux.dir);
		}
	}
	// 2-h Contar quantos elementos existe na árvore
	static int soma2 = 0;
	public static void conta (ARVORE aux ) {
		if (aux != null) {
			soma2++;
			conta(aux.dir);
			conta(aux.esq);
		}
	}
	 // 2-j Mostrar somente os números pares
	public static void pares (ARVORE aux) {
		if (aux != null) {
			if (aux.num % 2 == 0) {
				System.out.println(aux.num);
				pares(aux.dir);
				pares(aux.esq);
			}else {
				pares(aux.dir);
				pares(aux.esq);
			}
		}
	}
	
	
	
}