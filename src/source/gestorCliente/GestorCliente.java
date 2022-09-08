package source.gestorCliente;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GestorCliente {

    private ArrayList<Cliente> listaCliente =new ArrayList<Cliente>();
    private int contador = 0;

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cliente crearCliente(String datosCuenta[]){
        Cliente cuentaNueva = new Cliente(datosCuenta[0],datosCuenta[1],datosCuenta[2],datosCuenta[3],datosCuenta[4]);
        anadirCliente(cuentaNueva);
        return cuentaNueva;
    }

    public void anadirCliente(Cliente cuentaNueva){
        this.listaCliente.add(cuentaNueva);
    }

public void modificarDireccion(String newDireccion, String identificacion){
    int auxiliar = buscarCliente(identificacion);
    listaCliente.get(auxiliar).setDireccion(newDireccion);
}

    public void modificarTelefono(String newTelefono, String identificacion){
        int auxiliar = buscarCliente(identificacion);
        listaCliente.get(auxiliar).setTelefono(newTelefono);
    }
    public int buscarCliente(String identificacion){
        for(int i = 0; i< listaCliente.size(); i++){
            if(listaCliente.get(i).getIdentificacion().equals(identificacion)){
                return i;
            }
        }
        return -1;
    }

    public void eliminarCliente(String identificacion){
        int aux = buscarCliente(identificacion);
        if (aux >= 0){
            if(listaCliente.get(aux).getIdentificacion().equals(identificacion)) {
                listaCliente.remove(aux);
            }else{
                JOptionPane.showMessageDialog(null, "No existe la identificacion asociado a la cuenta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public Cliente visualizarDatos(String identificacion) {
        int aux = buscarCliente(identificacion);
        if (aux >= 0){
            if(listaCliente.get(aux).getIdentificacion().equals(identificacion)) {
               return listaCliente.get(aux);
            }else{
                JOptionPane.showMessageDialog(null, "No existe la identificacion asociado a la cuenta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return new Cliente();
    }

}