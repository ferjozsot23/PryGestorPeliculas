package source.gestorPago;


import source.Pelicula;

import java.util.ArrayList;
import java.util.Date;

public class Ventas {
    //private String Referencia;
    private double valorTotal; //Valor total de la venta
    private int id; // id de la venta
    private Date fecha;  //Fecha de la venta
    private String lugar;
    Cliente clienteVenta; // Cliente asociado a la venta
    private ArrayList<Pelicula> peliculasVendidas = new ArrayList<>(); //almacenamiento de películas que se venden

    //private ArrayList<>
    private Ventas(int id, double valorTotal, Cliente c, String lugar) {
        this.id = id;
        this.fecha = new java.util.Date(); //obtención de la fecha actual
        this.clienteVenta = c;
        this.lugar = lugar;
    }
    public int getId(){
        return this.id;
    }

    public String getLugar() {
        return lugar;
    }

    public Date getFecha(){
        return this.fecha;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void agregarPelicula(Pelicula pelicula){
        peliculasVendidas.add(pelicula);
    }

    public void removerPelicula(Pelicula pelicula){
        peliculasVendidas.remove(pelicula);
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Pelicula p: peliculasVendidas ) {
            //total += p.getPrecio();  //sumatoria de los precios de las películas
        }
        return total;
    }

    public void setValorTotal() {
        this.valorTotal = calcularValorTotal();
    }
}