/**
 * @author Justin Baraniuk
 * 
 * Opening/closing paused state for Door object.
 */ 
public class DoorPaused implements DoorState
{
    Door door;

    public DoorPaused(Door door) {
        this.door = door;
    }

    public void up() { 
        door.setState(door.getDoorOpening());
    }

    public void down() { 
        door.setState(door.getDoorClosing());
    }

    public void fullyOpen() { }

    public void fullyClosed() { }

    public String toString() {
        return "door is paused";
    }
}
