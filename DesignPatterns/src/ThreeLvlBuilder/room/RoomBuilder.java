package ThreeLvlBuilder.room;

public abstract class RoomBuilder {

	// PROTECTED reference to the product to be used by the concrete builders
	protected Room product;
	
	
	// PROTECTED Fields required for object construction
	protected String customer;
	protected String type;
	
	// A method to create a new empty object to be built. Like a container.
	public void createNewProduct(){
		product = new Room(customer, type);
	}
	
	// Abstract methods to be defined in concrete factories. 
	// Normally, one for each part of the product.
	public abstract void buildPart1();
	public abstract void buildPart2();
	public abstract void buildPart3();
	public abstract void buildPart4();

	// The get product method meant to retrieve the finished product. Arguably better as private.
	public Room getRoom() {
		return null;
	}
	
	
	
	
}
