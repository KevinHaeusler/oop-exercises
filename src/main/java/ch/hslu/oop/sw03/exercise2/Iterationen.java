package ch.hslu.oop.sw03.exercise2;

/**
 * 
 */
public final class Iterationen {
    public Iterationen() {

    }

    /**
     * @param start
     * @param end
     */
    public static void printNumbersWhile(final int start, final int end) {
        int count = start;
        while (count <= end) {
            System.out.println(count);
            count++;

        }
    }

    /**
     * @param start
     * @param end
     */
    public static void printNumbersDoWhile(final int start, final int end) {
        int count = start;
        do {
            System.out.println(count);
            count++;
        } while (count <= end);

    }

    /**
     * @param start
     * @param end
     */
    public static void printNumbersFor(final int start, final int end) {

        for (int count = start; count <= 10; count++) {
            System.out.println(count);

        }
    }

    public static void printBox(final int width, final int height) {
        printBoxOuter(width);
        for (int count = 2; count < height; count++) {
            printBoxInner(width);
        }

        printBoxOuter(width);

    }

    public static void printBoxOuter(final int width) {
        for (int count = 0; count < width; count++) {
            System.out.print("#");
        }
        System.out.print("\n");
    }

    public static void printBoxInner(final int width) {
        System.out.print("#");
        for (int count = 2; count < width; count++) {
            System.out.print(" ");
        }
        System.out.print("#");
        System.out.print("\n");
    }

    public static void printSwissFlag(int flagWidth) {
        if (flagWidth < 5) {
            flagWidth = 5;
            System.out.print("Flag Width cant be below 5, printing 5 wide Flag");
        } else if (flagWidth < 10 && (flagWidth & 1) == 0) {
            flagWidth = 10;
            System.out.print("Even Flag Width cant be below 10, printing 10 wide Flag");
        } else if (flagWidth % 26 == 0) {

        }
        printBoxOuter(flagWidth);

        printBoxOuter(flagWidth);
    }

    public static void printSwissFlagInner(final int flagWidth) {
        // Checking if flagWidth is even or odd based on last bit (could also use
        // modulo)
        if ((flagWidth & 1) == 0) {
            // The official proportions are cursed at 6:7:6:7 which we cant print correctly
            // if it is not a multiple of 26

        }

    }
}
