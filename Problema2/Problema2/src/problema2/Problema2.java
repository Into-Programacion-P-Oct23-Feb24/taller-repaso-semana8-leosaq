/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int contador = 1;

        do {
            System.out.println("Ingrese el nombre y apellido del Jugador: ");
            n = entrada.nextInt();
            if (n > 0 && n % 2 == 0) {
                System.out.println(n);
                contador = contador + 1;
            }
            while (contador <= n) {

            }
        }  
    }
}
