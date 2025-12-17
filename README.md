# Sorting Algorithms in Java

## Overview
This project contains a Java class that implements and demonstrates several **basic and intermediate sorting algorithms**.  
The goal is to understand how each algorithm works, compare their performance, and practice writing clean, readable Java code.

The implementations focus on **algorithmic fundamentals**, not Java’s built-in sorting utilities.

---

## Sorting Algorithms Implemented

### 1. Bubble Sort
- Repeatedly swaps adjacent elements if they are in the wrong order
- Simple to understand but inefficient for large datasets
- **Time Complexity:**  
  - Best: O(n)  
  - Average/Worst: O(n²)
- **Space Complexity:** O(1)

---

### 2. Selection Sort
- Repeatedly selects the minimum element and places it in the correct position
- Performs fewer swaps than Bubble Sort
- **Time Complexity:**  
  - Best/Average/Worst: O(n²)
- **Space Complexity:** O(1)

---

### 3. Insertion Sort
- Builds the sorted array one element at a time
- Efficient for small datasets or nearly sorted arrays
- **Time Complexity:**  
  - Best: O(n)  
  - Average/Worst: O(n²)
- **Space Complexity:** O(1)

---

### 4. Merge Sort
- Divide-and-conquer algorithm that recursively splits and merges arrays
- Stable and efficient for large datasets
- **Time Complexity:**  
  - Best/Average/Worst: O(n log n)
- **Space Complexity:** O(n)

---

### 5. Quick Sort
- Divide-and-conquer algorithm using a pivot to partition the array
- Very fast in practice and widely used
- Performance depends on pivot selection
- **Time Complexity:**  
  - Best/Average: O(n log n)  
  - Worst: O(n²)
- **Space Complexity:**  
  - Average: O(log n)  
  - Worst: O(n)

---

### 6. Heap Sort
- Uses a binary heap data structure to sort elements
- Guarantees O(n log n) performance
- Not stable but memory-efficient
- **Time Complexity:**  
  - Best/Average/Worst: O(n log n)
- **Space Complexity:** O(1)

---

