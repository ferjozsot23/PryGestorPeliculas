public class Venta {
	private String Referencia;
	private int valorUnidad, cantidad;
	
	
	Venta (String referencia, int valorUnidad, int cantidad){
		setReferencia(referencia);
		setValorUnidad(valorUnidad);
		setCantidad(cantidad);	
	}

	public String getReferencia() {
		return Referencia;
	}
	public void setReferencia(String n) {
		Referencia = n;
	}
	public int getValorUnidad() {
		return valorUnidad;
	}
	public void setValorUnidad(int cr) {
		this.valorUnidad = cr;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int e) {
		this.cantidad = e;
	}
	public void mostrarVenta() {
		System.out.println("\nReferencia: "+ getReferencia()+ "\nValorUnidad:"+getValorUnidad()+"\nCantidad: "+ getCantidad()+ 
				"\nTotal a pagar por dicha articulo" + getValorUnidad()*getCantidad());
	}
	
		
}
