// Aula 9 do curso de java

// Vamos fazer uma calculadora
// Para isso vamos ver condições e utilizar os variaveis infinitas

public class AtividadeE {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]); // O Integer.parseInt() está tranformando texto em variável númerica para consegui guardar na variável int
        int y = Integer.parseInt(args[2]); // O Integer.parseInt() está tranformando texto em variável númerica para consegui guardar na variável int

        if(args[0].equals("soma")){ // if é a função condição que vai condisionar uma cituação e apartir dessa condição elá vai dar um caminho a ser levado
            adi (x, y); // Como na condição foi colocado que a primeiro fator for igual a soma então ele tem que trasar esse caminho
        }
        else if (args[0].equals("subtração")){
            sub(x, y); // Como na condição foi colocado que a primeiro fator for igual a subtração então ele tem que trasar esse caminho
        }
        else if (args[0].equals("divisão")){
            div(x, y); // Como na condição foi colocado que a primeiro fator for igual a divisão então ele tem que trasar esse caminho
        }
        else if (args[0].equals("mutiplicação")){
            mut(x, y); // Como na condição foi colocado que a primeiro fator for igual a mutiplicação então ele tem que trasar esse caminho
        }
        else{ // Caso nehuma das condições sejam atendidas ou uma das condições não seja atendidas o caminho que o programa ira tomar será esse
            System.out.println("Ação não identificada"); // Como estamos falando da primeira variavel então seria a variavel da ação e por isso apareceria essa mensagem
        }

    }

    static void adi (int x, int y){ // Função de adição
        System.out.println(x + y);
    }

    static void sub (int x, int y){ // Função de subtração
        System.out.println(x - y);
    }

    static void div (int x, int y){ // Função de divisão
        System.out.println(x / y);
    }

    static void mut (int x, int y){ // Função de mutiplicação
        System.out.println(x * y);
    }
}