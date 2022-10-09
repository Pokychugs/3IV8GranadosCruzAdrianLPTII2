/*
Name: Contabilidad.
Description: Contador de numeros positivos y negativos
Author: Granados Cruz Adrian
*/

import java.util.Scanner;

class Contabilidad{
    public static void  main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int sucesion;
        int numero;
        int entero;
        int positivo = 0;
        int negativo = 0;
        int cero = 0;
        char respuesta;

        System.out.println("Ingrese la cantidad de datos de su sucesion: ");
        sucesion = teclado.nextInt();

        do{

            if (sucesion > 0){
                for (entero = 1; entero <= sucesion; entero++){
    
                    System.out.println("Ingrese el numero entero que guste: ");
                    numero = teclado.nextInt();
    
                    if (numero > 0){
                        positivo++;
    
                    } else if (numero < 0){
                        negativo++;
    
                    } else {
                        numero = 0;
                        cero++;
    
                    }
    
                }
    
                System.out.println("La cantidad de numeros positivos es: " + positivo);
                System.out.println("La cantidad de numeros negativos es: " + negativo);
                System.out.println("La cantidad de ceros fue: " + cero);
                       
                
            } else {
    
                System.out.println("ERROR, el numero ingresado no es correcto" + "Intenta de nuevo con un numero valido.");
            
            }

            System.out.println("¿Desea repetir el programa?" + "Escriba s si quiere aceptar");
            respuesta = teclado.next().charAt(0);
        } while ( respuesta == 's' || respuesta == 'S');

    }
}