//Arrays-java-DSA-SecondLargestElement1-using Sorting(Naive Approach)

import java.util.Arrays;
class SecondLargestElement1 
{

    public static int getSecondLargest(int[] arr) {   //function to find second largest Element
        int n=arr.length;
    
    Arrays.sort(arr);                               //sort the array in non-decreasing order
    for(int i=n-2; i>=0; i--)                 // start from second last element as last element is the largest
    {
        if(arr[i] != arr[n-1]) {        // return the first element which is not equal to the largest element
            return arr[i];
        }
    }
    return -1;                      // If no second largest element was found, return -1
    }
public static void main(String[] args)
{
    int[] arr={12,45,67,89,90};
    System.out.println(getSecondLargest(arr));
    }
    
}
