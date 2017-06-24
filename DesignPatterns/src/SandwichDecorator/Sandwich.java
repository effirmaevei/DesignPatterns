package SandwichDecorator;

public abstract class Sandwich {
		
	protected String description;
	
	public abstract String getDescription();
	public abstract float getPrice();
	
	public void setDescription(String description) {
		this.description = description;
	}	
}
