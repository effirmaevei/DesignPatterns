package PrototypeChoco;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta es una demostracion del patron prototype. En esta se modela una caja de chocolates
 * compuesta por una cubierta y un numero dado de chocolates. El clonado usado sobre los 
 * prototipos es clonado profundo (deep copy). 
 * 
 * @author Jose Manuel Ferreira Benavides
 * 
 */
public class DemoPrototype {

	public static void main(String[] args) {

		int chomelosInProtoBox = 10;

		/* Prototype creation */
		CubiertaDuplicable cubiertaProto = new CubiertaDuplicable("Blanco");
		ChomeloDuplicable choProto = new ChomeloDuplicable("Fresa");

		List<Chomelo> chomelos = new ArrayList<Chomelo>();
		for (int i = 0; i < chomelosInProtoBox; i++) {
			chomelos.add(choProto.duplicate());
		}
		
		CajaChomelosDuplicable cajaProto = new CajaChomelosDuplicable(chomelos, cubiertaProto);

		System.out.println("\n------Prototipos: Se trabaja una caja de chomelos con " 
							+ chomelosInProtoBox + " chomelos\n");
		System.out.println(cajaProto);
		System.out.println("Chocmelos creados: " + Chomelo.getTotalInstances());
		System.out.println("Cubiertas creadas: " + Cubierta.getTotalInstances());
		System.out.println("Cajas (completas) creadas: " + CajaChomelos.getTotalInstances());

		/* Duplication of prototypes */
		CajaChomelos cajaChomelos01 = cajaProto.duplicate();

		System.out.println("\n------Despues de duplicar una caja de chomelos.\n");
		System.out.println("Chocmelos creados: " + Chomelo.getTotalInstances());
		System.out.println("Cubiertas creadas: " + Cubierta.getTotalInstances());
		System.out.println("Cajas (completas) creadas: " + CajaChomelos.getTotalInstances());
		System.out.println(cajaChomelos01);
		
		for(int i = 0; i<10; i++){
			cajaProto.duplicate();
		}
		
		System.out.println("\nLuego de algunos duplicados más... "
				+ "\nCajas (completas) creadas: " + CajaChomelos.getTotalInstances()
				+ "\nChocmelos creados: " + Chomelo.getTotalInstances());		

	}
}
