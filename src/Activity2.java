/**
 * Activity2 — the name half of the project.
 *
 * Same shape as Activity1 and deliberately so: `extends NameManager` for the
 * six abstract methods, `implements PrintPretty` for the seventh. What changes
 * is the type you are sorting — an `ArrayList<String>` rather than an `int[]`
 * — which means `<` stops working and `compareTo` takes over. That comparison
 * is the whole difference between this activity and the last one.
 *
 * `names` comes from NameManager and starts as null, so buildList() creates it.
 */
public class Activity2 extends NameManager implements PrintPretty {

    /** Adds names to the list until a blank line is submitted. */
    @Override
    void buildList() {
        // TODO: create names, then read lines until a blank one arrives.
    }

    /** Uses the selection shuffle algorithm. */
    @Override
    void shuffle() {
        // TODO
    }

    /** Sorts names alphabetically using insertion sort. */
    @Override
    void insertionSort() {
        // TODO
    }

    /** Sorts names alphabetically using selection sort. */
    @Override
    void selectionSort() {
        // TODO
    }

    /** Sorts names alphabetically using merge sort. */
    @Override
    void mergeSort() {
        // TODO
    }

    /**
     * Returns a random name from names.
     *
     * Returning null is a placeholder, not an answer — it is here so the file
     * compiles before you have written the method.
     */
    @Override
    String pickRandom() {
        // TODO
        return null;
    }

    /** Displays names in a readable, well-formatted way. The format is yours. */
    @Override
    public void printPretty() {
        // TODO
    }

    public static void main(String[] args) {
        Activity2 activity = new Activity2();
        activity.buildList();
        activity.printPretty();
    }
}
