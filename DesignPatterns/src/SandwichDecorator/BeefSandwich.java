package SandwichDecorator;

public class BeefSandwich extends Sandwich{
		
	public BeefSandwich() {
		setDescription("Beef Sandwich");
	}

	@Override
	public String getDescription() {
		return "Contents of " + description + ": ...";
	}

	@Override
	public float getPrice() {
		return 4.7f;
	}
}
