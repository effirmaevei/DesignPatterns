package ThreeLvlBuilder.bed;

public class BedDirector {

	public void setBuilder(BedBuilder bedBuilder) {
		this.bedBuilder = bedBuilder; 
	}
	
	private BedBuilder bedBuilder;
	
	public Bed getBed() {
		return bedBuilder.getBed();
	}
	
	
	
}
