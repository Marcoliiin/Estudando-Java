import java.util.Scanner;

public class Heranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomef = "Gabriel";
        String nomep = "";
        String olhosp = "";
        String cabelop = "";
        String alturap = "";

        System.out.println("Qual o nome do pai?");
        nomep = sc.nextLine();

        System.out.println("Qual a cor dos olhos do pai?");
        olhosp = sc.nextLine();

        System.out.println("Qual a cor do cabelo do pai?");
        cabelop = sc.nextLine();

        System.out.println("O pai é alto, mediano ou baixo?");
        alturap = sc.nextLine();

        father newfather = new father(nomep, olhosp, cabelop, alturap);
        son newson = new son(nomef, olhosp, cabelop, alturap);

        newfather.fatherp(nomep, olhosp, cabelop, alturap);
        newson.sonp(olhosp, cabelop, alturap);
    }
}

class father {
    public String nome;
    public String olhos;
    public String cabelo;
    public String altura;

    public father(String nomep, String olhosp, String cabelop, String alturap) {
        this.nome = nomep;
        this.olhos = olhosp;
        this.cabelo = cabelop;
        this.altura = alturap;
    }

    public void fatherp(String nomep, String olhosp, String cabelop, String alturap) {
        System.out.println("Nome do pai: " + nomep + " Olhos do pai: " + olhosp + " Cabelo do pai: " + cabelop + " Altura do pai: " + alturap);
    }
}

class son extends father {
    public String nomef;

    public son(String nomef, String olhosp, String cabelop, String alturap) {
        super(nomef, olhosp, cabelop, alturap);
        this.nomef = nomef;
        this.olhos = olhosp;
        this.cabelo = cabelop;
        this.altura = alturap;
    }

    public void sonp(String olhosp, String cabelop, String alturap) {
        System.out.println("Nome do filho: " + nomef + " Olhos do filho: " + olhosp + " Cabelo do filho: " + cabelop + " Altura do filho: " + alturap);
    }

}
