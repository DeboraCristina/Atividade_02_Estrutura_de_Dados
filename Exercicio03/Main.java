public class Main {
	public static int fatorial(int n) {
		if (n <= 0) // a função irá para de chamar a si mesma
			return 1;
		return n * fatorial(n - 1); // n será multiplicado pelo resultado de fatorial. n é passado decrementando 1
	}

	public static void main(String[] args){
		int x;

		x = 5;
		System.out.printf("Fatorial de %d é %d\n",x , fatorial(x));
		x = 4;
		System.out.printf("Fatorial de %d é %d\n",x , fatorial(x));
		x = 8;
		System.out.printf("Fatorial de %d é %d\n",x , fatorial(x));
	}
}
