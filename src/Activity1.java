/**
 * Activity1 — the integer half of the project.
 *
 * This class `extends IntegerManager`, so every abstract method that class
 * declares has to exist here for the file to compile, and it
 * `implements PrintPretty`, which adds one more. That is why all eight are
 * already written out below with empty bodies: without them this file does not
 * compile at all, and a starter that will not run is a starter you cannot
 * check your setup with.
 *
 * The bodies are the assignment. Each one says what it owes you; the README
 * says how each algorithm works. Run this file after every method you finish
 * rather than writing all eight and then looking for the bug in all eight.
 *
 * `nums` comes from IntegerManager and starts as null — buildList() is where
 * you create the array, which is why it is the first one to write.
 */
public class Activity1 extends IntegerManager implements PrintPretty {

    /** Adds integers to the list until a sentinel value is submitted. */
    @Override
    void buildList() {
        // TODO: create nums, then read integers until the sentinel arrives.
    }

    /** Uses the selection shuffle algorithm. */
    @Override
    void shuffle() {
        // TODO
    }

    /** Sorts nums using insertion sort. */
    @Override
    void insertionSort() {
        // TODO
    }

    /** Sorts nums using selection sort. */
    @Override
    void selectionSort() {
        // TODO
    }

    /** Sorts nums using merge sort. */
    @Override
    void mergeSort() {
        // TODO
    }

    /**
     * Returns a random integer from nums.
     *
     * Returning 0 is a placeholder, not an answer — it is here so the file
     * compiles before you have written the method.
     */
    @Override
    int pickRandom() {
        // TODO
        return 0;
    }

    /** Displays nums in a readable, well-formatted way. The format is yours. */
    @Override
    public void printPretty() {
        // TODO
    }

    public static void main(String[] args) {
        Activity1 activity = new Activity1();
        activity.buildList();
        activity.printPretty();
    }
}
