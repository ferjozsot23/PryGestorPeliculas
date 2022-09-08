package source.gestorCliente;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GestorCliente {

    private ArrayList<Cuenta> listaCliente =new ArrayList<Cuenta>();
    private int contador = 0;

    public ArrayList<Cuenta> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cuenta> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cuenta crearCliente(String datosCuenta[]){
        Cuenta cuentaNueva = new Cuenta(datosCuenta[0],datosCuenta[1],datosCuenta[2],datosCuenta[3],datosCuenta[4]);
        anadirCliente(cuentaNueva);
        return cuentaNueva;
    }

    public void anadirCliente(Cuenta cuentaNueva){
        this.listaCliente.add(cuentaNueva);
    }
/*
    public void modificarPassword(String newPassword, String correo){
        int auxiliar = buscarCuenta(correo);
        listaCliente.get(auxiliar).setPassword(newPassword);
    }
    public void modificarCorreo(String newCorreo, String correo){
        int auxiliar = buscarCuenta(correo);
        listaCliente.get(auxiliar).setCorreo(correo);
    }
    public void modificarUsuario(String newUsername, String correo){
        int auxiliar = buscarCuenta(correo);
        listaCliente.get(auxiliar).setUsername(newUsername);
    }
*/
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

    public Cuenta visualizarDatos(String identificacion) {
        int aux = buscarCliente(identificacion);
        if (aux >= 0){
            if(listaCliente.get(aux).getIdentificacion().equals(identificacion)) {
               return listaCliente.get(aux);
            }else{
                JOptionPane.showMessageDialog(null, "No existe la identificacion asociado a la cuenta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return new Cuenta();
    }

    /*
    public boolean validarCorreo(String correo){ // Aún en proceso, servirá en el futuro
        int auxiliar = buscarCuenta(correo);
        return (auxiliar>=0)?true:false;
    }
     */
/*
    public boolean confirmarPasswordAndCorreo(String correo, String passwordInserted){
        int auxiliar = buscarCuenta(correo);
         if (auxiliar >= 0){
            if (listaCuenta.get(auxiliar).getPassword().equals(passwordInserted)){
                return true;
            }
        }
        return false;
    }
*/
    /*
    public void iniciarSesion(String correo, String password){
        confirmarPasswordAndCorreo(correo,password);
        JOptionPane.showMessageDialog(null, "Bienvenido", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
    }*/

}