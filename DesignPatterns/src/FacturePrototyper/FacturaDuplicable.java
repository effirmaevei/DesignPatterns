package FacturePrototyper;

/**
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class FacturaDuplicable extends Factura implements IDuplicable {
	
	static final String EMPRESA = "GenFac";
	static final String TARIFA_MINIMA= "3000";
	
	FacturaDuplicable(){		
		id = 1000 +totalCreadas;		
	}
	
	FacturaDuplicable(char tipoZona) {
		this.tipoZona = tipoZona;
		this.empresa = EMPRESA;
		this.costoServicio = TARIFA_MINIMA;
	}
	
	FacturaDuplicable(FacturaDuplicable ref) {
		this();
		this.tipoZona = ref.tipoZona;	
		this.empresa = ref.empresa;
		this.costoServicio = ref.costoServicio;
	}

	@Override
	public Factura duplicar() {
		System.out.println("*** Factura duplicada desde el prototipo. "
				+ "Facturas creadas= " + totalCreadas + "***\n");
		return new FacturaDuplicable(this);
	}


}
