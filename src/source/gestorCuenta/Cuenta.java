package source.gestorCuenta;

public class Cuenta {
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String correo;

    //private Pelicula pelicula;

    //p
    public Cuenta() {
    }

    public Cuenta(String nombre, String apellido, String username, String password, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.correo = correo;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "\n Nombre='" + nombre +
                "\n Apellido='" + apellido +
                "\n sername='" + username +
                "\n password='" + password +
                "\n correo='" + correo +
                '}';
    }
}