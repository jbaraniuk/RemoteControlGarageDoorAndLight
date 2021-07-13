/**
 * @author Justin Baraniuk 
 * 
 * Interface for command objects.
 */ 

public interface Command {
    public void execute();
    public void undo();
    public Command copy();
}