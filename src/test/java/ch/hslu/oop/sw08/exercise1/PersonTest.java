package ch.hslu.oop.sw08.exercise1;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    public Person person;

    @Test
    void testPersonGetId() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        assertEquals(1, person1.getId());
    }

    @Test
    void testPersonGetFirstname() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        assertEquals("Kevin", person1.getFirstname());
    }

    @Test
    void testPersonSetFirstname() {
    }

    @Test
    void testPersonGetLastname() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        assertEquals("Haeusler", person1.getLastname());

    }

    @Test
    void testPersonSetLastname() {
    }

    @Test
    void testPersonToString() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        assertEquals("""
                Class: ch.hslu.oop.sw08.exercise1.Person
                ID: 1
                First Name: Kevin
                Last Name: Haeusler""", person1.toString());
    }

    //.suppress(Warning.NONFINAL_FIELDS). it wanted FirstName/Lastname to be final
    @Test
    public void testEqualsVerifier() {
        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void testPersonEqualSameObject() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        assertEquals(person1, person1);
    }

    @Test
    void testPersonEqualNegative() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        Person person2 = new Person(2, "Kevin", "Haeusler");
        assertNotEquals(person1, person2);
    }

    @Test
    void testPersonEqualSameValues() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        Person person2 = new Person(1, "Kevin", "Haeusler");
        assertEquals(person1, person2);
    }

    @Test
    public void testPersonHashCode() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        Person person2 = new Person(1, "Kevin", "Haeusler");
        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    void testPersonCompareToSameIDAndName() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        Person person2 = new Person(1, "Kevin", "Haeusler");
        assertEquals(0, person1.compareTo(person2));
    }

    @Test
    void testPersonCompareToDifferentIDs() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        Person person2 = new Person(2, "Kevin", "Haeusler");
        assertTrue(person1.compareTo(person2) < 0);
        assertTrue(person2.compareTo(person1) > 0);
    }

    @Test
    void testPersonCompareToSameIDDifferentLastName() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        Person person2 = new Person(1, "Kevin", "nichtHaeusler");
        assertTrue(person1.compareTo(person2) < 0);
        assertTrue(person2.compareTo(person1) > 0);
    }

    @Test
    void testPersonCompareToSameIDAndLastNameDifferentFirstName() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        Person person2 = new Person(1, "Levin", "Haeusler");
        assertTrue(person1.compareTo(person2) < 0);
        assertTrue(person2.compareTo(person1) > 0);
    }

    @Test
    void testCompareTo_NullThrowsException() {
        Person person1 = new Person(1, "Kevin", "Haeusler");
        assertThrows(NullPointerException.class, () -> person1.compareTo(null));
    }
}