package ThreeLvlBuilder;
import ThreeLvlBuilder.bed.BLuxuryBed;
import ThreeLvlBuilder.bed.BedBuilder;
import ThreeLvlBuilder.bed.BedDirector;
import ThreeLvlBuilder.furniture.BLuxuryFurniture;
import ThreeLvlBuilder.furniture.FurnitureBuilder;
import ThreeLvlBuilder.furniture.FurnitureDirector;

public class DemoBuilderDepth3 {
	public static void main(String[] args) {
		
		//Instantiate the director (hire the engineer, manager)
		RoomDirector topLvlDirector = new RoomDirector();
		FurnitureDirector furnDirector = new FurnitureDirector();
		BedDirector bedDirector = new BedDirector();
		 			
		// instantiate each concrete builder (take orders).  
		RoomBuilder roomBuilder = new BLuxuryRoom(furnDirector, args[1], args[2]);			
		FurnitureBuilder furnBuilder = new BLuxuryFurniture(bedDirector, args[1], args[2]);
		BedBuilder bedBuilder = new BLuxuryBed(args[1], args[2]);
		
		topLvlDirector.setBuilder(roomBuilder);
		furnDirector.setBuilder(furnBuilder);
		bedDirector.setBuilder(bedBuilder);
		
		topLvlDirector.constructRoom();
		
		Room luxuryRoom = topLvlDirector.getRoom();   //Holds a room
		
		//display them
		System.out.println("\nLuxury Room finished. See details\n: " + luxuryRoom);			
		
		
	}
}
