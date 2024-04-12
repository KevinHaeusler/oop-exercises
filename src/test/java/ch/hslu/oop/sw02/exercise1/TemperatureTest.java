package ch.hslu.oop.sw02.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
final class TemperatureTest {

    /**
     * Test of getTemperatureCelsius method, of class Temperature with default constructor.
     */
    @Test
    void getTemperatureCelsiusDefault() {
        assertEquals(20f, new Temperature().getTemperatureCelsius());
    }
    /**
     * Test of getTemperatureCelsius method, of class Temperature with parameter.
     */
    @Test
    void getTemperatureCelsius() {
        assertEquals(23.4f, new Temperature(23.4f).getTemperatureCelsius());
    }
}
