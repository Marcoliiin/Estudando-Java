import java.util.Scanner;

public class Classes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer criar um novo usuário? (sim/nao): ");
        String validacao = sc.nextLine();

        switch (validacao) {
            case "sim":

                System.out.println("Digite o nome da pessoa: ");
                String nome = sc.nextLine();

                for (int i = 0; i < nome.length(); i++) {
                    if (!Character.isLetter(nome.charAt(i))) {     /*Aqui estamos validando char por char da String para ver se ela possui algum número, por isso do laço de repetição. charAt seta a posição*/
                        System.out.println("Este não é um nome válido pois possui um caractere que não é uma letra.");
                        break;
                    }
                }

                System.out.println("Digie o sobrenome da pessoa: ");
                String sobrenome = sc.nextLine();
                for (int i = 0; i < nome.length(); i++) {
                    if (!Character.isLetter(sobrenome.charAt(i))) {
                        System.out.println("Este não é um sobrenome válido pois possui um caractere que não é uma letra.");
                        break;
                    }
                }

                System.out.println("Digite a idade da pessoa (apenas em anos): ");
                double idade;

                if (sc.hasNextDouble()) {          /*haxNextDouble verifica se o valor que está entrando PODE SER um Double, caso seja, ele retorna true, fazendo com que o laço entre no If e não no Else*/
                    idade = sc.nextDouble();
                    sc.nextLine();
                } else {
                    System.out.println("Esta não é uma idade válida pois possui um caractere que não é um número.");
                    break;
                }

                System.out.println("Digite o CPF da pessoa (somente números): ");
                String cpfcru = sc.nextLine();

                if (cpfcru.length() != 11) {                 /*Somente validando se a pessoa inseriu 11 digitos (tamanho do CPF)*/
                    System.out.println("CPF inválido.");
                    break;
                }

                for (int i = 0; i < cpfcru.length(); i++) {
                    if (!Character.isDigit(cpfcru.charAt(i))) {
                        System.out.println("Este não é um CPF válido pois possui um caractere que não é uma letra.");
                        break;
                    }
                }

                System.out.println("Digite a seguir o endereço da pessoa");
                System.out.println("Rua: ");
                String rua = sc.nextLine();
                System.out.println("Bairro: ");
                String bairro = sc.nextLine();
                System.out.println("Cidade: ");
                String cidade = sc.nextLine();
                System.out.println("Estado: ");
                String estado = sc.nextLine();
                System.out.println("Vocẽ mora em casa ou em apartamento? (casa/apto)");
                String tipo = sc.nextLine().trim();


                String num = "";
                String endereco = "";

                switch (tipo) {
                    case "casa":
                        System.out.println("Número da casa: ");
                        num = sc.nextLine();
                        endereco = (rua + "," + num + " Bairro: " + bairro + " Cidade: " + cidade + "," + " Estado: " + estado);
                        break;

                    case "apto":
                        System.out.println("Qual o número do seu prédio/condomínio?");
                        String num1 = sc.nextLine();
                        System.out.println("Qual andar vocẽ mora? (digite apenas o número)");
                        int andar = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Qual o número do seu apartamento?");
                        num = sc.nextLine();
                        System.out.println("Sua residência é dividada em blocos? (sim/nao)");
                        String blocos = sc.nextLine();
                        switch (blocos) {
                            case "nao":
                                blocos = "Não possui blocos";
                                endereco = ("Rua: " + rua + "," + num + "\nBloco: " + blocos + " Apartamento: " + num + " Andar: " + andar + "\nBairro: " + bairro + " Cidade: " + cidade + "," + " Estado: " + estado);
                                break;

                            case "sim":
                                System.out.println("Digite o número/letra do seu bloco: ");
                                blocos = sc.nextLine();
                                endereco = ("Rua: " + rua + "," + num1 + "\nBloco: " + blocos + " Apartamento: " + num + " Andar: " + andar + "\nBairro: " + bairro + " Cidade: " + cidade + "," + " Estado: " + estado);
                                break;
                        }
                        break;
                }

                pessoa novapessoa = new pessoa(nome,sobrenome);
                System.out.println(novapessoa.nome);
                novapessoa.logradouro(endereco);
                novapessoa.idadeformatada(idade);
                novapessoa.cpf(cpfcru);

                break;

            case "nao":
                System.out.println("Programa finalizado.");
                break;

            default:
                System.out.println("Opção inválida. Programa finalizado.");
        }
    }
}

class pessoa {
    public String nome;

    public pessoa(String nome, String sobrenome) {
        this.nome = (nome + " " + sobrenome);
    }

    public void logradouro(String endereco) {
        System.out.println(endereco);
    }

    public void idadeformatada(double idade) {
        String formatidade = String.format("%.0f", idade); /*Faz com que tire as casas decimais, no caso foi usado para formatar a idade que está em double*/
        System.out.println("Idade: " + formatidade + " anos");
    }

    public void cpf(String cpfcru) {

        String cpfformatado = cpfcru;
        cpfformatado = cpfformatado.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4"); /*função para dividir uma String por partes, fazendo com que seja possível formatar ela*/
        System.out.println("CPF: " + cpfformatado);
    }
}
