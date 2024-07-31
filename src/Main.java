public class Main {
    public static void main(String[] args) {
        StandardSensor standardSensor = new StandardSensor(10);
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        AverageSensor averageSensor = new AverageSensor();
        averageSensor.addSensor(standardSensor);
        averageSensor.addSensor(temperatureSensor);

        temperatureSensor.setOn();
        averageSensor.setOn();

        System.out.println("Standard Sensor Reading: " + standardSensor.read());
        System.out.println("Temperature Sensor Reading: " + temperatureSensor.read());
        System.out.println("Average Sensor Reading: " + averageSensor.read());

        System.out.println("All Readings: " + averageSensor.readings());
    }
}
