public class Conejo extends Animal {

    private String vegetal_favorito;

    public Conejo() {

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String vegetal_favorito) {
        /*
         * para poder obtener o acceder a los aributos reservados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.vegetal_favorito = vegetal_favorito;
    }

    // get
    public String getVegetal_favorito() {
        return vegetal_favorito;
    }

    // set
    public void setVegetal_favorito(String vegetal_favorito) {
        this.vegetal_favorito = vegetal_favorito;
    }

    public void mostrarConejo() {
        System.out.println("El nombre del conejo es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n" + "Su edad es: " + getEdad() + "\n"
                + "Su vegetal favorito es: " + vegetal_favorito + "\n");
    }
}
