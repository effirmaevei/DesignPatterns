package FacturePrototyper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Jose Manuel Ferreira Benavides
 * 
 */
public class PrototipoDemo {

	public static void main(String[] args) throws ParseException{
		
		int TARIFA_BASE = 3000;
		
		Fabrica fabrica = Fabrica.getFabrica();  
		FacturaDuplicable proto = (FacturaDuplicable) fabrica.getPrototipo("protoAuto");		
		System.out.println("Prototipo: \n\n" + proto + "\n");
		
		//Las entradas generadas al procesador dos tickets de retiro de vehiculo			
		String[] in = {"05-10-2017", "14:10", "32A"};
		String[] in0 = {"05-10-2017", "10:10", "42A"};
		
		//Se procede a crear facturas como duplicados de "proto"
		//El valor del servicio depende de cuando se hace la petición de facturar
		Factura factura = procesarFacturado(in, proto, TARIFA_BASE);
		Factura factura2 = procesarFacturado(in0, proto, TARIFA_BASE);
		
		System.out.println(factura);
		System.out.println();
		System.out.println(factura2);				
			
	}	
	
	static Factura procesarFacturado(String[] in, FacturaDuplicable prototipo, int tarifa) 
			throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm");
		Date date = sdf.parse(in[0]+" "+in[1]);
		
		Date rightNow = new Date();
		String horas = (rightNow.getTime()-date.getTime())/(1000*3600) + "";		
		Factura factura = prototipo.duplicar();
		
		factura.setZona(in[2]);
		factura.setTiempoServicio(horas + " hrs");
		factura.setEntrada(sdf.format(date));
		factura.setSalida(sdf.format(rightNow));
		
		if(Integer.valueOf(horas)>1){
			factura.setCostoServicio(String.valueOf(tarifa * Integer.valueOf(horas)));
		}
		
		return factura;						
		
	}
	
}	
