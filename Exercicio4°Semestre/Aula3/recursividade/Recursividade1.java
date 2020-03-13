package recursividade;

public class Recursividade1 {

	public int somaLinear(int v[], int n) {
		if(n == 1){
			return v[0];
		}else {
			return v[n - 1] + somaLinear(v, n-1);
		}
	}

	 public void ReverseVector(int a[], int i, int j) {
		if(i< j) {
			troca(a[i],a[j]);
		}	
		ReverseVector(a, i + 1, j -1);
	}

	int fat(int n) {
		if (n == 0 || n == 1){
			return 1;
		}
		return n * fat(n - 1);
	}


	public void troca(int n1, int n2) {
		int aux;
		aux = n1;
		n1 = n2;
		n2 = aux;
	}

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 2;
		a[1] = 98;
		a[2] = 1;
		a[3] = 77;
		a[4] = 123;
		
		int b[] = new int[5];
		b[0] = 456;
		b[1] = 987;
		b[2] = 10;
		b[3] = 7;
		b[4] = 23;
		
		Recursividade1 r1 = new Recursividade1();
		
		System.out.println(r1.somaLinear(a, a.length));
		r1.ReverseVector(a, 0, a.length);
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
