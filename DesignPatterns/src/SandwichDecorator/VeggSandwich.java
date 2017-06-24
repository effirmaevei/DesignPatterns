package SandwichDecorator;

public class VeggSandwich extends Sandwich{
		
	public VeggSandwich() {
		setDescription("Vegetarian Sandwich");
	}

	@Override
	public String getDescription() {
		return "Contents of " + description + ": ...";
	}

	@Override
	public float getPrice() {
		return 2.5f;
	}
}
