public class MergeSort implements SortingAlgorithm
{
    public void merge(int [] a, int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        //Create temp arrays
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        //Copy data to temp arrays
        for (int i=0; i<n1; ++i) 
            L[i] = a[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = a[m + 1+ j]; 
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                a[k] = L[i]; 
                i++; 
            } 
            else
            { 
                a[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        //Copy remaining elements of L[] if any
        while (i < n1) 
        { 
            a[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        //Copy remaining elements of R[] if any
        while (j < n2) 
        { 
            a[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    public void sort(int [] a) {
   	    sort(a, 0, a.length-1);
    }
    public void sort(int [] a, int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(a, l, m); 
            sort(a , m+1, r); 
  
            // Merge the sorted halves 
            merge(a, l, m, r); 
        } 
    } 


}