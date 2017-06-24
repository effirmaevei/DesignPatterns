package SandwichDecorator;

public class WithChips extends SandwichDecorator {

	public WithChips(Sandwich sandwich) {
		super(sandwich);	//Super constructor stores sandwich locally		
		this.description = "Potato chips";
	}

	@Override
	public String getDescription() {
		return sandwich.getDescription() + " -" + description;
	}

	@Override
	public float getPrice() {
		return sandwich.getPrice() + 0.8f;
	}

	
	
}
