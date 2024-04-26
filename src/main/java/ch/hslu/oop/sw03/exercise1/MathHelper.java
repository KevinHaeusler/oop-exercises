package ch.hslu.oop.sw03.exercise1;

public class MathHelper {

    static int max(final int a, final int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static int max2(final int a, final int b) {
        return a > b ? a : b;
    }

    static int max3(final int a, final int b) {
        return Math.max(a, b);
    }

    static int max(final int a, final int b, final int c) {
        if (a > b) {
            return max(a, c);
        }
        return max(b, c);
    }

    static int max2(final int a, final int b, final int c) {
        return max(a, max(b, c));
    }

    static int max3(final int a, final int b, final int c) {
        if (a > b) {
            return Math.max(a, c);
        }
        return Math.max(b, c);
    }

    @Override
    public String toString() {
        return "Class: " + MathHelper.class.getName();
    }
}
