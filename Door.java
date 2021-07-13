/**
 * @author Justin Baraniuk
 * 
 * This is the door class.
 */ 
public class Door
{
    private String doorName;
    private DoorState doorState;

    // door state variables 
    private DoorClosed closed;
    private DoorClosing closing;
    private DoorOpen open;
    private DoorOpening opening;
    private DoorPaused paused;

    public Door(String doorName) {
        
        //instantiate door state objects (door states are linked to this door)
        closed = new DoorClosed(this);
        closing = new DoorClosing(this);
        open = new DoorOpen(this);
        opening = new DoorOpening(this);
        paused = new DoorPaused(this);

        this.doorName = doorName;
        
        //door state starts off as closed
        this.doorState = closed;
    }

    public void up() {
        doorState.up();
    }

    public void down() {
        doorState.down();
    }

    public void fullyOpen() {
        doorState.fullyOpen();
    }

    public void fullyClosed() {
        doorState.fullyClosed();
    }

    public void setState(DoorState doorState) {
        this.doorState = doorState;
    }

    public DoorState getState() {
        return doorState;
    }
    
    public DoorState getDoorClosed() {
        return closed;
    }
    
    public DoorState getDoorClosing() {
        return closing;
    }
    
     public DoorState getDoorOpen() {
        return open;
    }
    
    public DoorState getDoorOpening() {
        return opening;
    }
    
    public DoorState getDoorPaused() {
        return paused;
    }

    public String toString() {
        return doorState.toString();
    }
}
