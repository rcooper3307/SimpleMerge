/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2)
    {
        int[] combinedArray = new int[arr1.length+arr2.length];
        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = arr1.length; j < (j + arr2.length); j++)
            {
                combinedArray[i] = arr1[i];
                combinedArray[j] = arr2[i];
            }
        }

        return combinedArray;
    }
    public static void insertionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j-1] > arr[j])
                {
                    swap(arr,j-1,j);
                }
                else
                {
                    j = 0;
                }
            }

        }
    }

    public static void swap(int[]arr, int x, int y)
    {
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
