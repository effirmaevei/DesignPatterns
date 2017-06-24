package CompositeShipTax;
import java.util.List;
import java.util.ArrayList;

// Masa en toneladas metricas
public class BuqueContenedor implements Componente{
			
	List<Componente> comps = new ArrayList<>();
	double peso;
	double pesoPropio;
	String tipo;
		
	public BuqueContenedor(String tipo, double pesoPropio) {
		this.pesoPropio = pesoPropio;
		this.tipo = tipo;
	}
	
	@Override
	public void agregar(Componente comp){
		comps.add(comp);
	}
	
	@Override
	public void remover(Componente comp){
		comps.remove(comp);
	}
	
	@Override
	public double getPeso(){
		double pesoNeto = pesoPropio;		
		for(Componente comp: comps){
			pesoNeto+=comp.getPeso();
		}		
		return pesoNeto;
	}
		
	@Override
	public Componente getComponente(int index){
		return comps.get(index);
	}
	
	public double getPesoPropio(){
		return pesoPropio;
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	
	
	
	
	
}
