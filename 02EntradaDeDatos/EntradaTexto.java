//esto es un comentario

/**
* Todo el programa en Java debe tener el nombre de la clase tal cual como el archivo
*/

class EntradaTexto {//los limites de la clase

    //Toda la clase debe tener un metodo principal
    //**Vamos a elaizar un programa mediante el cual podemos introducir texto a nuestra conveniencia */
    public static void main(String[] args) {
    //tipo de dato
    String nombre;
    //el ; es el fin de linea
    int edad;
    //instancia
    System.out.println("Por favor introduce tu nombre asi bien kawaii");
    
    //vamos a obtener el nombre del usario
    
    nombre = System.console().readLine();
    System.out.println("Por favor introduce tu edad: ");

    edad = Integer.parseInt(System.console().readLine());
    System.out.println("Hola "+ nombre + "bienvenido a tu programita tienes: " + edad + "primaveras");
    }
}
