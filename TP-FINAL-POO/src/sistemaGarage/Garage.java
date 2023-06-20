package sistemaGarage;

import vehiculos.Vehiculo;

import java.util.ArrayList;

public class Garage {
    private int capacidadMax;
    private double  precioCubierta;
    private Cola colaAtencion;
    private ArrayList<Vehiculo> listaAtendidos;

    //CONSTRUCTOR
    public Garage(int capacidadMax, double precioCubierta) {
        this.capacidadMax = capacidadMax;
        this.precioCubierta = precioCubierta;
        colaAtencion = new Cola(capacidadMax);
        listaAtendidos = new ArrayList<>();
    }

    //Metodos
    public void ingresarVehiculo(Vehiculo v) {
        colaAtencion.meter(v);
    }

    public void procesarVehiculo() {
        Vehiculo v;
        v = colaAtencion.sacar();
        if (v != null) {
            listaAtendidos.add(v);
        }
    }

    public void mostrarAtendidos() {
        double ganancia = 0.0;
        for (int i = 0; i < listaAtendidos.size(); i++) {
            System.out.println(listaAtendidos.get(i));
            ganancia += precioCubierta*listaAtendidos.get(i).getRuedas();
        }
        System.out.println("Ganancia: " + ganancia);
    }

}
