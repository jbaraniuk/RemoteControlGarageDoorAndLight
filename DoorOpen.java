/**
 * @author Justin Baraniuk 
 * 
 * Open state for Light object.
 */ 
public class DoorOpen implements DoorState
{
    private Door door;

    public DoorOpen(Door door) {
        this.door = door;
    }

    public void up() { }

    public void down() {
        door.setState(door.getDoorClosing());
    }

    public void fullyOpen() { }

    public void fullyClosed() { }

    public String toString() {
        return "door is open";
    }
}
