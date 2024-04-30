package ch.hslu.oop.sw08.exercise1;

abstract class Element {
    /*
     * Name of the element.
     */
    protected final String name;
    /*
     * Scientifc Symbol of the element.
     */
    protected final String scientificSymbol;
    /*
     * Unique Atomic Number of the element.
     */
    protected final int atomicNumber;
    /*
     * Temperature when element transitions from solid to liquid.
     */
    protected final float meltingPointInKelvin;
    /*
     * Temperature when element transitions from liquid to gas.
     */
    protected final float boilingPointInKelvin;

    protected Element(String name, String scientificSymbol, int atomicNumber, float meltingPointInKelvin,
            float boilingPointInKelvin) {
        this.name = name;
        this.scientificSymbol = scientificSymbol;
        this.atomicNumber = atomicNumber;
        this.meltingPointInKelvin = meltingPointInKelvin;
        this.boilingPointInKelvin = boilingPointInKelvin;
    }

    public String getScientificSymbol() {
        return scientificSymbol;
    }

    public String getName() {
        return name;
    }

    public float getMeltingPointInKelvin() {
        return meltingPointInKelvin;
    }

    public float getBoilingPointInKelvin() {
        return boilingPointInKelvin;
    }

    public String getAggregateState(float temperatureInKelvin) {
        if (temperatureInKelvin < meltingPointInKelvin) {
            return "solid";
        } else if (temperatureInKelvin > meltingPointInKelvin && temperatureInKelvin < boilingPointInKelvin) {
            return "liquid";
        }
        return "gaseous";
    }

    @Override
    public String toString() {
        return "Class: " + Element.class.getName() +
                "\n| Name: " + this.name +
                "\n| Scientific Symbol: " + this.scientificSymbol +
                "\n| Atomic Number: " + this.atomicNumber +
                "\n| Melting point: " + this.meltingPointInKelvin + " K" +
                "\n| Boiling point: " + this.boilingPointInKelvin + " K";
    }
}
