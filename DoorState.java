/**
 * @author Justin Baraniuk
 * 
 * Interface for door states.
 */ 
public interface DoorState
{
   public void up();
   public void down();
   public void fullyOpen();
   public void fullyClosed();
   public String toString();
}
