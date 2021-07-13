/**
 * @author Justin Baraniuk
 * 
 * Command object to open door.
 */ 
public class OpenDoorCommand implements Command
{
    private Door door;

    public OpenDoorCommand(Door door) {
        this.door = door;
    }

    /** 
     * Copy Constructor
     * @param original  The original OpenDoorCommand object to be copied
     */
    public OpenDoorCommand(OpenDoorCommand original) {
        this.door = original.door;
    }

    /**
     * The copy method calls the copy constructor and returns a copy of
     * the OpenDoorCommand object.
     * @return copy  the copy of the original OpenDoorCommand object
     */
    public OpenDoorCommand copy() {
        OpenDoorCommand copy = new OpenDoorCommand(this);
        return copy;
    }

    public void execute() 
    {
        door.up();
    }

    public void undo() 
    {
        door.down();
    }
}

