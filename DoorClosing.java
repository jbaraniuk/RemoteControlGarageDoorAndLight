/**
 * @author Justin Baraniuk
 * 
 * Closing state for Door object.
 */ 
public class DoorClosing implements DoorState
{
    private Door door;

    public DoorClosing(Door door) {
        this.door = door;
    }

    public void up() { 
        door.setState(door.getDoorPaused());
    }

    public void down() { }

    public void fullyOpen() { }

    public void fullyClosed() { 
        door.setState(door.getDoorClosed());
    }

    public String toString() {
        return "door is closing";
    }
}
