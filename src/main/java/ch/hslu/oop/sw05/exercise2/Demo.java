package ch.hslu.oop.sw05.exercise2;

public class Demo {
    public static void main(String[] args) {
        Nitrogen nitrogen = new Nitrogen();
        Lead lead = new Lead();
        Mercury mercury = new Mercury();
        System.out.println(nitrogen);
        System.out.println(lead);
        System.out.println(mercury);

        Temperature temperature = new Temperature(5f);
        System.out.println("Temperature: " + temperature.getTemperatureInCelsius() + "State: "
                + mercury.getAggregateState(temperature.getTemperatureInKelvin()));
        temperature.setTemperatureInKelvin(300f);
        System.out.println("Temperature: " + temperature.getTemperatureInCelsius() + "State: "
                + mercury.getAggregateState(temperature.getTemperatureInKelvin()));
        temperature.changeTemperatureRelativeInKelvin(400f);
        System.out.println("Temperature: " + temperature.getTemperatureInCelsius() + "State: "
                + mercury.getAggregateState(temperature.getTemperatureInKelvin()));

    }
}
