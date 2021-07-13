/**
 * @author Justin Baraniuk
 * 
 * Light object.
 */ 
public class Light
{
    private String lightName;
    private LightState lightState;
    
    private LightState lightOn;
    private LightState lightOff;

    public Light(String lightName)
    {
        this.lightName = lightName;
        this.lightState = new LightOff(this);
        
        lightOn = new LightOn(this);
        lightOff = new LightOff(this);
    }
    
    public void lightButtonPushed() {
        lightState.switchState();
    }

    public LightState getState() {
        return lightState;
    }

    public void setState(LightState lightState) {
        this.lightState = lightState;
    }
    
    public LightState getLightOn() {
        return lightOn;
    }
    
    public LightState getLightOff() {
        return lightOff;
    }

    public String toString() {
        return lightState.toString();
    }

}
