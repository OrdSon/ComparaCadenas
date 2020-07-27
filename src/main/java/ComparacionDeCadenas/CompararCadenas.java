/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author samuelson
 */
public class CompararCadenas {

    public CompararCadenas() {
    }

    public String compararCadenas(String cadenaUno, String cadenaDos) {
        char[] primera = (cadenaUno.toUpperCase()).toCharArray();
        char[] segunda = (cadenaDos.toUpperCase()).toCharArray();
        char[] encontrados = new char[0];
        char[] temp = new char[0];
        for (int i = 0; i < cadenaUno.length(); i++) {
            for (int j = 0; j < cadenaDos.length(); j++) {
                int compara = Character.compare(primera[i], segunda[j]);
                if (compara == 0) {
                    int nuevoi = i;
                    int nuevoj = j;
                    int contador = 0;
                    boolean salida = false;
                    while (salida == false) {
                        if (nuevoi >= primera.length | nuevoj >= segunda.length) {
                            break;
                        }
                        if (Character.compare(primera[nuevoi], segunda[nuevoj]) != 0) {
                            break;
                        }
                        temp = aumentaArray(temp);
                        temp[contador] = primera[nuevoi];
                        contador++;
                        nuevoi++;
                        nuevoj++;
                    }
                }
                if (encontrados.length < temp.length) {
                    encontrados = temp;
                    temp = new char[0];
                }
                temp = new char[0];
            }
        }
        if (encontrados.length == 1) {
            return "No existen cadenas en común";
        }
        return new String(encontrados);
    }

    private char[] aumentaArray(char[] array) {
        char[] temporal = array;
        int size = array.length + 1;
        array = new char[size];
        for (int i = 0; i < temporal.length; i++) {
            array[i] = temporal[i];
        }
        return array;
    }

    public void imprime(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
