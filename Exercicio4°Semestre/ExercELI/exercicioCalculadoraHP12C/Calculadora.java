package exercicioCalculadoraHP12C;


public class Calculadora {

	private PilhaNumeros pilhaNumeros = new PilhaNumeros();
	private PilhaOperacoes pilhaOperacoes = new PilhaOperacoes();
	

	public void botarNaPilha(String expressao) {
		String [] textoSeparado = expressao.split(" ");
		for(int x= 0; x < textoSeparado.length; x++) {
			try {
				int aux = Integer.parseInt(textoSeparado[x]);
				pilhaNumeros.adicionar(aux);
				
			} catch (Exception e) {
				pilhaOperacoes.adicionar(textoSeparado[x]);
			}
			
		}
	}
	

	public float soma(float n1, float n2) {
		return n1 + n2;
	}

	public float subtracao(float n1, float n2) {
		return n1 - n2;
	}

	public float multiplicacao(float n1, float n2) {
		return n1 * n2;
	}

	public float divisao(float n1, float n2) {
		return n1 /n2;
	}
	
	public float calcular() throws IllegalAccessException {
		return 0;
	}
	
	public void resetar() {
		while(pilhaNumeros.estaCheia()) {
			pilhaNumeros.remover();
		}
		while(pilhaOperacoes.estaCheia()) {
			pilhaOperacoes.remover();
		}
	}


	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.botarNaPilha("+ + 2 3 4 5");
		try {
			System.out.println("" + calc.calcular());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
