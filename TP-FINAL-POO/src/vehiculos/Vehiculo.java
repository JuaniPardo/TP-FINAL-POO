package vehiculos;

public class Vehiculo {
    private String marca;
    private int ruedas;

    public Vehiculo(String marca, int ruedas) {
        this.marca = marca;
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", ruedas=" + ruedas +
                '}';
    }

    public int getRuedas() {
        return ruedas;
    }
}
