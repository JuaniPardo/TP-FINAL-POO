package vehiculos;

public class Coche extends Vehiculo{
    private int puertas;


    //Metodos

    public Coche(String marca, int ruedas, int puertas) {
        super(marca, 4);
        this.puertas = puertas;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "puertas=" + puertas +
                "} " + super.toString();
    }
}
