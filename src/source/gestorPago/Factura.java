package source.gestorPago;
//
import java.time.LocalDateTime;
//
//import java.util.List;
//
public  class Factura {
//
    int numeroFactura;
    LocalDateTime fecha;
    float monto;
    String detalles;
    //se añade el contenido de la factura
    //puede ser una lista de peliculas o directamente un objeto "carroCompra"
    //List<Pelicula> contenido;

//    public Factura( List<Pelicula> contenido) {
//        //Consultar a la base de datos el ultimo numero de factura registrado/
//        this.numeroFactura=1;
//
//        this.fecha =LocalDateTime.now();
//        this.contenido=contenido;
//
//        this.monto=calcularSubTotal();
//    }
    //debe recibir un cliente
    //generarDetalle(Cliente cliente)
//    public void generarDetalles(Cliente cliente, float efectivo){
//        detalles="";
//        detalles+="Fecha: Quito, "+fecha+"\n";
//        for(String dato: cliente.getDatosCliente()){
//            detalles+=dato+"\n";
//        }
//        detalles+="_____________\n";
//        detalles+="Producto                       Precio\n";
//        for(Pelicula pelicula: contenido){
//            //del titulo de la pelicula se observan solo 20 caracteres
//            if(pelicula.titulo.length()>=30){
//                detalles += pelicula.titulo.substring(0,29)+"   "+pelicula.precio+"\n";
//            }else{
//                detalles += pelicula.titulo+"                 "+pelicula.precio+"\n";
//            }
//
//        }
//        detalles+="_____________\n";
//        detalles+="Sub Total: "+monto+"\n";
//        detalles+="12% IVA: "+calcularImpuestos()+"\n";
//        detalles+="Total USD: "+calcularTotal()+"\n";
//        detalles+="Valor Efectivo: "+efectivo+"\n";
//        detalles+="Valor Cambio: "+calcularVuelto(efectivo)+"\n";
//    }
//    public float calcularTotal() {
//        float total=monto+calcularImpuestos();
//        total=(float) (Math.round(total*100.0)/100.0);
//        return total;
//    }

//    public float calcularSubTotal() {
//        float subTotal=0;
//        for(Pelicula pelicula: contenido){
//            subTotal+=pelicula.precio;
//        }
//        return subTotal;
//    }

//    public float calcularImpuestos() {
//        float impuesto=(float) (0.12*monto);
//        return  impuesto;
//    }
//
//    public float calcularVuelto(float entrega){
//        //se retorna -1 si es que el efectivo entregado es inferior al precio total a pagar
//        if(entrega<calcularTotal()){
//            return -1;
//        }
//        float vuelto = entrega-calcularTotal();
//        vuelto=(float) (Math.round(vuelto*100.0)/100.0);
//        return vuelto;
//    }
//
//    public void registrarDatos() {
//
//    }
//
}