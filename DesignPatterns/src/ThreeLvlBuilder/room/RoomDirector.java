package ThreeLvlBuilder.room;

public class RoomDirector {

	private RoomBuilder roomBuilder;
	public void setBuilder(RoomBuilder cb) {
		roomBuilder = cb;
	}
	
	public Room getRoom() {
		return roomBuilder.getRoom();
	}
	
	public void constructRoom() {
		roomBuilder.createNewProduct();
		roomBuilder.buildPart1();
		roomBuilder.buildPart2();
		roomBuilder.buildPart3();
		roomBuilder.buildPart4();
	}

}
