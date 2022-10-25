public class Animal {

    /*
     * Es poder restringir los accesos al tipo de dato. Vamos a poder agrupar en una
     * clase el acceso a los diferentes metodos u objetos de clase, para que puedan
     * ser modificados.
     */

    private String nombre, raza, tipo_alimento;
    private int edad;

    /*
     * Definimos el constructor, este nos sirve para poder declarar la existencia de
     * una clase, inicializar variables y poder crear instancias de objetos
     */

    public Animal() {
        // vacio
    }

    // sobrecarga de metodo
    public Animal(String nombre, String raza, String tipo_alimento, int edad) {
        // para poder definir los parametros de acceso a las variables
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;

    }

    /*
     * Poder enviar y obtener los valores de las variables
     * getter y setter
     * get -> obtener -> recibir
     * set -> asignar -> enviar
     */

    // get
    public String getNombre() {
        return nombre;
    }

    // set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // get
    public String getRaza() {
        return raza;
    }

    // set
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // get
    public String getTipo_alimento() {
        return tipo_alimento;
    }

    // set
    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    // get
    public int getEdad() {
        return edad;
    }

    // set
    public void setEdad(int edad) {
        this.edad = edad;
    }

}