package DataEncryptorDecorator;

public class ShiftDecorator extends EncryptedDataCrystal {

	private final static int BEGIN = 96;
	private final static int END = 122;	
	private final static int SHIFT = 3;	
	
	public ShiftDecorator(DataCrystal dataCrystal) {
		super(dataCrystal);
	}
	
	@Override
	public String getDescription() {
		return shift( SHIFT , dataCrystal.getDescription());
	}
	
	private String shift(int shift, String base){
		
		StringBuilder sb = new StringBuilder();
		base = base.toLowerCase();
		
		for (int i = 0; i < base.length(); i++) {
			
			int chr = base.charAt(i);
			
			if(chr!=32 && chr!=46 && chr!=44 && chr>64){	//Only modify non-spaces chars
				int sum = chr + shift;
				
				if(sum==END){  
					sb.append((char)sum);
//					System.out.println(base.charAt(i) + " --- " + sum);
				}else{				
					int c = (sum>END) ? ( BEGIN + sum%END ): (sum%END);					
					sb.append((char)c);
//					System.out.println(base.charAt(i) + " --- " + c);
				}
								
			}else{
				sb.append((char)chr);
			}
			
			
		}
		
		String out = sb.toString(); 
		out = out.substring(0,1).toUpperCase() + out.substring(1).toLowerCase();
		
		return out;
		
	}

}
