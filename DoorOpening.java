/**
 * @author Justin Baraniuk
 * 
 * Opening state for Door object.
 */ 
public class DoorOpening implements DoorState
{
    private Door door;

    public DoorOpening(Door door) {
        this.door = door;
    }

    public void up() { }

    public void down() { 
        door.setState(door.getDoorPaused());
    }

    public void fullyOpen() {
        door.setState(door.getDoorOpen());
    }

    public void fullyClosed() { }

    public String toString() {
        return "door is opening";
    }
}
