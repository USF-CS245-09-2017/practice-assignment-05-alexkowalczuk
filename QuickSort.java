public class QuickSort implements SortingAlgorithm
{
 	public int partition(int [] a, int low, int high) 
    { 
        int pivot = a[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (a[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = a[i+1]; 
        a[i+1] = a[high]; 
        a[high] = temp; 
  
        return i+1; 
    } 
  
   public void sort(int [] a) {
   	    sort(a, 0, a.length-1);
   }
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    public void sort(int [] a, int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(a, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(a, low, pi-1); 
            sort(a, pi+1, high); 
        } 
    }
}