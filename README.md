# Sort

A Java project exploring sorting algorithms, shuffling, and object-oriented design through inheritance and interfaces.

---

## Project Structure

```
src/
  IntegerManager.java   – Abstract base class for integer lists
  NameManager.java      – Abstract base class for name lists
  PrintPretty.java      – Interface for formatted output
  Activity1.java        – Extends IntegerManager + implements PrintPretty
  Activity2.java        – Extends NameManager + implements PrintPretty
```

---

## Key Concepts

### Inheritance

`IntegerManager` and `NameManager` are **abstract classes** — they define *what* a class must be able to do, but leave the *how* up to you. When your concrete class `extends` one of them, it inherits the protected data field and is required to provide a real implementation for every `abstract` method.

```
IntegerManager          NameManager
      |                      |
  Activity1              Activity2
```

Because `Activity1` extends `IntegerManager`, it automatically has access to `nums`. It then fills in all the sorting, shuffling, and utility methods declared abstract in the parent.

The same relationship holds for `Activity2` and `NameManager` — it inherits `names` and must implement every abstract method.

### The `PrintPretty` Interface

`PrintPretty` is an **interface** — a contract that says: *"any class that implements me must provide a `printPretty()` method."*

Both `Activity1` and `Activity2` implement `PrintPretty` in addition to extending their respective abstract classes. This is how Java lets a class pick up behavior from multiple sources: one parent class via `extends`, plus any number of interfaces via `implements`.

```java
public class Activity1 extends IntegerManager implements PrintPretty { ... }
public class Activity2 extends NameManager    implements PrintPretty { ... }
```

`printPretty()` should display your list in a readable, well-formatted way — the exact format is up to you.

---

## What You Need to Implement

### Activity1 — Integer Sorting

| Method | Description |
|---|---|
| `buildList()` | Prompt the user to enter integers; stop on a sentinel value |
| `shuffle()` | Randomly rearrange the elements in `nums` |
| `insertionSort()` | Sort `nums` using the insertion sort algorithm |
| `selectionSort()` | Sort `nums` using the selection sort algorithm |
| `mergeSort()` | Sort `nums` using the merge sort algorithm |
| `pickRandom()` | Return a random element from `nums` |
| `printPretty()` | Display `nums` in a formatted, readable way |

### Activity2 — Name Sorting

| Method | Description |
|---|---|
| `buildList()` | Prompt the user to enter names; stop when a blank line is submitted |
| `shuffle()` | Randomly rearrange the elements in `names` |
| `insertionSort()` | Sort `names` alphabetically using insertion sort |
| `selectionSort()` | Sort `names` alphabetically using selection sort |
| `mergeSort()` | Sort `names` alphabetically using merge sort |
| `pickRandom()` | Return a random name from `names` |
| `printPretty()` | Display `names` in a formatted, readable way |

---

## How the Algorithms Work (Conceptually)

### Shuffling

The goal is to produce a random ordering of your list. Think about how you might visit each position in the list and swap it with another position chosen at random. Every element should have an equal chance of ending up anywhere.

### Insertion Sort

Imagine sorting a hand of playing cards. You pick up one card at a time and slide it left until it's in the right spot relative to the cards you've already sorted. The left portion of the list is always sorted; the right portion is still waiting to be processed.

### Selection Sort

Scan the entire unsorted portion of the list to find the smallest (or largest) element, then place it at the front of that portion. Repeat. Each pass "selects" the next element that belongs in its final position.

### Merge Sort

Divide the list in half, sort each half, then merge the two sorted halves back together. Merging two already-sorted lists is straightforward: repeatedly pick the smaller of the two front elements. The power comes from doing this recursively — keep splitting until each piece is a single element (which is trivially sorted), then merge your way back up.

---

## Getting Started

1. Open the folder in **VS Code**. `src/` holds the code; `bin/` is where the
   compiled classes land and is gitignored.
2. Run **`Activity1.java`** before changing anything. It should start, do
   nothing, and exit without an error — that is the starter working, and it is
   worth seeing once so you know the difference later.
3. Fill in the methods in `Activity1`, running after each one.
4. Do the same in `Activity2`.
5. Commit as you go, and **send your teacher the link to your repository** —
   pushing saves your work, the link is what hands it in.

Every method in both Activity files is already written out with an empty body.
That is on purpose: `Activity1 extends IntegerManager` means the file does not
compile until all six abstract methods exist, so they are there and empty
rather than missing. The empty bodies are the assignment.

Two of them return a placeholder — `pickRandom()` gives back `0` in `Activity1`
and `null` in `Activity2` — for the same reason. A method with a return type has
to return something to compile. Neither is an answer.

## When you are stuck

Do not describe it. Show it. Click **Live Share** along the bottom edge of VS
Code, in the status bar. It starts a session and copies a link. Paste that link
into Google Chat, send it to your teacher, and go back to work.

The link on its own is enough and you do not need a reply — it opens your file
in their editor, so they can put a cursor on your broken line while you are
still looking at it. Sending it is the same as putting your hand up, and it
saves them the walk across the room. You see who joins the moment they do, and
you can stop the session whenever you like.
