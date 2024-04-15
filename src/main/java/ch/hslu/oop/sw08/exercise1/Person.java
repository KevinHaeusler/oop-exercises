package ch.hslu.oop.sw08.exercise1;

import java.util.Objects;

/**
 * The type Person.
 */
public final class Person implements Comparable<Person> {

    final private long ID;
    private String LastName;
    private String FirstName;

    /**
     * Instantiates a new Person.
     *
     * @param id        the id
     * @param firstname the firstname
     * @param lastname  the lastname
     */
    public Person(long id, String firstname, String lastname) {
        if (firstname == null) {
            throw new NullPointerException("First name cannot be null");
        }
        if (lastname == null) {
            throw new NullPointerException("Last name cannot be null");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive and non-zero");
        }
        this.ID = id;
        this.FirstName = firstname;
        this.LastName = lastname;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public final long getId() {
        return ID;
    }

    /**
     * Gets firstname.
     *
     * @return the firstname
     */
    public final String getFirstname() {
        return FirstName;
    }

    /**
     * Sets firstname.
     *
     * @param firstname the firstname
     */
    public final void setFirstname(final String firstname) {
        this.FirstName = firstname;
    }

    /**
     * Gets lastname.
     *
     * @return the lastname
     */
    public final String getLastname() {
        return LastName;
    }

    /**
     * Sets lastname.
     *
     * @param lastname the lastname
     */
    public final void setLastname(final String lastname) {
        this.LastName = lastname;
    }

    @Override
    public String toString() {
        return "Class: " + Person.class.getName() + "\nID: " + ID + "\nFirst Name: " + FirstName + "\nLast Name: " + LastName;
    }

    @Override
    public final boolean equals(final Object other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Person otherPerson)) {
            return false;
        } else {
            return otherPerson.ID == this.ID &&
                    Objects.equals(otherPerson.LastName, this.LastName) &&
                    Objects.equals(otherPerson.FirstName, this.FirstName);
        }
    }


    @Override
    public final int hashCode() {
        return Objects.hash(this.ID, this.FirstName, this.LastName);
    }


    @Override
    public int compareTo(Person other) {
        if (other == this) {
            return 0;
        }
        int idCompare = Long.compare(this.ID, other.ID);
        if (idCompare != 0) {
            return idCompare;
        }
        PersonNameComparator nameComparator = new PersonNameComparator();
        return nameComparator.compare(this, other);

    }
}
