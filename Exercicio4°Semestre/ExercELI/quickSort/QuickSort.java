package quickSort;

import java.util.Random;



public class QuickSort {

	public static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio]; 		  //Define um novo pivo para separação
		int i = inicio + 1, f = fim;	  
		while (i <= f) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}

	public static void main(String[] args) {
		int quantidade = 100;
		int[] vetor = new int[quantidade];
		int[] vetor2 = new int[quantidade];
		Random a = new Random();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = a.nextInt(2000);
			vetor2[i] = a.nextInt(2000);
		}
		/*
		long tempoInicialBubble = System.currentTimeMillis();
		BubbleSort b = new BubbleSort();
		b.bubbleSort(vetor);
		long tempoFinalBubble = System.currentTimeMillis();
	*/


		long tempoInicial = System.currentTimeMillis();
		quickSort(vetor,0,vetor.length-1);
		long tempoFinal = System.currentTimeMillis();

		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
		//System.out.println("Executado em = " + (tempoFinalBubble - tempoInicialBubble) + " ms");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	/*
	Para ordenar um arranjo vetor inteiro, a chamada inicial é quickSort(vetor, 0, comprimento[vetor]).

A chave para o algoritmo é o procedimento separar, que reorganiza o subarranjo v


	 */
}
