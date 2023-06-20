package sistemaGarage;

import vehiculos.Vehiculo;

import java.util.ArrayList;

public class Garage {
    private final double PRECIO_CUBIERTA;
    private final Cola COLA_ATENCION;
    private final ArrayList<Vehiculo> LISTA_ATENDIDOS;

    //CONSTRUCTOR
    public Garage(int capacidadMax, double precio) {
        this.PRECIO_CUBIERTA = precio;
        COLA_ATENCION = new Cola(capacidadMax);
        LISTA_ATENDIDOS = new ArrayList<>();
    }

    //Métodos
    public void ingresarVehiculo(Vehiculo v) {
        COLA_ATENCION.meter(v);
    }

    public void procesarVehiculo() {
        Vehiculo v;
        v = COLA_ATENCION.sacar();
        if (v != null) {
            LISTA_ATENDIDOS.add(v);
        }
    }

    //Método para mostrar los vehículos que ya se atendieron y la ganancia total
    public void mostrarAtendidos() {
        double ganancia = 0.0;
        for (Vehiculo v : LISTA_ATENDIDOS) {
            System.out.println(v);
            ganancia += PRECIO_CUBIERTA * v.getRUEDAS();
        }
        System.out.println("Ganancia: " + ganancia);
    }

}
