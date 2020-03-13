package ordenação;

public class BubbleSort {

	public void troca(int a, int b) {
		int aux = a;
		a = b;
		b = aux;
	}

	public void bubbleSort(int[] vet) {
		System.out.println("Vetor desordenado");
		for(int i = 0; i < vet.length -1;i ++) {
			if(vet[i] > vet[i + 1]) {
				troca(vet[i], vet[i+1]);
			}
		}
	}


	public static void main(String[] args) {
		int[] vet = {8, 9, 3, 5, 1};
		BubbleSort b = new BubbleSort();
		b.bubbleSort(vet);
		for(int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}