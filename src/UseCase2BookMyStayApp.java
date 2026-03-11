
abstract class Room {

    protected String roomType;
    protected int beds;
    protected int size;
    protected double price;

    public Room(String roomType, int beds, int size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type : " + roomType);
        System.out.println("Beds      : " + beds);
        System.out.println("Size      : " + size + " sq ft");
        System.out.println("Price     : $" + price);
    }
}


class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 80);
    }
}


class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 120);
    }
}


class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 500, 250);
    }
}


public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("        BookMyStayApp v2.0          ");
        System.out.println("    Room Types & Availability       ");
        System.out.println("====================================");

        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("\n--- Single Room ---");
        single.displayRoomDetails();
        System.out.println("Available : " + singleRoomAvailable);

        System.out.println("\n--- Double Room ---");
        doubleRoom.displayRoomDetails();
        System.out.println("Available : " + doubleRoomAvailable);

        System.out.println("\n--- Suite Room ---");
        suite.displayRoomDetails();
        System.out.println("Available : " + suiteRoomAvailable);

        System.out.println("\nRoom initialization completed.");
    }
}