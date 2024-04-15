package ch.hslu.oop.sw08.exercise1;

import java.util.Objects;

/**
 * The type Temperature.
 */
public class Temperature {
    private float temperatureInCelsius;

    /**
     * Instantiates a new Temperature.
     */
    public Temperature() {
        this.temperatureInCelsius = 0;
    }

    /**
     * Instantiates a new Temperature.
     *
     * @param temperatureInCelsius the temperature in Celsius
     */
    public Temperature(float temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    /**
     * Celsius to kelvin float.
     *
     * @param temperatureInCelsius the temperature in Celsius
     * @return the float
     */
    public static float celsiusToKelvin(float temperatureInCelsius) {
        return temperatureInCelsius + 273.15f;
    }

    /**
     * Kelvin to celsius float.
     *
     * @param temperatureInKelvin the temperature in kelvin
     * @return the float
     */
    public static float kelvinToCelsius(float temperatureInKelvin) {
        return temperatureInKelvin - 273.15f;
    }

    /**
     * Celsius to fahrenheit float.
     *
     * @param temperatureInCelsius the temperature in Celsius
     * @return the float
     */
    public static float celsiusToFahrenheit(float temperatureInCelsius) {
        return temperatureInCelsius * 1.8f + 32f;
    }

    /**
     * Fahrenheit to celsius float.
     *
     * @param temperatureInFahrenheit the temperature in Fahrenheit
     * @return the float
     */
    public static float fahrenheitToCelsius(float temperatureInFahrenheit) {
        return (temperatureInFahrenheit - 32f) / 1.8f;
    }

    /**
     * Kelvin to fahrenheit float.
     *
     * @param temperatureInKelvin the temperature in kelvin
     * @return the float
     */
    public static float kelvinToFahrenheit(float temperatureInKelvin) {
        return temperatureInKelvin * 1.8f - 459.67f;
    }

    /**
     * Fahrenheit to kelvin float.
     *
     * @param temperatureInFahrenheit the temperature in Fahrenheit
     * @return the float
     */
    public static float fahrenheitToKelvin(float temperatureInFahrenheit) {
        return (temperatureInFahrenheit + 459.67f) / 1.8f;
    }

    /**
     * Gets temperature in Celsius
     *
     * @return the temperature in Celsius
     */
    public float getTemperatureInCelsius() {

        return this.temperatureInCelsius;
    }

    /**
     * Sets temperature with Celsius
     *
     * @param newTemperatureInCelsius the new temperature in Celsius
     */
    public void setTemperatureWithCelsius(float newTemperatureInCelsius) {
        this.temperatureInCelsius = newTemperatureInCelsius;
    }

    /**
     * Change temperature with Celsius
     *
     * @param temperatureChangeInCelsius the temperature change in Celsius
     */
    public void changeTemperatureWithCelsius(float temperatureChangeInCelsius) {
        this.temperatureInCelsius += temperatureChangeInCelsius;
    }

    /**
     * Gets temperature in kelvin.
     *
     * @return the temperature in kelvin
     */
    public float getTemperatureInKelvin() {
        return celsiusToKelvin(this.temperatureInCelsius);
    }

    /**
     * Sets temperature with kelvin.
     *
     * @param newTemperatureInKelvin the new temperature in kelvin
     */
    public void setTemperatureWithKelvin(float newTemperatureInKelvin) {
        this.temperatureInCelsius = kelvinToCelsius(newTemperatureInKelvin);
    }

    /**
     * Change temperature with kelvin.
     *
     * @param temperatureChangeInKelvin the temperature change in kelvin
     */
    public void changeTemperatureWithKelvin(float temperatureChangeInKelvin) {
        float newTemperatureInKelvin = this.getTemperatureInKelvin() + temperatureChangeInKelvin;
        this.setTemperatureWithKelvin(newTemperatureInKelvin);
    }

    /**
     * Gets temperature in Fahrenheit
     *
     * @return the temperature in Fahrenheit
     */
    public float getTemperatureInFahrenheit() {
        return celsiusToFahrenheit(this.temperatureInCelsius);
    }

    /**
     * Sets temperature with fahrenheit
     *
     * @param newTemperatureInFahrenheit the new temperature in Fahrenheit
     */
    public void setTemperatureWithFahrenheit(float newTemperatureInFahrenheit) {
        this.temperatureInCelsius = fahrenheitToCelsius(newTemperatureInFahrenheit);
    }

    /**
     * Change temperature with Fahrenheit
     *
     * @param temperatureChangeInFahrenheit the temperature change in Fahrenheit
     */
    public void changeTemperatureWithFahrenheit(float temperatureChangeInFahrenheit) {
        float newTemperatureInFahrenheit = this.getTemperatureInFahrenheit() + temperatureChangeInFahrenheit;
        this.setTemperatureWithFahrenheit(newTemperatureInFahrenheit);
    }

    @Override
    public String toString() {
        return "Class: " + Temperature.class.getName() + "\nTemperature in °C: " + this.getTemperatureInCelsius();
    }

    @Override
    public boolean equals(final Object other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Temperature)) {
            return false;
        } else {
            Temperature otherTemperature = (Temperature) other;
            return otherTemperature.temperatureInCelsius == this.temperatureInCelsius;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.temperatureInCelsius);
    }

    /**
     * Gets state from element by current temperature.
     *
     * @param elementName the element name
     * @return the state from element by current temperature
     */
    public String getStateFromElementByCurrentTemperature(String elementName) {
        for (Element element : Element.getElements()) {
            if (Objects.equals(element.getName(), elementName) || Objects.equals(element.getScientificSymbol(), elementName)) {
                return element.getState(this.temperatureInCelsius);
            }
        }
        return null;
    }
}