/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08crudpersonas;

/**
 *register, consult, update, delete
 * Registrar nueva persona
 * Consultar a todas las personas
 * Actualizar datos de la persona
 * Eliminar persona
 * Buscar por id a una persona
 * @author alumno
 */

import java.util.ArrayList;
public class ControladorPersona {
    
    /*Ocupar un tipo de dato especial que sea capaz de almacenar diferentes tipos de datos y objetos, porque, necesitamos tener una lista de pertsonas que van a poder iniciar sesión asi como tambien podrán registarse, actualizar los datos, eliminar una cuenta y/o consultar y buscar diferentes registros.
    Para ello tenemos que ocupar ArrayList
    */
    
    //Crear el objeto
    public static ArrayList<Persona> listadepersonas = new ArrayList<Persona>();
    
    //El metodo para mostrar a todas las persona
    public ArrayList<Persona> mostrarPersonas(){
        return listadepersonas;
        
    }
    
    //el metodo que se encarga en registrar una persona
    public void registrarPersona(Persona p){
        listadepersonas.add(p);
    } 
    
    //buscar a una persona por id
    public Persona buscarPersona(int id){
        //primero necesito un objeto para almacenar a la persona
        Persona encontrada = new Persona();
        
        //debo poder recorrer la lista de persona
        for(Persona p : listadepersonas){
            if(id == p.getId()){
                //se encontro la persona
                encontrada = p;
            }else{
                System.out.println("Personano encontrada");
            }
        }
        return encontrada;
    }
    
    public void actualizarPersona(Persona personaActualiza){
        /*Primero tengo que buscarla
        Despues obtener los datos
        Luego cambiarlos
        Enviarlos
        */
        
        Persona personaaActualizar= buscarPersona(personaActualiza.getId());
        listadepersonas.remove(personaActualiza);
        listadepersonas.add(personaActualiza);
        
    }
    
    public void eliminarPersona(Persona personaEliminar){
        listadepersonas.remove(personaEliminar);
        
    }
}
