package FabricaAbstracta.fabricasConcretas;

import FabricaAbstracta.fabricas.FabricaEsferoAbstracta;
import FabricaAbstracta.productos.CubiertaAbstracta;
import FabricaAbstracta.productos.MinaAbstracta;
import FabricaAbstracta.productos.PuntaAbstracta;
import FabricaAbstracta.productosConcretos.CubiertaBic;
import FabricaAbstracta.productosConcretos.MinaBic;
import FabricaAbstracta.productosConcretos.PuntaBic;

public class FabricaEsferoBic extends FabricaEsferoAbstracta {

	@Override
	public MinaAbstracta fabricarMina(Object info) {
		return new MinaBic((String) info);
	}

	@Override
	public PuntaAbstracta fabricarPunta(Object info) {

		return new PuntaBic((String) info);
	}

	@Override
	public CubiertaAbstracta fabricarCubierta(Object info) {
		return new CubiertaBic((String) info);
	}

}
