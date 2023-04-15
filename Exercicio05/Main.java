public class Main {
	public static int contaDigitos(int n) {
		if (n == 0) // quando n for zero a função irá parar de chamar a si mesma;
			return 0;
		return contaDigitos(n / 10) + 1; // o retorno de contaDigitos será retornado com acresimo de + 1
	}

	public static void show(int d, int res) {
		int m = contaDigitos(d);
		if (m == res) {
			System.out.println("\033[1;92m" + d + " tem " + m + " digitos\033[0m");
		} else {
			System.out.println("\033[1;91m" + d + " tem " + m + " digitos\033[0m");
		}
	}

	public static void main(String[] args){
		show(0, 1);
		show(4, 1);
		show(666, 3);
		show(99999, 5);
	}
}
