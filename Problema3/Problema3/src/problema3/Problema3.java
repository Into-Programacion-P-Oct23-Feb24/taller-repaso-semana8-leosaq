/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int multiplicando;
        int multiplicador;
        int suma = 0;
        System.out.println("Ingrese el multiplicando: ");
        multiplicando = entrada.nextInt();
        System.out.println("Ingrese el multiplicador ");
        multiplicador = entrada.nextInt();

        while (multiplicador >= 1) {
            if (multiplicador % 2 == 1) {

                suma = suma + multiplicando;

            }
            multiplicador = multiplicador / 2;
            multiplicando = multiplicando * 2;
        }

        System.out.println(suma);
    }

}
