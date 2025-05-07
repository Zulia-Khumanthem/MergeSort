# MergeSort
<h1>📊 Merge Sort - Java Implementation</h1>

<p>
  This class provides a static implementation of the Merge Sort algorithm, which follows a divide-and-conquer strategy to sort an integer array in ascending order.
</p>

<h2>📘 Features</h2>
<ul>
  <li>Efficiently sorts arrays with <strong>O(n log n)</strong> time complexity.</li>
  <li>Divides the array recursively into halves and merges them in sorted order.</li>
  <li>Includes a helper method to print arrays.</li>
</ul>

<h2>🧠 Class Overview</h2>

<pre>
<code>
public class Merge_Sort {
    public static void sort(int[] array)
    public static void mergeSort(int[] array, int left, int right)
    public static void merge(int[] array, int left, int mid, int right)
    public static void printArray(int[] array)
}
</code>
</pre>

<h2>📗 Method Descriptions</h2>

<h3><code>void sort(int[] array)</code></h3>
<p>Public entry method to sort the array using merge sort.</p>
<ul>
  <li><strong>Time Complexity:</strong> O(n log n)</li>
  <li><strong>Space Complexity:</strong> O(n) — due to temporary arrays</li>
</ul>

<h3><code>void mergeSort(int[] array, int left, int right)</code></h3>
<p>Recursive method that divides the array into halves, then sorts and merges them.</p>
<ul>
  <li><strong>Time Complexity:</strong> O(n log n)</li>
  <li><strong>Space Complexity:</strong> O(n)</li>
</ul>

<h3><code>void merge(int[] array, int left, int mid, int right)</code></h3>
<p>Combines two sorted subarrays back into the main array.</p>
<ul>
  <li><strong>Time Complexity:</strong> O(n) — where n = right - left + 1</li>
  <li><strong>Space Complexity:</strong> O(n) — uses two temporary arrays</li>
</ul>

<h3><code>void printArray(int[] array)</code></h3>
<p>Prints all the elements of the array in a single line.</p>
<ul>
  <li><strong>Time Complexity:</strong> O(n)</li>
</ul>

<h2>🧪 Example Usage</h2>

<pre>
<code>
int[] arr = {5, 2, 4, 6, 1, 3};
Merge_Sort.sort(arr);
Merge_Sort.printArray(arr);  // Output: 1 2 3 4 5 6
</code>
</pre>

