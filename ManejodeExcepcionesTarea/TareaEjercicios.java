import java.util.Scanner;

class TareaEjercicios{

    Scanner entrada = new Scanner(System.in);

    char opcion;
    int opfig;
    char letra;
    boolean seguir = false;
    double base, lado, altura, area, perimetro, lado2, lado3, radio;

    public void menu(){
        do{
            seguir = false;
            System.out.println("Bienvenido a la tarea profesor");
            System.out.println("A continuacion elija alguno de los siguientes programas");
            System.out.println("a.-Edad de una persona");
            System.out.println("b.-Area y perimetro de figuras");
            System.out.println("c.-Llamadas telefonicas");
            System.out.println("d.-Sueldo de un empleado");
            opcion = entrada.next().charAt(0);

            switch (opcion){
                case 'a':
                    DatosPersonales();
                    break;
                case 'b':
                    
                    Figuras();
                    System.out.println("Elija la figura que guste obtener su area y perimetro");
                    System.out.println("1.-Rectangulo");
                    System.out.println("2.-Cuadrado");
                    System.out.println("3.-Triangulo");
                    System.out.println("4.-Circulo");
                    opfig = entrada.nextInt();
                    switch(opfig){
                        case 1:
                            Rectangulo();
                            break;
                        case 2:
                            Cuadrado();
                            break;
                        case 3:
                            Triangulo();
                            break;
                        case 4:
                            Circulo();
                            break;
                        default:
                            System.out.println("Lamentamos pero no tenemos el area o perimetro de mas figuras");
                            break;
                    }
                    break;
                case 'c':
                    CostoDeLlamadas();
                    break;
                case 'd':
                    DatosEmpleado();
                    SueldoEmpleado();
                    SueldoSupervisor();
                    break;
                default:
                    System.out.println("Opcion no valda, gracias por probar el programa");
                    break;
            }
            System.out.println("¿Desea repetir el programa?");
            letra = entrada.next().charAt(0);
        }while(letra == 's' || letra == 'S');
        
    }

    public void DatosPersonales(){
        int anio, mes, dia;
        final int ANIO_MAXIMO = 1902;
        int fecha;

        System.out.println("Primeramente necesitamos que ingreses algunos datos personales");
        while(seguir == false){
            try{
                seguir = true;
                System.out.println("¿En que anio naciste?");
                anio = entrada.nextInt();
                if(anio < ANIO_MAXIMO){
                    System.out.println("Lamentamos esto pero nuestro sistema abarca hasta 1902 que es el registro de la persona mas longeva del mundo. Ingresa tu anio real de nacimiento");   
            
                    } else if (anio > 2022){
                    System.out.println("No puedes escribir mas del anio 2022, aun no existen los viajes en el tiempo. Ingresa tu anio real de nacimiento");
            
                    } else if (anio >= ANIO_MAXIMO && anio <= 2022){
                    System.out.println("¿En que mes naciste? (Ingresa el mes en numero por favor)");
                    mes = entrada.nextInt();
                    if(mes > 12){
                        System.out.println("No hay mas de 12 meses. Ingresa el mes correctamente");
            
                    }else if (mes <= 0){
                        System.out.println("No existen meses negativos. Ingresa el mes correctamente");
            
                    }else if (mes >= 1 && mes <= 12){
                        System.out.println("¿En que dia naciste");
                        dia = entrada.nextInt();
                        if(dia > 31){
                            System.out.println("No existe un mes con dias mayores a 31. Ingrese el dia real de tu nacimiento");
            
                        }else if(dia <= 0){
                            System.out.println("No existen dias negativos. Ingresa el dia real de tu nacimiento");
            
                        }else if(dia >= 1 && dia <= 31){
                            System.out.println("Para confirmar, su fecha de nacimiento es: " + dia + "/" + mes + "/" + anio);
                            fecha = (2022 - anio);
                            System.out.println("Por lo tanto su edad es: " + fecha + " anios");
                        }
                    }
                }       
            }catch(Exception e){
                    System.out.println("ERROR: " + e.getMessage());
                    System.out.println("Ingresa solo numeros enteros");
                    entrada.nextLine();
                    seguir = false;
            }
        }
            
    }

    public void Figuras(){
    }

    public void Rectangulo(){
        while(seguir == false){
            try{
                seguir = true;
                System.out.println("Ingresa el valor de la altura del rectangulo");
                altura = entrada.nextDouble();
                System.out.println("Ingresa el valor de la base del rectangulo");
                base = entrada.nextDouble();
                area = base * altura;
                perimetro = (2*base) + (2*altura);
                System.out.println("El area es de: " + area + " y el perimetro es de: " + perimetro);

            }catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Ingresa solo numeros");
                entrada.nextLine();
                seguir = false;
            }
        }
    }

    public void Cuadrado(){
        while(seguir == false){
            try{
                seguir = true;
                System.out.println("Ingresa el valor del lado del cuadrado");
                lado = entrada.nextDouble();
                area = lado * lado;
                perimetro = 4 * lado;
                System.out.println("El area es de: " + area + " y el perimetro es de: " + perimetro);

            }catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Ingresa solo numeros");
                entrada.nextLine();
                seguir = false;
            }
        }
    }

    public void Triangulo(){
        while(seguir == false){
            try{
                seguir = true;
                System.out.println("Ingresa el valor de la altura del triangulo");
                altura = entrada.nextDouble();
                System.out.println("Ingresa el valor de la base del triangulo");
                base = entrada.nextDouble();
                System.out.println("Ingresa el valor del lado2 del triangulo");
                lado2 = entrada.nextDouble();
                System.out.println("Ingresa el valor del lado3 del triangulo ");
                lado3 = entrada.nextDouble();
                area = (base*altura)/2;
                perimetro = base + lado2 + lado3;
                System.out.println("El area es de: " + area + " y el perimetro es de: " + perimetro);

            }catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Ingresa solo numeros");
                entrada.nextLine();
                seguir = false;
            }
        }
    }

    public void Circulo(){
        while(seguir == false){
            try{
                seguir = true;
                System.out.println("Ingresa el valor del radio del circulo");
                radio = entrada.nextDouble();
                area = Math.PI*(radio*radio);
                perimetro = 2*(Math.PI*radio);
                System.out.println("El area es de: " + area + " y el perimetro es de: " + perimetro);

            }catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Ingresa solo numeros");
                entrada.nextLine();
                seguir = false;
            }
        }
    }

    public void CostoDeLlamadas(){
                long numero;
                int credito = 300;
                double saldo;
                double nacionales, internacionales, celular, respuesta;
                System.out.println("Bienvenido, calcularemos el costo de tus llamadas realizadas");
        while(seguir == false){
            try{
                seguir = true;
                System.out.println("Ingresa tu numero de celular (10 digitos)");
                numero = entrada.nextLong();
                System.out.println("Tu numero es +52" + numero + " y tu credito total es de: " + "$"+ credito);
                System.out.println("A continuacion ingresa el numero total de llamadas Locales Nacionales que has realizado");
                respuesta = entrada.nextDouble();
                nacionales = respuesta * 0.5;
                System.out.println("Ingresa el numero total de llamadas Locales Internacionales que has realizado");
                respuesta = entrada.nextDouble();
                internacionales = respuesta * 0.6;
                System.out.println("Ingresa el numero total de llamadas Celulares que has realizado");
                respuesta = entrada.nextDouble();
                celular = respuesta * 0.2;
                saldo = credito - nacionales - internacionales - celular;
                System.out.println("Por lo tanto el saldo actual de tu credito es: $" + saldo);
            }catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Ingresa solo numeros");
                entrada.nextLine();
                seguir = false;
            }
        }
    }

    int puesto;
    double[] sueldoQuincenal = {5000.00,8000.00};
    double pagoEmpleado, pagoSupervisor;
    String idEmpleado;
    String idSupervisor;

    public void DatosEmpleado(){

        while(seguir == false){
            try{
                seguir = false;
                System.out.println("Elige tu puesto: ");
                System.out.println("1.- Empleado");
                System.out.println("2.- Supervisor");
                puesto = entrada.nextInt();

                switch(puesto){
                case 1:
                    System.out.println("Ingresa tu ID de Empleado: ");
                    idEmpleado = entrada.next("666");
                    SueldoEmpleado();
                    break;
                case 2:
                    System.out.println("Ingresa tu ID de Supervisor: ");
                    idSupervisor = entrada.next("777");
                    SueldoSupervisor();
                    break;
                default:
                    System.out.println("Ese puesto no existe.");   
                    break;
                }
            }catch(Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Ingresa solo numeros validos");
                entrada.nextLine();
                seguir = false;
            }
        }
    }

    public void SueldoSupervisor(){
        double infonavit, medico, isr;
        while(seguir == false){
            try{
                seguir = true;
                infonavit = (sueldoQuincenal[1]) * (0.2);
                medico = (sueldoQuincenal[1]) * (0.1);
                isr = (sueldoQuincenal[1]) * (0.16);
                pagoSupervisor = (sueldoQuincenal[1]) - (infonavit) - (medico) -(isr);
                System.out.println("Tu sueldo es de: " + pagoSupervisor);
            }catch(Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Ingresa solo numeros validos");
                entrada.nextLine();
                seguir = false;
            }
        }
    }

    public void SueldoEmpleado(){
        double hrsdiurnas, hrsnocturnas;
        while(seguir == false){
            try{
                seguir = true;
                System.out.println("Ingresa el numero de horas diurnas extra que trabajaste: ");
                hrsdiurnas = entrada.nextDouble();
                System.out.println("Ingresa el numero de horas nocturnas extra que trabajaste: ");
                hrsnocturnas = entrada.nextDouble();
                pagoEmpleado = (sueldoQuincenal[0]) + (hrsdiurnas*50.0) + (hrsnocturnas*60.0);
                System.out.println("Tu sueldo quincenal es: " + pagoEmpleado);
            }catch(Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Ingresa solo numeros");
                entrada.nextLine();
                seguir = false;
            }
        }
    }
}