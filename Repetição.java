public class Repetição {
    public static void main(String[] args) {
        int cont = 1;
        while (cont < 10) {
            System.out.println(++cont);
            /*  cont += 1;
                cont ++;
                ++ cont; */

        }
        /*sempre vai imprimir pelo menos 1 vez pq ele primeiro executa e depois ele olha pra condicional
        ou seja, uma bosta, nao vejo sendo útil.*/
        do {
            System.out.println("sexo");
        } while (cont >10);

        int blau;
        for( blau = 0 ; blau <10 ; blau ++){
            System.out.println(blau);
    }
    }
}
