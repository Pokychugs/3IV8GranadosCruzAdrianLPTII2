/*
Name: EdadUsuario
Description: Aplicacion de descuentos
Author: Granados Cruz Adrian
*/

import java.util.Scanner;
class EdadUsuario{
    public static void  main (String[] args){

        final int EDAD_MAXIMA = 125;
        int edad;
        double abono;
        double descuento;
        char respuesta, opcion;
        char continuar;


        Scanner teclado = new Scanner(System.in);
        edad = 0;
        abono = 5420;
        descuento = 0;


            System.out.println("Introduce tu edad: ");
        edad = teclado.nextInt();

        if(edad > EDAD_MAXIMA){
            System.out.println("Error, ingresa tu edad real :v");

            }else if (edad > 65 && edad < EDAD_MAXIMA){
                descuento = (abono*40)/100;
                abono = abono - descuento;
                System.out.println("Tu abono ahora es de: " + abono);

            } else if (edad <= 65 && edad >=21){
                System.out.println("Tu abono es el mismo: " + abono);

            } else  if (edad < 21 && edad > 0){
                System.out.println("¿Tus padres son socios? Escriba s si son socios y n si no son socios: ");
            
            respuesta = teclado.next().charAt(0);
            if (respuesta == 's' || respuesta == 'S'){
                descuento = (abono*45)/100;
                abono = abono - descuento;
                System.out.println("Ser socio tiene beneficios, tu abono ahora es de: " + abono);
            
                } else {
                descuento = (abono*25)/100;
                abono = abono - descuento;
                System.out.println("Unete al club y se socio; tu abono ahora es de: " + abono);
                
            }
        }     
 
    }
    
}

