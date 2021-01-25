import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int senha = 100;
		int pilhaPratos = 36;
		int ms = 1000;
		int n = 0;
		int r = 2;
		int c = 0;
		ChegadaFila fila = new ChegadaFila();
		PilhaPratos pratos = new PilhaPratos();
		Mesas mesas = new Mesas();
		Caixa caixa = new Caixa();
		
		// Quantidade de pessoas na fila com números de senha.
		// número da senha começa em 100.
		while (senha < 151) {
			if (senha == 1) {
				fila.inserirInicio(senha);
			}else {
				fila.inserirFinal(senha);
			}
			senha ++;
		}
		
		//números de pratos inseridos na pinha de pratos
		int prt = 1;
		while (prt < 36) {
			if (senha == 1) {
				pratos.inserirInicio(prt);
			}else {
				pratos.inserirFinal(prt);
			}
			prt ++;
		}
		
		// númeração das mesas
		//números das mesas  começam em 1000
		while (ms < 1010) {
			if (senha == 1) {
				mesas.inserirInicio(ms);
			}else {
				mesas.inserirFinal(ms);
			}
			ms ++;
		}
		
		prt = pilhaPratos;
		senha = 100;
		ms = 1000;
		while ((prt > 0) && (ms < 1011)) {
			fila.removerNodo(senha);
			pratos.removerNodo(prt);
			prt --;
			mesas.removerNodo(ms);
			ms ++;
			
			System.out.println("Cliente terminou de comer? sim(1) ou não(2)");
			n = entrada.nextInt();
			if (n == 1) {
				c ++;
				if (c == 1) {
					caixa.inserirInicio(senha);
					prt ++;
					ms --;
					mesas.inserirInicio(ms);
					pratos.inserirFinal(prt);
				}else {
					caixa.inserirFinal(senha);
					prt ++;
					ms --;
					mesas.inserirInicio(ms);
					pratos.inserirFinal(prt);
				}
				
				while (r > 1) {
					System.out.println("Cliente pagou a conta? sim(1) ou não(2)");
					n = entrada.nextInt();
					if (n == 1) {
						caixa.removerNodo(senha);	
						c --;
						break;
					}else {
						r = 0;
					}
				}
				
				
			}else {
		    }
			senha ++;
			
	    }
		entrada.close();
		fila.mostraLista();
		fila.contarNodo();
		pratos.mostraLista();
		pratos.contarNodo();
		mesas.contarNodo();
		caixa.mostraLista();
		caixa.contarNodo();
		
	}

}
