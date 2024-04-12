package ch.hslu.oop.sw07.exercise1;

public class Person {

    final private long ID;
    private String LastName;
    private String FirstName;

    public Person(long id, String firstname, String lastname) {
        this.ID = id;
        this.FirstName = firstname;
        this.LastName = lastname;
    }

    public final long getId() {
        return ID;
    }

    public final String getFirstname() {
        return FirstName;
    }

    public final void setFirstname(final String firstname) {
        this.FirstName = firstname;
    }

    public final String getLastname() {
        return LastName;
    }

    public final void setLastname(final String lastname) {
        this.LastName = lastname;
    }

    @Override
    public String toString() {
        return "Person [id=" + ID + ", firstname=" + FirstName + ", lastname=" + LastName + "]";
    }
}
