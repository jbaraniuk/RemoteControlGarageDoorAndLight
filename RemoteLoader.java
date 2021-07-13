/**
 * @author Justin Baraniuk
 * 
 * Demo class for a remote control for a door and light.
 */ 
public class RemoteLoader
{
    public static void main(String[] args) {
        Door door = new Door("my door");
        Light light = new Light("my light");
        RemoteControl rc = new RemoteControl(door, light);

        // arrange for the door to go through a cycle of states:
        // closed → opening → open → closing → closed

        rc.upPushed(); // up button on remote pushed
        door.fullyOpen(); // the sensors detect the door is fully open
        rc.downPushed(); // down button on remote pushed
        door.fullyClosed(); // the sensors detect the door is fully closed
        System.out.println(door); // the door’s state is displayed
        
	// arrange for the light to go through its states:
        // off → on→ off
        
        rc.lightButtonPushed(); // the light button is pushed
        rc.lightButtonPushed(); // the light button is pushed
        System.out.println(light); // the light’s state is displayed
        
        System.out.println("\n------------------------");
        System.out.println("undo's and redo's below");
        System.out.println("------------------------");
        
        rc.undo(); 
        System.out.println("first undo:");
        System.out.println(door + "\n" + light + "\n");
        
        rc.undo(); 
        System.out.println("second undo:");
        System.out.println(door + "\n" + light + "\n");
        
        rc.redo();
        System.out.println("first redo:");
        System.out.println(door + "\n" + light + "\n");
        
        rc.redo();
        System.out.println("second redo:");
        System.out.println(door + "\n" + light + "\n");
        
        rc.redo();
        System.out.println("third redo:");
        System.out.println(door + "\n" + light + "\n");   
    }
}
