package org.example;

public class InsertionSort {
    //Sorts the array using Insertion Sort.
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            insert(i, a);
        }
    }

    private void insert(int i, Comparable[] a) {
        //Inserts the 'Transition element' into its correct position in the sorted portion of the array.
        //TODO: TO BE IMPLEMENTED
        Comparable key = a[i];
      while(i>0&&a[i-1].compareTo(key)>0)
      {
          a[i]=a[i-1];
          i--;
      }
      a[i]=key;

    }

    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
