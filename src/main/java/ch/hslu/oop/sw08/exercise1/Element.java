package ch.hslu.oop.sw08.exercise1;

import java.util.Objects;

/**
 * The type Element.
 */
public class Element {
    private String name;

    private String scientificSymbol;

    // Schmelzpunkt in Celsius
    private float meltingPointInCelsius;

    // Siedepunkt in Celsius
    private float boilingPointInCelsius;

    /**
     * Instantiates a new Element.
     *
     * @param name                  the name of the element
     * @param scientificSymbol      the scientific Symbol of the element
     * @param meltingPointInCelsius the melting point in Celsius
     * @param boilingPointInCelsius the boiling point in Celsius
     */
    public Element(
            String name,
            String scientificSymbol,
            float meltingPointInCelsius,
            float boilingPointInCelsius) {
        this.name = name;
        this.scientificSymbol = scientificSymbol;
        this.meltingPointInCelsius = meltingPointInCelsius;
        this.boilingPointInCelsius = boilingPointInCelsius;
    }

    /**
     * Initiate all the elements and
     *
     * @return the elements [ ]
     */
    public static Element[] getElements() {
        Element nitrogen = new Element("Stickstoff", "N", -210.1f, -196f);
        Element mercury = new Element("Quecksilber", "Hg", -38.829f, 356.73f);
        Element lead = new Element("Blei", "Pb", 327.46f, 1749f);

        return new Element[]{
                nitrogen,
                mercury,
                lead
        };
    }

    /**
     * @return the name of the element
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the scientific Symbol of the element
     */
    public String getScientificSymbol() {
        return this.scientificSymbol;
    }

    /**
     * @return the melting point of the element in Celsius
     */
    public float getMeltingPointInCelsius() {
        return this.meltingPointInCelsius;
    }

    /**
     * @return the boiling point of the element in Celsius
     */
    public float getBoilingPointInCelsius() {
        return this.boilingPointInCelsius;
    }

    /**
     * Gets the state of the element.
     *
     * @param temperatureInCelsius the temperature in Celsius
     * @return the state
     */
    public String getState(float temperatureInCelsius) {
        if (temperatureInCelsius < this.meltingPointInCelsius) {
            return "fest";
        } else if (temperatureInCelsius < this.boilingPointInCelsius) {
            return "fluessig";
        } else {
            return "gasfoermig";
        }
    }

    @Override
    public String toString() {
        return "Class: " + Element.class.getName() +
                "\nName: " + this.name +
                "\nScientific Symbol: " + this.scientificSymbol +
                "\nMelting point: " + this.meltingPointInCelsius + "°C" +
                "\nBoiling point: " + this.boilingPointInCelsius + "°C";
    }

    @Override
    public boolean equals(final Object other) {
        if (other == this) {
            return true;
        }
        // also makes null check
        else if (!(other instanceof Element)) {
            return false;
        } else {
            Element otherElement = (Element) other;
            return otherElement.name.equals(this.name) &&
                    otherElement.scientificSymbol.equals(this.scientificSymbol) &&
                    otherElement.meltingPointInCelsius == this.meltingPointInCelsius &&
                    otherElement.boilingPointInCelsius == this.boilingPointInCelsius;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.scientificSymbol, this.meltingPointInCelsius, this.boilingPointInCelsius);
    }
}