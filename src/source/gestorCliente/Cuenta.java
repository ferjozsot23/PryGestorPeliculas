package source.gestorCliente;

public class Cuenta {
    private String nombre;
    private String apellido;
    //private String username;
   // private String password;
    private String telefono;
    private String direccion;
    private String identificacion;
/*
  String nombre;
    String apellido;
    String direccion;
    String telefono;
    String identifiacion;
 */
    //private Pelicula pelicula;

    //p
    public Cuenta() {
    }

    public Cuenta(String nombre, String apellido, String telefono, String direccion, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}