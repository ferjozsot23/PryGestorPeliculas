package source.gestorPago;

import java.text.SimpleDateFormat;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.time.temporal.ChronoUnit;

public class Renta {
    private Recibo factura; //factura de la renta de película
    private Recibo multa;   //multa en caso de poseerla
    private boolean vigencia;
    private Date fechaInicio;
    private Date fechaFin;
    private long diasExcedidos;
    private final int diasMaximos = 7;
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

    public ArrayList<String> copiasRentadas;
    //constructor
    public Renta(){
        this.fechaInicio = new java.util.Date(); //fecha del inicio de la renta
        this.vigencia = true;
        this.fechaFin = calcularFechaMaxima(this.fechaInicio,diasMaximos);
        this.copiasRentadas = new ArrayList<>();

    }
    //función para verificar que la fecha de entrega es igual a la acordada
    public boolean match(Date fechaEntrega){
        if (fechaFin == fechaEntrega){
            return true;
        }else {
            return false;
        }
    }
    //calcular los días excedidos a la entrega estipulada de las películas
    public void calcularDiasExcedidos(Date fechaEntrega){
        if (match(fechaEntrega)){
            this.diasExcedidos = 0;
        }else{
            this.diasExcedidos= ChronoUnit.DAYS.between((Temporal) getFechaFin(), (Temporal) fechaEntrega);
        }
    }

    /*
    // añadir una película a la lista de películas a rentar
    public void agregarPelicula(Copia c){
        copiasRentadas.add(c);
    }
    // eliminar una película a la lista de películas a rentar
    public void removerPelicula(Copia c){
        copiasRentadas.remove(c);
    }
     */
    // get para la fecha de inicio de la renta
    public Date getFechaInicio() {
        return fechaInicio;
    }
    // get para la fecha de finalización de la renta
    public Date getFechaFin(){
        return fechaFin;
    }

    public static Date calcularFechaMaxima(Date fecha, int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return calendar.getTime();
    }

    // función para agregar la factura por la renta de las películas
    public void emitirFactura(){
        this.factura = new Recibo(this.copiasRentadas);

    }

    // función para agregar la multa en caso de haber retraso en la fecha de entrega
    public void emitirMulta(){
        this.multa = new Recibo((int)this.diasExcedidos,this.copiasRentadas.size());

    }

}
