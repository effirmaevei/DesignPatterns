package TicTacToeFlyweight;
public class IconifiedX extends Flyweight{
	
	private static IconifiedX instance;
	
	private IconifiedX() {
		this.visualData = "X";
	}

	public static synchronized Flyweight getFlyweight() {
		if(instance == null){
			instance = new IconifiedX();
		}
		return instance;
	}

}
