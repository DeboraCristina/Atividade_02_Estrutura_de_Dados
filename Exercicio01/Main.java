public class Main {
    public static int soma(int n) {
        if (n <= 0) // quando n for zero ou menor a função irá parar de chamar a si mesma;
            return 0;
        return n + soma(n - 1); // n será somado com o resultado de soma, que recebo n - 1;
    }

    public static void main(String[] args)
    {
        System.out.println(soma(4));
        System.out.println(soma(10));
        System.out.println(soma(70));
        System.out.println(soma(60));
    }
}
