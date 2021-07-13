/**
 * @author Justin Baraniuk
 * 
 * LightOff state for Light object.
 */ 
public class LightOff implements LightState
{
    private Light light;
    
    public LightOff(Light light)
    {
        this.light = light;
    }
    
    public void switchState() {
        light.setState(light.getLightOn());
    }

    public String toString() {
        return "light is off";
    }
}
