package TALLER;

import java.util.Scanner;
public class Primos {
    final static int TOPE = 101;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero para saber si es primo");
        int NUMERO_USUARIO = scanner.nextInt();

        if (NUMERO_USUARIO % 2 != 0) {
            System.out.println("El numero: " +NUMERO_USUARIO +" es primo");
        }else{
            System.out.println("El numero es par y es: " +NUMERO_USUARIO);
        }



        for (int i = 1; i < TOPE; i++) {
            if (i % 2 != 0 ) {
                System.out.println(i);
            }
        }
    }
}

