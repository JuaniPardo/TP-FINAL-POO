package vehiculos;

public class Moto extends Vehiculo{
    private int cilindrada;

    //Constructor

    public Moto(String marca, int ruedas, int cilindrada) {
        super(marca, 2);
        this.cilindrada = cilindrada;
    }


    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                "} " + super.toString();
    }
}
