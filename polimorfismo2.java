public class polimorfismo {
    public static void main(String[] args) {
        String tamanho = "grande";
        String nome = "nome";
        String populacoes = "1 milhão";

        cidade newcidade = new cidade(tamanho, nome);
        cascavel newcascavel = new cascavel(tamanho, nome, populacoes);

        newcidade.populacao();
        newcidade.clima();
        newcascavel.populacao();
        newcascavel.clima();
    }
}

class cidade {
    public String nome;
    public String tamanho;

    public cidade(String nome, String tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void populacao() {
        System.out.println("População genérica");
    }

    public void clima() {
        System.out.println("O clima desta cidade é genérico");
    }
}

class cascavel {
    public String nome;
    public String tamanho;
    public String populacoes;

    public cascavel(String nome, String tamanho, String populacoes) {
        this.populacoes = populacoes;
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void populacao() {
        System.out.println("População de Cascavel: " + populacoes);
    }

    public void clima() {
        System.out.println("O clime de Cascavel é Tropical");
    }

}
