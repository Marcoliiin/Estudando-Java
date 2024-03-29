import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


/*     Uma loja está levantando o valor total de todas as mercadorias em estoque.
       Escreva um algoritmo que permita a entrada das seguintes informações: a) o
       número total de mercadorias no estoque; b) o valor de cada mercadoria. Ao final
       imprimir o valor total em estoque e a média de valor das mercadorias.*/


public class Mercado {
    static Scanner sc = new Scanner(System.in);

    static double[] estoque;
    static double[] valor;
    static String[] nome;
    static String[] lista;
    static String concat;

    static String[] nomes(int quantidade) {
        nome = new String[quantidade];
        lista = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da mercadoria: ");
            nome[i] = sc.nextLine();
            concat = nome[i];
            lista[i] = concat;
        }
        return nome;
    }

    static double[] valores(int quantidade) {
        valor = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Produto: " + nome[i]);
            System.out.println("Digite o valor do produto: ");
            valor[i] = sc.nextDouble();
            sc.nextLine();
            concat = "Produto: " + lista[i] + "\nPreço: " + valor[i];
            lista[i] = concat;
        }
        return valor;
    }

    static double[] estoque(int quantidade) {
        estoque = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Produto: " + nome[i]);
            System.out.println("Digite o estoque do produto: ");
            estoque[i] = sc.nextDouble();
            sc.nextLine();
            concat = lista[i] + "\nEstoque: " + (int) estoque[i];
            lista[i] = concat;
        }
        return estoque;
    }

    static String[] catalogo(int quantidade) {
        double soma = 0;
        double soma2 = 0;
        nomes(quantidade);
        valores(quantidade);
        estoque(quantidade);
        for (int i = 0; i < quantidade; i++) {
            System.out.println(lista[i] + "\n");
            soma = soma + valor[i];
            soma2 = soma2 + estoque[i];
            ;
        }
        System.out.println("Soma total do valor dos produtos: " + soma);
        System.out.println("Soma total do estoque dos produtos: " + soma2);
        return lista;
    }

    public static void main(String[] args) {
        System.out.println("Quantos produtos você irá cadastrar?");
        int quantidade = sc.nextInt();
        sc.nextLine();

        catalogo(quantidade);
    }
}
