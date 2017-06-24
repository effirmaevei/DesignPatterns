package BuilderFluent;
import javax.sql.rowset.serial.SerialArray;

/**
 * Note that NutritionsFacts is immutable and that all parameter
 * default values are in a single location. The builder's setter methods
 * return the builder itself so that invocation can be chained.
 * 
 * This variant of Builder pattern simulates optional parameters.
 * 
 * The builder pattern is a good choice when designing classes whose constructors
 * or static factories would have more than a handful of parameters.
 * 
 * @author Joshua Bloch
 *
 */
public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder{
		//Required parameters
		private final int servingSize;
		private final int servings;
		
		//Optional parameters - initialize to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;
		
		public Builder(int servingSize, int servings){
			this.servingSize = servingSize;
			this.servings = servings;						
		}
		
		public Builder calories(int val){
			calories = val; 			
			return this; 	
		}
		
		public Builder fat(int val){
			fat = val;
			return this;
		}
		
		public Builder carbohydrate(int val){
			carbohydrate = val; 
			return this;
		}
		
		public Builder sodium(int val){
			sodium = val;
			return this;
		}
		
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}

	public NutritionFacts(Builder builder){
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}
	
	//Not a part of builder pattern. For demo purposes.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNutrition Facts:		")
		  .append("\n-Servings: " + servings)
		  .append("\n-Serving Size: " + servingSize + "g")
		  .append("\n-Calories: " + calories)
		  .append("\n-Fat: " + fat)
		  .append("\n-Sodium: " + sodium)
		  .append("\n-Carbohydrate: " + carbohydrate);
		
		return sb.toString();
	}
	
}
