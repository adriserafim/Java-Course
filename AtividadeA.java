// Segunda atividade de JAVA

public class Main {
    public static void main(String[] args) {
        //var login = "Olá!";
        //var password = "ajsfjaoip";
        //var number1 = false;

        // variaveis -> tipo: Textos (Strings)
        // variaveis -> tipo: Numeros (Int)
        // variaveis -> tipo: Numeros fracionados (Doubles)
        // variaveis -> tipo: Booleanas (verdadeiro / falso)

        // Tipos de dados
        string login = ", Olá"; // Meio antigo de se falar uma variavel de texto
        int number1 = 10; // Coloca numetros inteiros
        double percent = 24.30; // Coloca numetros quebrados
        boolean isdriver = true; // Representeção boleanas ( verdadeiro / falso )

        System.out.printf(String.valueOf(number1));
        number1 = 30;


        System.out.println(login);
        System.out.println(String.valueOf(number1)); // O computador fez com que eu colocasse esse String.valueOf() antes da variavel, mas eu não sei porque ele fez isso
        System.out.println(String.valueOf(percent)); // O computador fez com que eu colocasse esse String.valueOf() antes da variavel, mas eu não sei porque ele fez isso
        System.out.println(String.valueOf(isdriver)); // O computador fez com que eu colocasse esse String.valueOf() antes da variavel, mas eu não sei porque ele fez isso

        int number;
        number = 22;

        System.out.printf(String.valueOf(number + 10)); // Descobrir porque estava aparecendo tudo na mesma linha.
        // Tem uma diferença entre o println e o printf como o programa estava corrigindo, um imprime na mesma linha enquanto o outro vai para linha de baixo (ln) de line


    }
}