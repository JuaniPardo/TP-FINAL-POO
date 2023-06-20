package vehiculos;

public class Vehiculo {
    private final String MARCA;
    private final int RUEDAS;

    public Vehiculo(String marca, int ruedas) {
        this.MARCA = marca;
        this.RUEDAS = ruedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + MARCA + '\'' +
                ", ruedas=" + RUEDAS +
                '}';
    }

    public int getRUEDAS() {
        return RUEDAS;
    }
}
