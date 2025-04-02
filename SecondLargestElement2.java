import java.util.Arrays;

class SecondLargestElement2 
    {
        public static int getSecondLargestElement(int[] arr)  
         {
            int n=arr.length;
            Arrays.sort(arr);
        
            for(int i=n-2; i>=0; i--) 
            {
                if(arr[i] != arr[n-1]) 
                {
                    return arr[i];
                }
            }
            return -1;
        }

    public static void main(String[] args) 
    {
    int[] arr={67,9,10,20,7,8,9};
    System.out.println(getSecondLargestElement(arr));   
    }
}