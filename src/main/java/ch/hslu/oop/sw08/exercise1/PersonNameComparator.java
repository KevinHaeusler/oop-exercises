package ch.hslu.oop.sw08.exercise1;

import java.util.Comparator;

/**
 * Compares lastname of person 1 with person 2, if equal compares firstname of person 1 with person 2
 */
public class PersonNameComparator implements Comparator<Person> {
    /**
     * @param person1 the first object to be compared.
     * @param person2 the second object to be compared.
     * @return the compare value (-1 if <, 0 if ==, 1 if >
     */
    @Override
    public int compare(Person person1, Person person2) {
        int compare = person1.getLastname().compareTo(person2.getLastname());
        if (compare == 0) {
            compare = person1.getFirstname().compareTo(person2.getFirstname());
        }
        return compare;
    }
}
