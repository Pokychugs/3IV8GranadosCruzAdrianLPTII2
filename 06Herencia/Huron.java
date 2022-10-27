public class Huron extends Animal {

    private int largo;

    public Huron() {

    }

    public Huron(String nombre, String raza, String tipo_alimento, int edad, int largo) {
        /*
         * para poder obtener o acceder a los aributos reservados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.largo = largo;
    }

    // get
    public int getLargo() {
        return largo;
    }

    // set
    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public void mostrarHuron() {
        System.out.println("El nombre del huron es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n" + "Su edad es: " + getEdad() + "\n"
                + "Es: " + largo + " cm de largo" + "\n");
    }
}
