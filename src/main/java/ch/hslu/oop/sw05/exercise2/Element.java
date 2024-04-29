package ch.hslu.oop.sw05.exercise2;

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

    public float getmeltingPointInKelvin() {
        return meltingPointInKelvin;
    }

    public float getboilingPointInKelvin() {
        return boilingPointInKelvin;
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
