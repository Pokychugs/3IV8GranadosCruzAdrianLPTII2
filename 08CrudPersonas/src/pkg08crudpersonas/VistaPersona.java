/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08crudpersonas;

/**
 *
 * @author alumno
 */

import java.util.*;
public class VistaPersona {
    Scanner entrada = new Scanner(System.in);
    int opcion;
    
    ControladorPersona crud = new ControladorPersona();
    
    public void Principal(){
        do{
        System.out.println("Bienvenidos al sistema CRUD de dormiditos batiz");
        System.out.println("Por favor elija una opcion");
        System.out.println("1.- Mostrar lista de dormiditos");
        System.out.println("2.- Registrar un nuevo dormidito");
        System.out.println("3.- Editar al dormidito");
        System.out.println("4.- Despedir al dormidito");
        System.out.println("5.- salir");
        
        opcion = Integer.parseInt(entrada.nextLine());
        
                switch (opcion){
                    
                    case 1:
                    //vamos a mostrar a las personas
                    //primero necesitoo un obj arraylist
                    ArrayList<Persona> listadormiditos = crud.mostrarPersonas();
                        
                        //recorrer el objeto para imprimir los datos
                    for(Persona p : listadormiditos){
                    System.out.println("El id del dormidito es: "+ p.getId()+"\n"
                    +"El nombre del dormidito es: "+p.getNombre()+"\n"
                    +"La edad del dormidito es: "+p.getEdad());
                    }
                    break;
                    case 2:
                    //registrar
                    System.out.println("Ingresa el id del dormidito");
                    int iddormidito= Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingresa el nombre del dormidito");
                    String nombredormidito=entrada.nextLine();
                    System.out.println("Ingresa la edad del dormidito");
                    int edaddormidito = Integer.parseInt(entrada.nextLine());
                    
                    //enviarlos al obj de persona
                    Persona nuevodormidito = new Persona(iddormidito, nombredormidito, edaddormidito);
                            crud.registrarPersona(nuevodormidito);
                    break;
                    
                    case 3:
                        //vamos a editar
                        System.out.println("Ingrese el id del dormidito a editar");
                        iddormidito = entrada.nextInt();
                        
                        //mandar a llamar al metodo de busqueda
                        
                        Persona personaSeleccionada = crud.buscarPersona(iddormidito);
                        
                        //primero que muestre la informacion
                        
                        System.out.println("La informacion del dormidito es: "
                        +"\n ID: "+personaSeleccionada.getId()
                        +"\n Nombre: "+ personaSeleccionada.getNombre()
                        +"\n Edad:"+personaSeleccionada.getEdad());
                        
                        //vamos a realizar los cambios
                        System.out.println("Ingrese el nuevo nombre del dormidito");
                        String nuevonombre = entrada.nextLine();
                        System.out.println("");
                        System.out.println("Ingrese la nueva edad del dormidito");
                        int nuevaedad = entrada.nextInt();
                        
                        //envio los nuevos datos
                        personaSeleccionada.setNombre(nuevonombre);
                        personaSeleccionada.setEdad(nuevaedad);
                        
                        //actualizo los datos
                        crud.actualizarPersona(personaSeleccionada);
                        break;
                        
                    case 4:
                        //despertar al dormidito
                        System.out.println("Ingrese el id del dormidito a despertar");
                        int despertar = entrada.nextInt();
                        
                        //primero busco
                        
                        Persona despertado = crud.buscarPersona(despertar);
                        
                        crud.eliminarPersona(despertado);
                        
                        System.out.println("Ya se desperto");
                        
                        break;
                        default:
                            System.out.println("Ingrese una opcion valida");               
                }
    }while(opcion != 5);
    }
}
