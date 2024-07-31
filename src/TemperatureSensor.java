import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean on;
    private Random random;

    public TemperatureSensor() {
        this.on = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void setOn() {
        this.on = true;
    }

    @Override
    public void setOff() {
        this.on = false;
    }

    @Override
    public int read() {
        if (!this.on) {
            throw new IllegalStateException("Sensor is off. Turn it on to read the value.");
        }
        return this.random.nextInt(61) - 30; // Random value between -30 and 30
    }
}
