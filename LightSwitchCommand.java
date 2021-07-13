/**
 * @author Justin Baraniuk
 * 
 * LightSwitchCommand to turn on/off a Light object.
 */ 
public class LightSwitchCommand implements Command {
    private Light light;
    
    public LightSwitchCommand(Light light) {
        this.light = light;
    }

    /** 
     * Copy Constructor
     * @param original  The original LightOnCommand object to be copied
     */
    public LightSwitchCommand(LightSwitchCommand original) {
        this.light = original.light;
    }

     /**
     * The copy method calls the copy constructor and returns a copy of
     * the LightOnCommand object.
     * @return copy  the copy of the original LightOnCommand object
     */
    public LightSwitchCommand copy() {
        LightSwitchCommand copy = new LightSwitchCommand(this);
        return copy;
    }

    public void execute() {
        light.lightButtonPushed();
    }

    public void undo() {
        execute();
    }
}
