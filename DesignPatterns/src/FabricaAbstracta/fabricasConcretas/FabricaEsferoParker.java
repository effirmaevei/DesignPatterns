package FabricaAbstracta.fabricasConcretas;

import FabricaAbstracta.fabricas.FabricaEsferoAbstracta;
import FabricaAbstracta.productos.CubiertaAbstracta;
import FabricaAbstracta.productos.MinaAbstracta;
import FabricaAbstracta.productosConcretos.CubiertaParker;
import FabricaAbstracta.productosConcretos.MinaParker;
import FabricaAbstracta.productosConcretos.PuntaParker;

public class FabricaEsferoParker extends FabricaEsferoAbstracta{

	@Override
	public MinaAbstracta fabricarMina(Object info) {
		
		return new MinaParker((String) info);
	}

	@Override
	public PuntaParker fabricarPunta(Object info) {
		return new PuntaParker((String) info);
	}

	@Override
	public CubiertaAbstracta fabricarCubierta(Object info) {
		return new CubiertaParker((String) info);
	}
}
