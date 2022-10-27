import java.util.Scanner;

class Datos{
    Scanner in = new Scanner(System.in);
    Perro perros[] = new Perro[5];
    Gato gatos[] = new Gato[5];
    Conejo conejos[] = new Conejo[5];
    Hamster hamsters[] = new Hamster[5];
    Huron hurones[] = new Huron[5];
    int tipoAnimal[] = {0,0,0,0,0};
    int opcion = 0;
    boolean pan = true;
    public void main(){
        String seguir = "si";
        do{
            System.out.println("Seleccione una opcion:");
            System.out.println("1.Agregar un animal");
            System.out.println("2.Mostrar datos de animales");
            while(pan){
                try{
                    opcion = in.nextInt();
                    pan = false;
                }catch(Exception e1){
                    System.out.println(e1.getMessage());
                    in.nextLine();
                    pan = true;
                }
            }
            pan = true;
            switch(opcion){
                case 1:
                    agregarAnimal();
                break;
                case 2:
                    mostrarAnimales();
                break;
                default:
                    System.out.println("No encontrado");
                break;
            }
            System.out.println("Escriba si para agregar otro animal, o ver los datos.");
            seguir = in.nextLine();
        }while(seguir.equalsIgnoreCase("si"));
    }

    public void agregarAnimal(){
        System.out.println("Elije que animal quieres agregar:  (Hasta 5 de  cada uno)");
        System.out.println("1.Perro");
        System.out.println("2.Gato");
        System.out.println("3.Conejo");
        System.out.println("4.Huron");
        System.out.println("5.Hamster");
        opcion = in.nextInt();
        in.nextLine();
            switch(opcion){
                case 1:
                    if(tipoAnimal[0] < 5){
                        Perro perro = new Perro();
                        System.out.println("Escribe el nombre");
                        perro.setNombre(in.nextLine());
                        System.out.println("Escribe la edad");
                        perro.setEdad(in.nextInt());
                        System.out.println("Escribe que tipo de comida come");
                        in.nextLine();
                        perro.setTipo_alimento(in.nextLine());
                        System.out.println("Escribe la raza");
                        perro.setRaza(in.nextLine());
                        System.out.println("Escribe el ladrido");
                        perro.setLadrido(in.nextLine());
                        perros[tipoAnimal[0]] = perro;
                        tipoAnimal[0] += 1;
                    }else{
                        System.out.println("Ya esta lleno");
                    }
                break;
                case 2:
                if(tipoAnimal[1] < 5){
                    Gato gato = new Gato();
                    System.out.println("Escribe el nombre");
                    gato.setNombre(in.nextLine());
                    System.out.println("Escribe la edad");
                    gato.setEdad(in.nextInt());
                    System.out.println("Escribe que tipo de comida come");
                    in.nextLine();
                    gato.setTipo_alimento(in.nextLine());
                    System.out.println("Escribe la raza");
                    gato.setRaza(in.nextLine());
                    System.out.println("Escribe cuantas vidas le quedan");
                    gato.setNum_vidas(in.nextInt());
                    gatos[tipoAnimal[1]] = gato;
                    tipoAnimal[1] += 1;
                }else{
                    System.out.println("Ya esta lleno");
                }

                break;
                case 3:
                if(tipoAnimal[2] < 5){
                    Conejo conejo = new Conejo();
                    System.out.println("Escribe el nombre");
                    conejo.setNombre(in.nextLine());
                    System.out.println("Escribe la edad");
                    conejo.setEdad(in.nextInt());
                    System.out.println("Escribe que tipo de comida come");
                    in.nextLine();
                    conejo.setTipo_alimento(in.nextLine());
                    System.out.println("Escribe la raza");
                    conejo.setRaza(in.nextLine());
                    System.out.println("Escribe su vegetal favorito");
                    conejo.setVegetal_favorito(in.nextLine());
                    conejos[tipoAnimal[2]] = conejo;
                    tipoAnimal[2] += 1;
                }else{
                    System.out.println("Ya esta lleno");
                }

                break;
                case 4:
                if(tipoAnimal[3] < 5){
                    Huron huron = new Huron();
                    System.out.println("Escribe el nombre");
                    huron.setNombre(in.nextLine());
                    System.out.println("Escribe la edad");
                    huron.setEdad(in.nextInt());
                    System.out.println("Escribe que tipo de comida come");
                    in.nextLine();
                    huron.setTipo_alimento(in.nextLine());
                    System.out.println("Escribe la raza");
                    huron.setRaza(in.nextLine());
                    System.out.println("Escribe cuanto mide de largo");
                    huron.setLargo(in.nextInt());
                    hurones[tipoAnimal[3]] = huron;
                    tipoAnimal[3] += 1;
                }else{
                    System.out.println("Ya esta lleno");
                }

                break;
                case 5:
                if(tipoAnimal[4] < 5){
                    Hamster hamster = new Hamster();
                    System.out.println("Escribe el nombre");
                    hamster.setNombre(in.nextLine());
                    System.out.println("Escribe la edad");
                    hamster.setEdad(in.nextInt());
                    System.out.println("Escribe que tipo de comida come");
                    in.nextLine();
                    hamster.setTipo_alimento(in.nextLine());
                    System.out.println("Escribe la raza");
                    hamster.setRaza(in.nextLine());
                    System.out.println("Escribe cuanto corre en su rueda, en metros");
                    hamster.setM_rueda(in.nextInt());
                    hamsters[tipoAnimal[4]] = hamster;
                    tipoAnimal[4] += 1;
                }else{
                    System.out.println("Ya esta lleno");
                }

                break;
                default:
                    System.out.println("No encontrado");
                break;
            }
    }

    public void mostrarAnimales(){
        for(int i = 0; i < tipoAnimal[0];i++){
            System.out.println(tipoAnimal[0]);
            System.out.println("Perro " + (i + 1) + " :");
            System.out.println("Su nombre es: " + perros[i].getNombre());
            System.out.println("Su edad es: " + perros[i].getEdad());
            System.out.println("El  tipo de comida que come es: " + perros[i].getTipo_alimento());
            System.out.println("Su raza es: " + perros[i].getRaza());
            System.out.println("Su ladrido es: " + perros[i].getLadrido());
        }
        for(int i = 0; i < tipoAnimal[1];i++){
            System.out.println("Gato " + (i + 1) + " :");
            System.out.println("Su nombre es: " + gatos[i].getNombre());
            System.out.println("Su edad es: " + gatos[i].getEdad());
            System.out.println("El  tipo de comida que come es: " + gatos[i].getTipo_alimento());
            System.out.println("Su raza es: " + gatos[i].getRaza());
            System.out.println("Su numero de vidas restantes es: " + gatos[i].getNum_vidas());
        }
        for(int i = 0; i < tipoAnimal[2];i++){
            System.out.println("Conejo " + (i + 1) + " :");
            System.out.println("Su nombre es: " + conejos[i].getNombre());
            System.out.println("Su edad es: " + conejos[i].getEdad());
            System.out.println("El  tipo de comida que come es: " + conejos[i].getTipo_alimento());
            System.out.println("Su raza es: " + conejos[i].getRaza());
            System.out.println("Su vegetal favorito es: " + conejos[i].getVegetal_favorito());
        }
        for(int i = 0; i < tipoAnimal[3];i++){
            System.out.println("Huron " + (i + 1) + " :");
            System.out.println("Su nombre es: " + hurones[i].getNombre());
            System.out.println("Su edad es: " + hurones[i].getEdad());
            System.out.println("El  tipo de comida que come es: " + hurones[i].getTipo_alimento());
            System.out.println("Su raza es: " + hurones[i].getRaza());
            System.out.println("Su tamaño es de: " + hurones[i].getLargo() + " cm");
        }
        for(int i = 0; i < tipoAnimal[4];i++){
            System.out.println("Hamster " + (i + 1) + " :");
            System.out.println("Su nombre es: " + hamsters[i].getNombre());
            System.out.println("Su edad es: " + hamsters[i].getEdad());
            System.out.println("El  tipo de comida que come es: " + hamsters[i].getTipo_alimento());
            System.out.println("Su raza es: " + hamsters[i].getRaza());
            System.out.println("Corre: " + hamsters[i].getM_rueda() + " metros en su rueda");
        }
    }
}