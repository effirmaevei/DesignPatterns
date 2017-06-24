package FabricaAbstracta.fabricas;

import FabricaAbstracta.productos.CubiertaAbstracta;
import FabricaAbstracta.productos.MinaAbstracta;
import FabricaAbstracta.productos.PuntaAbstracta;

public abstract class FabricaEsferoAbstracta {
	
	public abstract MinaAbstracta fabricarMina(Object info);
	public abstract PuntaAbstracta fabricarPunta(Object info);
	public abstract CubiertaAbstracta fabricarCubierta(Object info);	 

}
