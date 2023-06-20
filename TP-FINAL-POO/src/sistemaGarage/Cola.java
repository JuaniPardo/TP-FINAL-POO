package sistemaGarage;

import vehiculos.Vehiculo;

public class Cola {
    private final Vehiculo[] COLA_VEHICULOS; // Array para almacenar los elementos de la cola
    private final int LONGITUD; // Tamaño del array
    private int primero; // Puntero al primer elemento de la cola
    private int ultimo; // Puntero al último elemento de la cola
    private int enCola;

    //Constructor de la cola
    public Cola(int longitud) {
        this.LONGITUD = longitud + 1; //Por como está armada la lógica, la cola tiene un lugar menos que el array
        COLA_VEHICULOS = new Vehiculo[this.LONGITUD];
        primero = 0;
        ultimo = 0;
        enCola = 0;
    }

    public boolean colaVacia() {
        return primero == ultimo; // La cola está vacía si los punteros son iguales
    }

    public boolean colaLlena() {
        return siguiente(ultimo) == primero; // La cola está llena si el siguiente índice del puntero "ultimo" es igual al puntero "primero"
    }

    public void meter(Vehiculo v) {   //Este método ingresa vehículos a la cola
        if (colaLlena()) {
            System.out.println("La cola está llena. No se puede añadir el vehículo.");
        } else {
            COLA_VEHICULOS[ultimo] = v; // Añadir el vehículo al índice "ultimo"
            ultimo = siguiente(ultimo); // Actualizar el puntero "ultimo" al siguiente índice
            enCola++;
            System.out.println( v + "  añadido correctamente a la cola. " + enCola + " vehículos en la cola.");
        }

    }

    public Vehiculo sacar() {   //Este método saca vehículos de la cola
        if (colaVacia()) {
            System.out.println("La cola está vacía. No hay ningún vehículo.");
            return null;
        } else {
            Vehiculo vehiculo = COLA_VEHICULOS[primero]; // Obtener el vehículo en el índice "primero"
            primero = siguiente(primero); // Actualizar el puntero "primero" al siguiente índice
            enCola--;
            System.out.println("Vehículo sacado de la cola correctamente. " + enCola + " vehículos en la cola.");
            return vehiculo;
        }
    }

    private int siguiente(int i) {  //Este método incrementa los punteros de forma circular
        return (i + 1) % LONGITUD;
    }
}
