package source.gestorCuenta;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GestorCuenta{

    private ArrayList<Cuenta> listaCuenta =new ArrayList<Cuenta>();
    private int contador = 0;

    public ArrayList<Cuenta> getListaCuenta() {
        return listaCuenta;
    }

    public void setListaCuenta(ArrayList<Cuenta> listaCuenta) {
        this.listaCuenta = listaCuenta;
    }

    public Cuenta crearCuenta(String datosCuenta[]){
        Cuenta cuentaNueva = new Cuenta(datosCuenta[0],datosCuenta[1],datosCuenta[2],datosCuenta[3],datosCuenta[4]);
        anadirCuenta(cuentaNueva);
        return cuentaNueva;
    }

    public void anadirCuenta(Cuenta cuentaNueva){
        this.listaCuenta.add(cuentaNueva);
    }

    public void modificarPassword(String newPassword, String correo){
        int auxiliar = buscarCuenta(correo);
        listaCuenta.get(auxiliar).setPassword(newPassword);
    }
    public void modificarCorreo(String newCorreo, String correo){
        int auxiliar = buscarCuenta(correo);
        listaCuenta.get(auxiliar).setCorreo(correo);
    }
    public void modificarUsuario(String newUsername, String correo){
        int auxiliar = buscarCuenta(correo);
        listaCuenta.get(auxiliar).setUsername(newUsername);
    }

    public int buscarCuenta(String correo){
        for(int i=0; i<listaCuenta.size();i++){
            if(listaCuenta.get(i).getCorreo() == correo){
                return i;
            }
        }
        return -1;
    }

    public void borrarCuenta(String correo, String password){
        int aux = buscarCuenta(correo);
        if (aux >= 0){
            if(listaCuenta.get(aux).getCorreo() == correo && listaCuenta.get(aux).getPassword() == password) {
                listaCuenta.remove(aux);
            }else{
                JOptionPane.showMessageDialog(null, "No existe el correo asociado a la cuenta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}