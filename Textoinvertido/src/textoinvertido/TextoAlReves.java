/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textoinvertido;

import java.util.Scanner;

public class TextoAlReves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra o frase: ");
        String entrada = scanner.nextLine();

        // Llamar a la función para invertir el texto
        String textoAlReves = invertirTexto(entrada);

        System.out.println("Texto al revés: " + textoAlReves);

        scanner.close();
    }

    public static String invertirTexto(String texto) {
        // Convierte el texto en un arreglo de caracteres
        char[] caracteres = texto.toCharArray();

        // Invierte el arreglo de caracteres
        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }

        // Convierte el arreglo de caracteres de nuevo a una cadena
        return new String(caracteres);
    }
}
