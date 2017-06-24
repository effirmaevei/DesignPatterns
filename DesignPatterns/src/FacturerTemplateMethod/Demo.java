package FacturerTemplateMethod;
public class Demo {

	public static void main(String[] args) {

		String[] in = { "05-10-2017", "14:10", "32A" };
		String[] in1 = { "05-21-2017", "04:20", "52B" };
		String[] in2 = { "05-25-2017", "18:11", "30D" };

		Facturacion factu = new FacturacionEstandar();
		/*
		 * Construir factura encapsula el algoritmo de facturacion y evita
		 * modificacion en el orden
		 */
		Factura fact = factu.construirFactura(in);

		System.out.println("\n***FACTURA 1 *****");
		System.out.println(fact);

		Factura fact1 = factu.construirFactura(in1);
		System.out.println("\n***FACTURA 2 *****");
		System.out.println(fact1);

		Factura fact2 = factu.construirFactura(in2);
		System.out.println("\n***FACTURA 3 *****");
		System.out.println(fact2);
		
	}
}
