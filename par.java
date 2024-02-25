public class par {
    public static void main(String[] args) {
        int par = 0;
        for (par = 0; par <= 100000; par++) {
            if (par % 2 == 0) {
                System.out.println(par);
            }
        }
        int impar = 0;
        for (impar = 0; impar <= 100000; impar++) {
            if (impar % 2 != 0) {
                System.out.println(impar);
            }
        }
    }
}
