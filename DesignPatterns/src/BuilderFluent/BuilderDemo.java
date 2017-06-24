package BuilderFluent;

public class BuilderDemo {
	
	public static void main(String[] args) {
		NutritionFacts CocaCola = new NutritionFacts.Builder(240, 8)
							.calories(100)
							.sodium(35)
							.carbohydrate(27)
							.build();
		
		System.out.println(CocaCola);
	}
}
