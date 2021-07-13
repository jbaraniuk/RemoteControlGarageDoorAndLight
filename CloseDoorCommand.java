/**
 * @author Justin Baraniuk 
 * 
 * Command object to close door.
 */ 
public class CloseDoorCommand implements Command
{
    private Door door;

    public CloseDoorCommand(Door door) {       
        this.door = door;
    }

    /** 
     * Copy Constructor
     * @param original  The original CloseDoorCommand object to be copied
     */
    public CloseDoorCommand(CloseDoorCommand original) {
        this.door = original.door;
    }

    /**
     * The copy method calls the copy constructor and returns a copy of
     * the CloseDoorCommand object.
     * @return copy  the copy of the original CloseDoorCommand object
     */
    public CloseDoorCommand copy() {
        CloseDoorCommand copy = new CloseDoorCommand(this);
        return copy;
    }

    public void execute() {
        door.down();
    }

    public void undo() {
        door.up();
    }
}

