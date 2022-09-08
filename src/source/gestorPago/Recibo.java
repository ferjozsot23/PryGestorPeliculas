package source.gestorPago;

import java.time.LocalDateTime;

import java.util.List;

public  class Recibo {
//
    int numeroFactura;
    LocalDateTime fecha;
    float monto;
    String detalles;
    float multa;
    //cambiar por lista de copias
    List<String> contenido;

    //aqui se reciben un listado de copias; cambiar String por copia
    public Recibo(List<String> contenido) {
//        //Consultar a la base de datos el ultimo numero de factura registrado/
//        this.numeroFactura=1;
//
        this.fecha =LocalDateTime.now();
//        this.contenido=contenido;
//
        this.monto=calcularSubTotal();
    }
    public Recibo(int dias, int peliculas){
        //        //Consultar a la base de datos el ultimo numero de factura registrado/
//        this.numeroFactura=1;
        this.fecha =LocalDateTime.now();
        this.multa= (float) (Math.round((dias*peliculas*0.75)*100.0)/100.0);
    }
    //debe recibir un cliente
    //generarDetalle(Cliente cliente)

    public void generarDetalles(Cliente cliente, float efectivo){//efectivo: dinero fisico entregado por el comprador
        detalles="              ALQUILER               \n";
        detalles+="Fecha: Quito, "+fecha+"\n";
        for(String dato: cliente.getDatosCliente()){
            detalles+=dato+"\n";
        }
        detalles+="_____________\n";
        detalles+="Producto                       Precio\n";

//        for(Copia pelicula: contenido){
//            //del titulo de la pelicula se observan solo 20 caracteres
//            if(pelicula.titulo.length()>=30){
//                detalles += pelicula.titulo.substring(0,29)+"   "+pelicula.precio+"\n";
//            }else{
//                detalles += pelicula.titulo+"                 "+pelicula.precio+"\n";
//            }
        /*
        for(String pelicula: contenido){
           //del titulo de la pelicula se observan solo 20 caracteres
           if(pelicula.titulo.length()>=30){
                detalles += pelicula.titulo.substring(0,29)+"   "+1.5+"\n";
            }else{
                detalles += pelicula.titulo+"                 "+1.5+"\n";
            }
        }
        */
        detalles+="_____________\n";
        detalles+="Sub Total: "+monto+"\n";
        detalles+="12% IVA: "+calcularImpuestos()+"\n";
        detalles+="Total USD: "+calcularTotal()+"\n";
        detalles+="Valor Efectivo: "+efectivo+"\n";
        detalles+="Valor Cambio: "+calcularVuelto(efectivo)+"\n";
    }
    public void generarDetallesMulta(Cliente cliente, float efectivo){//efectivo: dinero fisico entregado por el comprador
        detalles="                MULTA                \n";
        detalles+="Fecha: Quito, "+fecha+"\n";
        for(String dato: cliente.getDatosCliente()){
            detalles+=dato+"\n";
        }
        detalles+="_____________\n";
        detalles+="Descripcion                    Costo \n";
        detalles+="Multa                         \n"+this.multa;
        detalles+="_____________\n";
        detalles+="Sub Total: "+monto+"\n";
        detalles+="12% IVA: "+calcularImpuestos()+"\n";
        detalles+="Total USD: "+calcularTotal()+"\n";
        detalles+="Valor Efectivo: "+efectivo+"\n";
        detalles+="Valor Cambio: "+calcularVuelto(efectivo)+"\n";
    }
    public float calcularTotal() {
        float total=monto+calcularImpuestos();
        total=(float) (Math.round(total*100.0)/100.0);
        return total;
    }

    public float calcularSubTotal() {
        //alquilar una pelicula cuesta 1.5$, sin impuestos
        float subTotal= (float) (this.contenido.size()*1.5);
        subTotal=(float) (Math.round(subTotal*100.0)/100.0);
        return subTotal;
    }

    public float calcularImpuestos() {
        float impuesto=(float) (0.12*monto);
        return  impuesto;
    }

    public float calcularVuelto(float entrega){
        //se retorna -1 si es que el efectivo entregado es inferior al precio total a pagar
        if(entrega<calcularTotal()){
            return -1;
        }
        float vuelto = entrega-calcularTotal();
        vuelto=(float) (Math.round(vuelto*100.0)/100.0);
        return vuelto;
    }
//
//    public void registrarDatos() {
//
//    }
//
}