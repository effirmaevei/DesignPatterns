package SandwichDecorator;
public class TestSandwich {
	

	
	public static void main(String[] args) {
		
		Sandwich beefS = new BeefSandwich();
		Sandwich veggS = new VeggSandwich();
		
		System.out.println(veggS.getDescription() + "\nPrice: " + veggS.getPrice() + "\n");
		System.out.println(beefS.getDescription() + "\nPrice: " + beefS.getPrice() + "\n");
		
		SandwichDecorator sWithChips = new WithChips(veggS);
		
		System.out.println(sWithChips.getDescription() + "\nPrice: " + sWithChips.getPrice()+ "\n");
		
		SandwichDecorator onionsNChips = new WithOnions(sWithChips);
		
		System.out.println(onionsNChips.getDescription() + "\nPrice: " + onionsNChips.getPrice()+ "\n");
		
		System.out.println("Original vegg sandwich can be retrieved without decorations");
		System.out.println(veggS.getDescription() + "\nPrice: " + veggS.getPrice()+ "\n");
		
		
	}
}
