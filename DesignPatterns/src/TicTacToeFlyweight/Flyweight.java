package TicTacToeFlyweight;
/**
 * Fly weights in this program have no extrinsic or context dependent state.
 * The only fly weights in existence are the ones created by the game manager.
 *  
 */
public abstract class Flyweight{
	
	protected String visualData;  // = O X  shared
	
	@Override
	public String toString() {
		return visualData;
	}
	
	public String getVisualData() {
		return visualData;
	}		
	
	public static synchronized Flyweight getFlyweight(){
		return null;
	};
	
}
