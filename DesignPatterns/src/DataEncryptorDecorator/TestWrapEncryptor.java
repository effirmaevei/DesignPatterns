package DataEncryptorDecorator;
public class TestWrapEncryptor {
	public static void main(String[] args) {
		
		DataCrystal fire = new CrystalFR1O();
		DataCrystal ice = new  CrystalIO();
		
		System.out.println(fire.getDescription());
		System.out.println(ice.getDescription());
		
		DataCrystal iii = new ShiftDecorator(ice);
		DataCrystal fff = new ShiftDecorator(fire);
		
		
		System.out.println("\nEncoded descriptions by shifting...\n");
		System.out.println(iii.getDescription());
		System.out.println(fff.getDescription());
		
		DataCrystal iii2 = new ShiftDecorator(iii);
		DataCrystal fff2 = new ShiftDecorator(fff);
		
		System.out.println("\nWrapping the decorated object with a decorator, "
				+ "thus forcing twice the initial shift...\n");
		System.out.println(iii2.getDescription());
		System.out.println(fff2.getDescription());
		
		System.out.println("\nOriginal description can still "
				+ "be retrieved without decorations...");
		System.out.println(fire.getDescription());
		
		
		
		
		
		
	}
}
