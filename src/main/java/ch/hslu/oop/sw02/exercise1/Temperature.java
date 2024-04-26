package ch.hslu.oop.sw02.exercise1;


/**
 * SW02 Temperature
 * KevinHaeusler
 * 2024 OOP
 */
public class Temperature {

    private float celsius;

    /**
     * Instantiates a new Temperature.
     *
     * @param initCelsius celsius temperature as parameter
     */
    public Temperature(float initCelsius) {
        this.celsius = initCelsius;
    }

    /**
     * Instantiates a new Temperature.
     */
    public Temperature() {
        this.celsius = 20.0f;
    }

    /**
     * Set celsius temperature.
     *
     * @param temperature the temperature
     */
    public void setCelsiusTemperature(final float temperature) {
        this.celsius = temperature;
    }

    /**
     * Change Celsius temperature relative.
     *
     * @param change the change
     */
    public void changeCelsiusTemperatureRelative(float change) {
        this.celsius += change;
    }

    /**
     * Get temperature kelvin float.
     *
     * @return the Celsius temperature converted to Kelvin float
     */
    public float getTemperatureKelvin() {
        return this.celsius + 273.15f;
    }

    /**
     * Get temperature fahrenheit float.
     *
     * @return the float
     */
    public float getTemperatureFahrenheit() {
        return this.celsius * 1.8f + 32.0f;
    }

    /**
     * Get temperature celsius float.
     *
     * @return the float
     */
    public float getTemperatureCelsius() {
        return this.celsius;
    }

    /**
     * Get element temperature celsius string.
     *
     * @param element the element
     * @return the string
     */
    public String getElementTemperatureCelsius(final String element) {
        return switch (element) {
            case "N", "Stickstoff" -> "Gas";
            case "Hg", "Quecksilber" -> "Flüssig";
            case "Pb", "Blei" -> "Fest";
            default -> "Ungültige Eingabe";
        };
    }


}
