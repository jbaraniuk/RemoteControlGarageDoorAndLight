/**
 * @author Justin Baraniuk
 * 
 * LightOn state for Light object.
 */ 
public class LightOn implements LightState
{
    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    public void switchState() {
        light.setState(light.getLightOff());
    }

    public String toString() {
        return "light is on";
    }

}
