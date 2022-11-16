/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09polimorfismoserializacion;

/**
 *
 * @author alumno
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
    
    //necesito poder guardar las diferrentes Barbies que vamos a crear
    ArrayList<Barbie> listabarbies = new ArrayList();
    
    //variables
    String rep = "si";
    String nombre = "";
    String animal = "";
    String gafas = "";
    String lenguajeprogramacion = "";
    int edad, cedula;
    
    //se lo que tu quieras ser con Barbie
    //Aplicamos polimorfismo
    
    Barbie programadora = new Programadora();
    Barbie veterinaria = new Veterinaria();
    
    void menu(){
        
        while(true){
            while(rep.equalsIgnoreCase("si")){
                try{
                    String var = JOptionPane.showInputDialog("Ingresa la opción deseada: \n" + "1.- Registrar una nueva Barbie programadora \n" + "2.-Registrar nueva Barbie Veterinaria \n" + "3.-Consultar Barbies \n" + "4.-Buscar Barbies \n" + "Se lo que tu quieras ser con Barbie wiiiii");
                    
                    if(var == null){
                        System.exit(0);
                    }
                    int opcion = Integer.parseInt(var);
                    switch(opcion){
                        case 1:
                            pedirDatosProgramadora();
                            programadora = new Programadora(lenguajeprogramacion, gafas, nombre, edad);
                            guardarProgramadora();
                            
                            break;
                        case 2:
                            pedirDatosVeterinaria();
                            veterinaria = new Veterinaria(cedula, animal, nombre, edad);
                            guardarVeterinaria();
                            break;
                        case 3: 
                            leerBarbie();
                            break;
                        case 4: 
                            //tarea wiii, buscar con todo y el crud
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    rep = JOptionPane.showInputDialog("¿Desea repetir?");
                }catch(Exception e){
                }
                
            }
        }
    }

    private void pedirDatosProgramadora() {
        nombre = JOptionPane.showInputDialog("Ingresa el nombre de la Barbie programadora:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de tu Barbie programadora:"));
        lenguajeprogramacion = JOptionPane.showInputDialog("Ingresa los lenguajes que domina la Barbie en programacion:");
        gafas = JOptionPane.showInputDialog("Ingresa que tipo de lentes utiliza tu Barbie:");
    }

    private void guardarProgramadora() throws IOException {
        listabarbies.add(programadora);
        guardar();
    }

    private void pedirDatosVeterinaria() {
        nombre = JOptionPane.showInputDialog("Ingresa el nombre de la Barbie veterinaria:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de tu Barbie veterianria:"));
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cédula de tu Barbie veterinaria:"));
        animal = JOptionPane.showInputDialog("Ingresa el tipo de mascota que cuida tu Barbie vaterianaria:");
    }

    private void guardarVeterinaria() throws IOException {
        listabarbies.add(veterinaria);
        guardar();
    }

    private void guardar() throws FileNotFoundException, IOException {
        //tenemos que escribir una salida
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        salida.writeObject(listabarbies);
        salida.close();
    }

    private void leerBarbie() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream("archivo.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        //transformar los bytes del bufer en objetos de la array
        listabarbies = (ArrayList)entrada.readObject();
        
        //tengo que recorrer el Array
        for(int i = 0; i < listabarbies.size(); i++){
            //como voy recorriendo la lista vamos mostrandola
            Programadora fullstack = (Programadora)listabarbies.get(i);
            //imprimo datos
            JOptionPane.showMessageDialog(null, "\n" + "Nombre de la porgramadora: " + fullstack.getNombre() + "\n" + "Edad de la prgramadora: " + fullstack.getEdad() + "\n" + "Lenguajes que domina la prgramadora: " + fullstack.getFullstack() + "\n" + "Gafas que usa la programadora: " + fullstack.getLentes() + "\n" + "El tipo de Barbie es: " + fullstack.tipobarbie());
        }

    }
}