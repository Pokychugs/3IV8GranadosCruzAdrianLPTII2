/*
Name: Binario1
Description: Obtener un numero binario a partir de un numero entero
Author: Granados Cruz Adrian
*/

import java.util.Scanner;
class Binario1{
    public static void  main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int numbinario;
        char respuesta;
        String binario = " ";

        do{

            System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";
                    
                    if (numbinario > 0) {

                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }
                    } else if (numbinario == 0) {
                        binario = "0";
                    } else {
                        binario = "\n No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);

            System.out.println("\n ¿Deseas repetir el programa? Si lo desea escriba s"); 
            respuesta = entrada.next().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');

    }

}