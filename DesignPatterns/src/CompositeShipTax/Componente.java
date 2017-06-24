package CompositeShipTax;

public interface Componente {
		
	public void agregar(Componente comp);
	
	public void remover(Componente comp);
	
	public double getPeso();
	
	public Componente getComponente(int index);
	
	public String getTipo();
	
	//Operaci�n no incluida en el dise�o composite
	public default String describir(){
		return "El peso de los componentes esta dado en "
				+ "toneladas metricas.";
	}
	
}
