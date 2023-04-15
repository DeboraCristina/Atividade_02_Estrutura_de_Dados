public class Main {
	public static int encontraDigito(int i, int d) {
		if (i == 0) // quando i for zero a função irá parar de chamar a si mesma;
			return 0;
		/*
		n receberá o retorno de encontraDigito. n só será alterado se o resto de i dividido por 10 for igual a d
		 */
		int n = encontraDigito(i / 10, d);
		return (i % 10) == d ? n + 1 : n;
	}

	public static void show(int i, int d, int r) {
		String c = "\033[1;91m";
		int m = encontraDigito(i, d);

		if (m == r) {
			c = "\033[1;92m";
		}
		System.out.println(c + i + " tem " + m + " digitos " + d + "\033[0m");
	}

	public static void main(String[] args){
		show(101, 1, 2);
		show(523528, 5, 2);
		show(836363, 3, 3);
		show(1231, 2, 1);
	}
}
