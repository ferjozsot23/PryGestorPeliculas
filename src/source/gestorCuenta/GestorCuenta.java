package source.gestorCuenta;

public class GestorCuenta{

    public Cuenta crearCuenta(String datosCuenta[]){
        Cuenta cuenta = new Cuenta(datosCuenta[0],datosCuenta[1],datosCuenta[2],datosCuenta[3],datosCuenta[4]);
        return cuenta;
    }

}