package CompositeShipTax;
// Masa en toneladas metricas
public class Embarcacion implements Componente{
	
	double peso;
	String tipo;

	
	public Embarcacion(String tipo, double peso) {
		this.peso = peso;
		this.tipo = tipo;
	}
		
	@Override
	public void agregar(Componente comp) {
		throw new RuntimeException("Violación al intentar "
				+ "acceder a componentes de una hoja.");
	}

	@Override
	public void remover(Componente comp) {
		throw new RuntimeException("Violación al intentar "
				+ "acceder a componentes de una hoja.");		
	}

	@Override
	public double getPeso() {
		return peso;		//toneladas metricas
	}

	@Override
	public Componente getComponente(int index) {
		throw new RuntimeException("Violación al intentar "
				+ "acceder a componentes de una hoja.");
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
