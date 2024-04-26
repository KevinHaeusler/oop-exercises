package ch.hslu.oop.sw08.exercise1;

public class Demo {
    public static void main(String[] arg) {
        System.out.println("########## DEMO PERSON ##########");
        Person person1 = new Person(1, "Kevin", "Haeusler");
        Person person2 = new Person(2, "Kevin", "Haeusler");
        Person person3 = new Person(1, "Kevin", "Haeusler");
        Person person4 = new Person(1, "Levin", "Haeusler");
        System.out.println(person1);
        System.out.println("********************************");
        System.out.println("person1 equals person1: " + person1.equals(person1)); // True, comparing same object
        System.out.println("person1 equals person2: " + person1.equals(person2)); // False, different persons
        System.out.println("person1 equals person3: " + person1.equals(person3)); // True, comparing same object
        System.out.println("********************************");
        System.out.println("Hashcode person1: " + person1.hashCode());
        System.out.println("Hashcode person2: " + person2.hashCode());
        System.out.println("Hashcode person3: " + person3.hashCode());
        System.out.println("********************************");
        System.out.println("person1 compareTo person1: " + person1.compareTo(person1));
        System.out.println("person1 compareTo person2: " + person1.compareTo(person2));
        System.out.println("person1 compareTo person3: " + person1.compareTo(person3));
        System.out.println("person1 compareTo person4: " + person1.compareTo(person4));

        System.out.println(System.lineSeparator());
        System.out.println("########## DEMO Temperature ##########");
        Temperature temp1 = new Temperature(25.0f); // 25°C
        Temperature temp2 = new Temperature(Temperature.fahrenheitToCelsius(77.0f)); // 77°F to °C
        Temperature temp3 = new Temperature(Temperature.kelvinToCelsius(298.15f)); // 298.15 K to °C

        System.out.println("********************************");
        System.out.println("Temperature in Celsius: " + temp1.getTemperatureInCelsius() + "°C");
        System.out.println("Temperature in Fahrenheit: " + temp1.getTemperatureInFahrenheit() + "°F");
        System.out.println("Temperature in Kelvin: " + temp1.getTemperatureInKelvin() + "K");

        System.out.println("********************************");
        System.out.println("temp1 equals temp1: " + temp1.equals(temp1)); // True
        System.out.println("temp1 equals temp2: " + temp1.equals(temp2)); // Maybe false, depends on precision and exact conversion
        System.out.println("temp1 equals temp3: " + temp1.equals(temp3)); // Maybe false, depends on precision and exact conversion
        System.out.println("********************************");
        System.out.println("Hashcode temp1: " + temp1.hashCode());
        System.out.println("Hashcode temp2: " + temp2.hashCode());
        System.out.println("Hashcode temp3: " + temp3.hashCode());

        System.out.println("********************************");
        System.out.println("Current Temperature 1 in Celsius: " + temp1.getTemperatureInCelsius() + "°C");
        System.out.println("State of Blei: " + temp1.getStateFromElementByCurrentTemperature("Blei"));
        temp1.changeTemperatureWithCelsius(350.0f);
        System.out.println("New Temperature 1 in Celsius after change: " + temp1.getTemperatureInCelsius() + "°C");
        System.out.println("State of Blei: " + temp1.getStateFromElementByCurrentTemperature("Blei"));
        temp1.changeTemperatureWithCelsius(1500.0f);
        System.out.println("New Temperature 1 in Celsius after change: " + temp1.getTemperatureInCelsius() + "°C");
        System.out.println("State of Blei: " + temp1.getStateFromElementByCurrentTemperature("Blei"));


        System.out.println(System.lineSeparator());
        System.out.println("########## DEMO Element ##########");
        Element[] elements = Element.getElements();
        for (Element element : elements) {
            System.out.println(element);
        }
        System.out.println("********************************");
        System.out.println(elements[0].equals(elements[0])); // True, comparing same object
        System.out.println(elements[0].equals(elements[1])); // False, different elements
        System.out.println(elements[0].equals(elements[0])); // True, same properties as elements[0] is nitrogen
        System.out.println("********************************");
        System.out.println(elements[0].hashCode());
        System.out.println(elements[1].hashCode());
        System.out.println(elements[0].hashCode()); // Should be same as the first hashCode of elements[0]
        System.out.println("********************************");
        System.out.println("State of " + elements[1].getName() + " at 20°C: " + elements[1].getState(20));
        System.out.println("State of " + elements[2].getName() + " at 500°C: " + elements[2].getState(500));

    }
}
