package sistemaGarage;

import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

import java.util.ArrayList;

public class GarageTest {
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
    public static void main(String[] args) {
        ArrayList<Vehiculo> listavehiculos = new ArrayList<>();
        listavehiculos.add(crearVehiculo());

        listavehiculos.forEach(System.out::println);

    }

}
