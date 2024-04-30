package ch.hslu.oop.sw08.exercise1;

public class Mercury extends Element {
    public Mercury() {
        super("Mercury", "Hg", 80, 234.3210f, 629.88f);
    }

    @Override
    public String toString() {
        String description = super.toString();
        return description + "\n| Warning: Toxic";
    }
}
