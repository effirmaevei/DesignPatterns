package SandwichDecorator;

public class WithOnions extends SandwichDecorator {

	public WithOnions(Sandwich sandwich) {
		super(sandwich);	//Super constructor stores sandwich locally		
		this.description = "Onions";
	}

	@Override
	public String getDescription() {
		return sandwich.getDescription() + " -" + description;
	}

	@Override
	public float getPrice() {
		return sandwich.getPrice() + 0.3f;
	}

	
	
}
