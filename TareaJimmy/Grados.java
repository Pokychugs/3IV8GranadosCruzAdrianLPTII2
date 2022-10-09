/*
Name: Grados
Description: Obtener los grados Celsius, Farenheit, Kelvin o Rankine dependiendo los grados dados
Author: Granados Cruz Adrian
*/

import java.util.Scanner;

import javax.swing.text.html.FormSubmitEvent;
class Grados{
    public static void  main (String[] args){

        Scanner entrada = new Scanner(System.in);
        
        double celsius;
        double farenheit;
        double kelvin;
        double rankine;
        char respuesta;
        int eleccion;
        String opcion = " ";
        int condicion;

        celsius = 0;
        try{

            do{

                System.out.println("Bienvenido, selecciona la unidad de grados que tienes: ");
                System.out.println("1.- Celsius");
                System.out.println("2.- Farenheit");
                System.out.println("3.- Kelvin");
                System.out.println("4.- Rankine");
    
                eleccion = entrada.nextInt();
    
                if(eleccion > 0 && eleccion <= 4){
    
                    if (eleccion == 1){
    
                        System.out.println("Ingresa los grados");
                        celsius  = entrada.nextInt();
        
                        System.out.println("¿A que unidad quieres convertir tus grados Celsius?");
                        System.out.println("1- Rankine");
                        System.out.println("2- Farenheit");
                        System.out.println("3- Kelvin");
                           
                        condicion = entrada.nextInt();
        
                            switch (condicion){
        
                            case 1:
                            
                                opcion = "1";
                                rankine = (celsius * 1.8) + 491.67;
                                System.out.println("Los grados en Rankine son: " + rankine);
        
                                break;
                            case 2:
        
                                opcion = "2";
                                farenheit = (celsius * 9/5) + 32;
                                System.out.println("Los grados en Farenheit son: " + farenheit);
        
                                break;
                            case 3:
        
                                opcion = "3";
                                kelvin = celsius + 273.15;
                                System.out.println("Los grados en Kelvin son: " + kelvin);
        
                                break;
                            
                        }
                    } else if (eleccion == 2){
        
                        System.out.println("Ingresa los grados");
                        farenheit = entrada.nextInt();
        
                        System.out.println("¿A que unidad quieres convertir tus grados Farenheit?");
                        System.out.println("1- Kelvin");
                        System.out.println("2- Celsius");
                        System.out.println("3- Rankine");
                           
                        condicion = entrada.nextInt();
        
                           switch (condicion){
        
                            case 1:
                            
                                opcion = "1";
                                kelvin = (farenheit - 32) * 5/9 + 273.15;
                                System.out.println("Los grados en Kelvin son: " + kelvin);
        
                                break;
                            case 2:
        
                                opcion = "2";
                                celsius = (farenheit - 32) * 5/9;
                                System.out.println("Los grados en Celsius son: " + celsius);
        
                                break;
                            case 3:
        
                                opcion = "3";
                                rankine = farenheit + 459.67;
                                System.out.println("Los grados en Rankine son: " + rankine);
        
                                break;
                            
                        }                
                    } else if (eleccion == 3){
        
                        System.out.println("Ingresa los grados");
                        kelvin = entrada.nextInt();
        
                        System.out.println("¿A que unidad quieres convertir tus grados Kelvin?");
                        System.out.println("1- Farenheit");
                        System.out.println("2- Rankine");
                        System.out.println("3- Celsius");
                           
                        condicion = entrada.nextInt();
        
                           switch (condicion){
        
                            case 1:
                            
                                opcion = "1";
                                farenheit = (kelvin - 273.15) * 9/5 + 32;
                                System.out.println("Los grados en Farenheit son: " + farenheit);
        
                                break;
                            case 2:
        
                                opcion = "2";
                                rankine = kelvin * 1.8 ;
                                System.out.println("Los grados en Rankine son: " + rankine);
        
                                break;
                            case 3:
        
                                opcion = "3";
                                celsius = kelvin - 273.15;
                                System.out.println("Los grados en Celsius son: " + celsius);
        
                                break;
                        }
                    } else {
                    
                            eleccion = 4;
        
                        System.out.println("Ingresa los grados");
                        rankine = entrada.nextInt();
        
                        System.out.println("¿A que unidad quieres convertir tus grados Rankine?");
                        System.out.println("1- Celsius");
                        System.out.println("2- Kelvin");
                        System.out.println("3- Farenheit");
                           
                        condicion = entrada.nextInt();
        
                            switch (condicion){
        
                            case 1:
                            
                                opcion = "1";
                                celsius = (rankine - 491.67) * 5/9;
                                System.out.println("Los grados en Celsius son: " + celsius);
        
                                break;
                            case 2:
        
                                opcion = "2";
                                kelvin = rankine * 5/9 ;
                                System.out.println("Los grados en Kelvin son: " + kelvin);
        
                                break;
                            case 3:
        
                                opcion = "3";
                                farenheit = rankine - 459.67;
                                System.out.println("Los grados en Farenheit son: " + farenheit);
        
                                break;
                            }
                    }
                } else {
    
                    System.out.println("ERROR. Solo puedes elegir un numero del 1 al 4 :)");
                }
    
               
                    
                System.out.println("¿Desea repetir el programa? Escriba s si quiere continuar");
                respuesta = entrada.next().charAt(0);
            } while( respuesta == 's' || respuesta =='S');
    
        }catch(java.util.InputMismatchException e1){
            System.out.println(e1.getMessage() + "ERROR" + "Introduzca un valor valido");
        }
        
    } 

}