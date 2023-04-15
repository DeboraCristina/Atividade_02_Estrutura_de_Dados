public class Main {
	public static int totalNegativos(int[] v, int t) {
		if (t < 1) // quando t for zero ou menor a função irá parar de chamar a si mesma;
			return 0;
		/*
		n receberá o retorno de totalNegativos. n só será alterado se a posição do vetor for menor do que zero
		 */
		int n = totalNegativos(v, t - 1);
		if (v[t - 1] < 0)
			n += 1;
		return n;
	}

	public static void main(String[] args){
		int[] v1 = {-10, 25, -8, 17, 0, -5, 12, -3, 9, -21, 7, -14, 6, -18, 30};
		System.out.println(totalNegativos(v1, v1.length));
	}
}
