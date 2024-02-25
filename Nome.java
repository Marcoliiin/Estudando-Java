import java.util.Scanner;

public class Nome {
    static double[] pergunta() {
        double[] vetor = new double[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Escreva um número");
            vetor[i] = sc.nextDouble();
        }
        return vetor;  /* passando variável */
    }

    static void soma(double[] vetor) { /*  passando como parâmetro a variável do tipo VETOR e DOUBLE */
        System.out.println("A soma dos dois números digitados é:" + (vetor[0] + vetor[1]));
    }

    static void subtracao(double[] vetor) {
        System.out.println("A subtração dos dois números digitados é: " + (vetor[0] - vetor[1]));
    }

    static void multiplicacao(double[] vetor) {
        System.out.println("A multiplicação dos dois números digitados é: " + (vetor[0] * vetor[1]));
    }

    static void divisao(double[] vetor) {
        System.out.println("A divisão dos dois números digitados é: " + (vetor[0] / vetor[1]));
    }

    static void resto(double[] vetor) {
        System.out.println("O resto da divisão dos dois números digitados é: " + (vetor[0] % vetor[1]));
    }

    public static void main(String[] args) {
        double[] vetor = pergunta();   /* variável que chama a function pergunta*/
        soma(vetor);
        subtracao(vetor);
        multiplicacao(vetor);
        divisao(vetor);
        resto(vetor);
    }
}
