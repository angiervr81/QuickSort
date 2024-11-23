import java.util.Arrays;

class QuickSort{
    public static void quickSort( int[] array, int p, int r){
        if (p<r){
           int index = partition(array, p,r);

           quickSort(array, p, index-1);
           quickSort(array, index +1 , r);
        }
    }   

    public static int partition(int[]array, int p, int r){
        int pivot = array[r];

        int i= (p-1);

        for (int j= p; j < r; j++){
            if(array[j]<= pivot){
                i++;

                int swap = array[i];
                array[i]= array[j];
                array[j]= swap;
            }
        }

        int swap = array[i+1];
        array[i+1] = array[r];
        array[r] =swap;

        return i+1; 
    }

    public static void main(String[] args){
        int [] array = {5,6,7,2,1,4};
        quickSort(array, 0,array.length- 1);
        System.out.println ("Sorted array: "+Arrays.toString(array));
    }
}