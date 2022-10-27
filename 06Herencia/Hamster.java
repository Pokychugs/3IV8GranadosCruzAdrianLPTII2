public class Hamster extends Animal {

    private int m_rueda ;

    public Hamster() {

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, int m_rueda ) {
        /*
         * para poder obtener o acceder a los aributos reservados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.m_rueda  = m_rueda ;
    }

    // get
    public int getM_rueda() {
        return m_rueda ;
    }

    // set
    public void setM_rueda(Integer m_rueda ) {
        this.m_rueda  = m_rueda ;
    }

    public void mostrarHamster() {
        System.out.println("El nombre del Hamster es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n" + "Su edad es: " + getEdad() + "\n"
                + "Corre " + m_rueda  + " m en su rueda " + "\n");
    }
}
