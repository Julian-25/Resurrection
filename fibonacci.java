public class Main {
    final static int LIMITE = 50;
    public static void main(String[] args) {
        long contador = 0;
        long contador2 = 1;

        for (int i = 0; i < LIMITE; i++) {
            System.out.println(contador);
            long acumulador = contador;
            contador = contador2;
            contador2 = acumulador + contador2;
        }
        
    }
}