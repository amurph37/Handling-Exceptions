public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        // Do nothing, always on
    }

    @Override
    public void setOff() {
        // Do nothing, always on
    }

    @Override
    public int read() {
        return this.value;
    }
}
