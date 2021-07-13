/**
 * @author Justin Baraniuk
 * 
 * Remote for Door and Light commands.
 */ 
import java.util.Stack;

public class RemoteControl
{  
    private Door door;  
    private Light light;
    
    private OpenDoorCommand openDoor;
    private CloseDoorCommand closeDoor;
    
    private LightSwitchCommand lightSwitch;
    
    private Stack<Command> undoStack;
    private Stack<Command> redoStack;

    public RemoteControl(Door door, Light light) {
        this.door = door;
        this.light = light;
        
        //instantiate door command objects 
        openDoor = new OpenDoorCommand(door);
        closeDoor = new CloseDoorCommand(door);
        
        //instantiate light command object
        lightSwitch = new LightSwitchCommand(light);
        
        //instantiate stacks for remote undo and redo functions
        undoStack = new Stack();
        redoStack = new Stack();
    }

    public void upPushed() {
        Command c = openDoor.copy();
        c.execute();
        undoStack.push(c);
    }

    public void downPushed() {
        Command c = closeDoor.copy();
        c.execute();
        undoStack.push(c);
    }

    public void lightButtonPushed() {
        Command c = lightSwitch.copy();
        c.execute();
        undoStack.push(c);
    }

    public void undo() {
        if(undoStack.empty() == false) {
            Command c = undoStack.pop();
            c.undo();
            redoStack.push(c);
        }
    }

    public void redo() {
        if(redoStack.empty() == false) {
            Command c = redoStack.pop();
            c.execute();
            undoStack.push(c);
        }
    }

}
