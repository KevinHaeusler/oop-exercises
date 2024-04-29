package ch.hslu.oop.sw05.exercise2;

public class Temperature {
    private float temperatureInKelvin;
    public static final float KELVIN_OFFSET = 273.15f;

    public Temperature(float temperatureInKelvin) {
        this.temperatureInKelvin = validateTemperatureInKelvin(temperatureInKelvin);

    }

    public Temperature() {
        this.temperatureInKelvin = 0f;
    }

    public float getTemperatureInKelvin() {
        return temperatureInKelvin;
    }

    public float getTemperatureInCelsius() {
        return convertKelvinToCelsius(this.temperatureInKelvin);
    }

    public void setTemperatureInKelvin(float temperatureInKelvin) {
        this.temperatureInKelvin = validateTemperatureInKelvin(temperatureInKelvin);
    }

    public void setTemperatureInCelsius(float temperatureInCelsius) {
        this.temperatureInKelvin = convertCelsiusToKelvin(temperatureInCelsius);
    }

    public void changeTemperatureRelativeInKelvin(float temperatureInKelvin) {
        this.temperatureInKelvin += validateTemperatureInKelvin(temperatureInKelvin);
    }

    public void changeTemperatureRelativeInCelsius(float temperatureInCelsius) {
        this.temperatureInKelvin += convertCelsiusToKelvin(temperatureInCelsius);
    }

    public static float convertKelvinToCelsius(float temperatureInKelvin) {
        return validateTemperatureInKelvin(temperatureInKelvin) - Temperature.KELVIN_OFFSET;
    }

    public static float convertCelsiusToKelvin(float temperatureInCelsius) {
        return validateTemperatureInCelsius(temperatureInCelsius) + Temperature.KELVIN_OFFSET;
    }

    private static float validateTemperatureInKelvin(float temperatureInKelvin) {
        if (temperatureInKelvin < 0) {
            throw new IllegalArgumentException("Temperature cannot be lower than 0 Kelvin");
        } else {
            return temperatureInKelvin;
        }
    }

    private static float validateTemperatureInCelsius(float temperatureInCelsius) {
        if (temperatureInCelsius < -KELVIN_OFFSET) {
            throw new IllegalArgumentException("Temperature cannot be lower than -273.15 Celsius.");
        } else {
            return temperatureInCelsius;
        }
    }

    @Override
    public String toString() {
        return "Class: " + Temperature.class.getName() +
                "\n| Temperature in Kelvin: " + this.getTemperatureInKelvin() + " K" +
                "\n| Temperature in Celsius: " + this.getTemperatureInCelsius() + " °C";
    }
}
