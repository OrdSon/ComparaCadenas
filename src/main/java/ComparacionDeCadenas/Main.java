/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparacionDeCadenas;

import java.util.Scanner;

/**
 *
 * @author samuelson
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Este es el main... sin logica ni nada");
        System.out.println("Aun esta vacio");
        CompararCadenas compararCadenas = new CompararCadenas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primera cadena");
        String primera = scanner.nextLine();
        System.out.println("Ingrese segunda cadena");
        String segunda = scanner.nextLine();

        System.out.println("Cadena mas larga: " + compararCadenas.compararCadenas(primera, segunda));
    }
}
