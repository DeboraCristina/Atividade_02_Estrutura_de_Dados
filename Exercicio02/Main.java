public class Main {
	public static int menor(int[] v, int t, int m) {
		if (t > 1) { // enquanto t for maior que 1 a função irá chamar a si mesma. decrementando o valor de t
			m = menor(v, t - 1, m);
		}
		int aux = t - 1;
		m = v[aux] < m ? v[aux] : m; // se a posição do vetor for menor que o menor valor, m receberá o menor valor
		return m;
	}

	public static void main(String[] args){
		int[] v1 = {7, 22, 15, 89, 42, 11, 66, 18, 5, 32, 75, 9, 50, 3, 27};
		System.out.println(menor(v1, v1.length, 7));
		int[] v2 = {91, 55, 29, 47, 63, 12, 38, 81, 17, 73, 24, 68, 40, 52, 6};
		System.out.println(menor(v2, v2.length, 7));
		int[] v3 = {14, 78, 31, 60, 10, 88, 23, 44, 97, 71, 26, 53, 79, 36, 67};
		System.out.println(menor(v3, v3.length, 7));
	}
}
