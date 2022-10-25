public class Principal {

    public static void main(String[] args) {
        // mascotas kawaii
        Gato cat = new Gato("Michit", "de la calle", "atun", 1, 7);
        Perro dog = new Perro("Pulgas", "de la calle", "croquetas", 2, "hace guau guau");

        cat.mostrarGato();
        dog.mostrarPerro();

        /*
         * quiero que agreguen conejos, hamsters, hurones
         * se debe de modificar para que el usuario elija si quiere agregar
         * 1 perro
         * 2 gato
         * 3 conejo
         * 4 hamster
         * 5 huron
         * Deben ingresar los nombres y los datos
         */
    }
}
