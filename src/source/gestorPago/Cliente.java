package source.gestorPago;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String identifiacion;


    public Cliente(String nombre, String apellido, String direccion, String telefono, String identifiacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.identifiacion = identifiacion;
    }

    void registrarCliente(){

    }

    void verificarIdentificacion(){

    }

    public List<String> getDatosCliente(){
        List<String> datosCliente = new ArrayList<>();
        datosCliente.add("Nombre: " + nombre);
        datosCliente.add("Apellido: " + apellido);
        datosCliente.add("Dirección: " + direccion);
        datosCliente.add("Teléfono: " + telefono);
        datosCliente.add("Identificación: " + identifiacion);

        return datosCliente;
    }
}
