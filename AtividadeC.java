// Terceira atividade do curso de Java

// Atividade de função

public class AtividadeC {
    public static void main(String[] args) {
        sum(4,6);
        sum(15,85);
        sum(16,24);

        calc(5, 25);

    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void calc(int x, int y) {
        System.out.println(x + y);
        System.out.println(x / y);
        System.out.println(x - y);
        System.out.println(x * y);
    }
}