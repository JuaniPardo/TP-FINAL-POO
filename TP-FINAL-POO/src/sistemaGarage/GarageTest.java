package sistemaGarage;

import vehiculos.*;

import java.util.Scanner;

public class GarageTest {

    //Método para crear vehículos de forma aleatoria
    public static Vehiculo crearVehiculo(){
        String[] marcasCoche = {"Ford", "Chevrolet", "Peugeot", "Renault", "Toyota"};
        String[] marcasMoto = {"Honda", "Yamaha", "Suzuki", "Ducati", "Zanella"};
        int[] puertas = {3, 4, 5}; //Se podrìa usar String, no se usan para operar
        int[] cilindrada = {150, 250, 500};  //Se podrìa usar String, no se usan para operar
        int esCoche = (int) (Math.random()*2);
        int marca = (int) (Math.random()*5);
        int dato = (int) (Math.random()*3);
        if (esCoche == 0 ) {
            return new Coche(marcasCoche[marca], 4, puertas[dato] );
        } else {
            return new Moto(marcasMoto[marca], 2, cilindrada[dato]);
        }

    }

    // Método para mostrar el menú y leer la opción seleccionada
    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Ingresar un vehículo");
        System.out.println("2. Procesar un vehículo");
        System.out.println("3. Ver vehículos atendidos");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    //============ Método MAIN ============
    public static void main(String[] args) {


        // CREO EL GARAGE CPS (Caravallo-Pardo-Sain)
        Garage garageCPS = new Garage(5,500.0);

        boolean salir = false;
        while (!salir) {
            int opcion = mostrarMenu();
            switch (opcion) {
                case 1 -> garageCPS.ingresarVehiculo(crearVehiculo());
                case 2 -> garageCPS.procesarVehiculo();
                case 3 -> {
                    System.out.println("Vehículos atendidos:");
                    garageCPS.mostrarAtendidos();
                }
                case 4 -> salir = true;
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        /*garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();

        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.ingresarVehiculo(crearVehiculo());
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();
        garageCPS.procesarVehiculo();
        System.out.println("--------------------------");
        garageCPS.mostrarAtendidos();*/

        //// TODO: 20/06/2023 AGREGAR Menú
    }

}
