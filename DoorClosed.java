/**
 * @author Justin Baraniuk
 * 
 * Closed state for Door object.
 */ 
public class DoorClosed implements DoorState
{
    private Door door;

    public DoorClosed(Door door) {
        this.door = door;
    }

    public void up() {
        door.setState(door.getDoorOpening());
    }

    public void down() { }

    public void fullyOpen() { }

    public void fullyClosed() { }

    public String toString() {
        return "door is closed";
    }
}
