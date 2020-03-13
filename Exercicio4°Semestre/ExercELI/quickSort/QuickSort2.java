package quickSort;

public class QuickSort2 {

	public static void quickSort(int[] a, int q, int r) {
		if (q < r) {				
			int posicaoPivo = separar(a, q, r);	// M�todo no qual vai retornar um int que ir� separar o vetor em 2
			quickSort(a, q, posicaoPivo - 1); 	//Chamadas Recursivas para o vetor divido
			quickSort(a, posicaoPivo + 1, r);	
		}
		// Se a posi��o de inicio for maior que o final ele encerra o m�todo
	}

	private static int separar(int[] a, int q, int r) {
		int pivo = a[q];			//Define um novo pivo para separa��o
		int i = q + 1, f = r;		
		while (i <= f) {			
			if (a[i] <= pivo)		
				i++;
			else if (pivo < a[f])
				f--;
			else {			
				int troca = a[i]; 
				a[i] = a[f];
				a[f] = troca; 	
				i++;
				f--;
			}
		}
		a[q] = a[f];
		a[f] = pivo;
		return f;		
	}

}
