import java.util.Arrays;
/* Implement the quick sort algorithm for A = [5,6,7,2,1,4]. You can use Python, C++, or Java to implement the code. */

class QuickSort{    

    /* This method will call itself recursively*/
    public static void quickSort( int[] array, int p, int r){
        
        if (p<r){   // check if the current segment of the array has more than one element 

            
           int index = partition(array, p,r); // partition the array and get the index of the pivot
        
           
           quickSort(array, p, index-1);    // recursively sort the left subarray
           
           quickSort(array, index +1 , r);      // recursively sort the right subarray 
        }
    }   

    /*This method wil places elements smaller than the piovt on the left 
    and larger elements to the right of the piovt */
    public static int partition(int[]array, int p, int r){
        
         
        int pivot = array[r]; // chosing the last element as the piovt

        int i= (p-1); // index of the smaller element 

        for (int j= p; j < r; j++){     // going through the array form p to r-1 
            
            if(array[j]<= pivot){       // if the current element is <= to the pivot 
                i++;            //increment the index of the smaller element 

                // swap the current element with the element at index i
                int swap = array[i];       
                array[i]= array[j];
                array[j]= swap;
            }
        }
        

        // swap the piovt element with the element at index i+1
        int swap = array[i+1];
        array[i+1] = array[r];
        array[r] =swap;

        return i+1;     //return index of pivot after partitioning 
    }

    /* Main method to complete the QuickSort Alogritm */
    public static void main(String[] args){

        // askking to sort array[5,6,7,2,1,3]
        int [] array = {5,6,7,2,1,4};

        //call the quickSort method on the array 
        quickSort(array, 0,array.length- 1);

        // print the sorted array
        System.out.println ("Sorted array: " + Arrays.toString(array));
    }
}