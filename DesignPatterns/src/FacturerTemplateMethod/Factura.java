package FacturerTemplateMethod;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
	
	protected static int totalCreadas = 0;
	protected int id;
	protected String zona;
	protected char tipoZona;
	protected Date entrada, salida;
	protected String tiempoServicio;   //in hours
	protected String costoServicio;
	
	public Factura() {
		totalCreadas++;
		id = totalCreadas;
	}
	
	public Factura(Date date, int horas, int costo, String zona) {
		this();
		salida = new Date();	// A date with the current time
		entrada = date;
		tiempoServicio = String.valueOf(horas);
		costoServicio =  String.valueOf(costo);
		this.zona = zona; 	
	}
		
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm");
	
		return "Factura " + id + ", zona= " + zona 
				+ ", \nentrada= " + sdf.format(entrada) + ", \nsalida= " + sdf.format(salida)
				+ ", \ntiempoServicio= " + tiempoServicio + " hr, costoServicio= "
				+ costoServicio + " COP";
	}
}


