package TicTacToeFlyweight;
public class IconifiedO extends Flyweight{

	private static IconifiedO instance;

	private IconifiedO() {
		this.visualData = "O";
	}

	
	public static synchronized Flyweight getFlyweight() {
		if(instance == null){
			instance = new IconifiedO();
		}
		return instance;
	}
	
}
