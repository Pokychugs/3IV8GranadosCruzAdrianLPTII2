/*
*Vamos a crear un programa que se encargue de realizar las siguientes operaciones.
*
*1.- Bono o descuento por la edad
2.- Convertir numeros decimales a binarios
3.-Convertir temperatura Celsius a kelvin
4.-Numero de positivos y negativos 
5.-Tiendita
6.-Area y perimetro de figuritas
7.-Una tabla
8.-Un factorial
9.-Dibujitos
10.-Figuras huecas de código
11.-Patrones
12.-Diamante (no llegan en lol)
13.-Calculadora
14.-Salir
*/

import java.util.Scanner;

class EstructuraDatos {
    // Programa 1
    public static void main(String[] args) {
        // Declaro mi objeto
        Scanner entrada = new Scanner(System.in);

        // Variables
        int edad, opcion, socio, numbinario, total, numerototal, n, a, b;
        int positivos = 0;
        int negativos = 0;
        double precio, bono;
        char letras, operacion;
        float precios = 0;
        float resultado = 0;
        int cantidad = 0;
        String binario = "";

        // vamos a crear un bucle para que se repirta el programa
        do {
            // Vamos a crear nuestro menu
            System.out.println("Bienvenido a la tareita que tenian que hacer wiiiii n_n/");
            System.out.println("Por favor elija la opcion deseada");
            System.out.println("1.-Descuento por edad");
            System.out.println("2.-Convertir numero decimal a binario");
            System.out.println("3.-Conversiones de temperatura");
            System.out.println("4.-Numeros positivos y negativos");
            System.out.println("5.-La tiendita");
            System.out.println("6.-Area y perimetro");
            System.out.println("7.-Tabla");
            System.out.println("8.-Factorial");
            System.out.println("9.-Dibujitos");
            System.out.println("10.-Figura hueca");
            System.out.println("11.-Patrones");
            System.out.println("12.-Diamante");
            System.out.println("13.-Calculadora");
            System.out.println("14.-Salir");

            opcion = entrada.nextInt();

            // Nuestro switch
            switch (opcion) {
                case 1: // Ahi lo hacen
                    break;
                case 2:
                    System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";
                    /* Tengo que comprobar que sea un entero positivo */
                    if (numbinario > 0) {
                        // Debo de aplicar el algoritmo
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    // Vamos a ver un for
                    for (n = 1; n <= 10; n++) {
                        System.out.println(n + " " + (n * 10) + " " + (n * 100) + " " + (n * 1000));
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Cuarado Magico, asi kawaii, como tu kokoro despues de elle");
                    System.out.println("Inserta el numero de unidades entre el 1 y el 20");
                    n = entrada.nextInt();
                    // Linea superior
                    if (n >= 1 && n <= 20) {
                        for (int i = 0; i < n; i++) {
                            System.out.println(" * ");

                        }
                        System.out.println("");
                        // cuadrado interno
                        for (int j = 0; j < n - 2; j++) {
                            System.out.print(" * ");
                            for (int k = 0; k < n - 2; k++) {
                                System.out.print("   ");
                            }
                            System.out.println(" * ");
                        }
                        // linea inferior
                        for (int i = 0; i < n; i++) {
                            System.out.println(" * ");

                        }
                        System.out.println("");

                    } else {
                        System.out.println("Error solo entre 1 y 20, llegale");
                    }
                    break;
            }

            // Preguntar
            System.out.println("\n ¿Deseas repetir el programa? Si lo desea escriba s");

            letras = entrada.next().charAt(0);
        } while (letras == 's' || letras == 'S');

    }
}