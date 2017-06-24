package FabricaAbstracta;
import FabricaAbstracta.fabricas.FabricaEsferoAbstracta;
import FabricaAbstracta.fabricasConcretas.FabricaEsferoBic;
import FabricaAbstracta.fabricasConcretas.FabricaEsferoParker;
import FabricaAbstracta.productos.CubiertaAbstracta;
import FabricaAbstracta.productos.MinaAbstracta;
import FabricaAbstracta.productos.PuntaAbstracta;

public class Aplicacion {

	public static void main(String[] args) {
		
		FabricaEsferoAbstracta fabricaBic;
		fabricaBic = new FabricaEsferoBic();
		FabricaEsferoAbstracta fabricaParker;
		fabricaParker = new FabricaEsferoParker();
		
		CubiertaAbstracta cubiertaBic;
		cubiertaBic = fabricaBic.fabricarCubierta("E002");
		PuntaAbstracta puntaBic;
		puntaBic = fabricaBic.fabricarPunta("C107");
		MinaAbstracta minaBic;
		//B301 could be product A3, serial 01
		minaBic = fabricaBic.fabricarMina("B301");			
		
		PuntaAbstracta puntaParker;
		puntaParker = fabricaParker.fabricarPunta("CP21");
		MinaAbstracta minaParker;
		minaParker = fabricaParker.fabricarMina("BP20");

		/* Used as DEMO  */
		System.out.println(cubiertaBic.getAbout());
		System.out.println(puntaBic.getAbout());
		System.out.println(minaBic.getAbout());
		System.out.println(puntaParker.getAbout());
		System.out.println(minaParker.getAbout());
		
	}
}
