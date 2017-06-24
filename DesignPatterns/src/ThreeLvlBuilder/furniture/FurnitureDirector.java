package ThreeLvlBuilder.furniture;

public class FurnitureDirector {

	
	private FurnitureBuilder furnBuilder;
	
	public Furniture getFurniture() {
		return furnBuilder.getFurniture();
	}

	public void setBuilder(FurnitureBuilder furnBuilder) {
		this.furnBuilder = furnBuilder; 
	}
	
	
	
}
