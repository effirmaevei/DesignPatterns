package ThreeLvlBuilder.bed;

public abstract class BedBuilder {

	// PROTECTED reference to the product to be used by the concrete builders
	protected Bed bed;
	
	
	// PROTECTED Fields required for object construction
	protected String customer;
	protected String type;
	
	// The get product method meant to retrieve the finished product. Arguably better as private.
	public Bed getBed(){
		return bed;
	}
	
	// A method to create a new empty object to be built. Like a container.
	public void createNewProduct(){
		bed = new Bed(customer, type);
	}
	
	// Abstract methods to be defined in concrete factories. 
	// Normally, one for each part of the product.
	public abstract void buildPart1();
	public abstract void buildPart2();
	public abstract void buildPart3();
	public abstract void buildPart4();

	
	
	
	
}
