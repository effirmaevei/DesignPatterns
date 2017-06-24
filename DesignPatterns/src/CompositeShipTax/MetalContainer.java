package CompositeShipTax;

public class MetalContainer implements Componente{

	double peso;
	
	public MetalContainer(double peso) {
		this.peso = peso;
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
		return "CM-33";
	}

}
