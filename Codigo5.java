/*
Este programa determina si un número ingresado es "afortunado" o no.
Un número se considera afortunado si tiene más dígitos 3, 7, 8 o 9 que el resto de dígitos.
*/

import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class Codigo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        System.out.print("Introduzca un número: "); // Solicita al usuario que ingrese un número
        String input = s.nextLine(); // Lee el número ingresado como una cadena de texto
        
        int numero = Integer.parseInt(input); // Convierte la cadena a un número entero
        int afo = 0;
        int noAfo = 0;
        
        while (numero > 0) {
            int digito = numero % 10; // Obtiene el último dígito del número
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++; // Incrementa el contador de dígitos afortunados
            } else {
                noAfo++; // Incrementa el contador de dígitos no afortunados
            }
            numero /= 10; // Elimina el último dígito del número para la siguiente iteración
        }

        if (afo > noAfo) {
            System.out.println("El número " + input + " es un número afortunado."); // Imprime si el número es afortunado
        } else {
            System.out.println("El número " + input + " no es un número afortunado."); // Imprime si el número no es afortunado
        }
    }
}
