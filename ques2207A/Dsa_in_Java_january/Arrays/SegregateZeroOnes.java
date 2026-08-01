package Arrays;

public class SegregateZeroOnes {

   public static void segregate(int arr[]){
        int NoZeros = 0;
        int Ones = 0;
        
        // Count zeros and ones
        for(int ele: arr){
            if(ele == 0){
                NoZeros++;
            } else {
                Ones++;
            }
        }

        System.out.println("No of zeros: " + NoZeros);
        System.out.println("No of ones: " + Ones);

        // Segregate: 0s on left, 1s on right
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            // Move i forward if it points to 0
            if(arr[i] == 0){
                i++;
            }
            // Move j backward if it points to 1
            else if(arr[j] == 1){
                j--;
            }
            // Swap when i points to 1 and j points to 0
            else {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

        // Print result after segregation
        System.out.println("After arranging 0s and 1s according to the question our result be:");
        for(int elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 0, 0};
        segregate(arr);
    }
}
// ```

// ## Key Changes:

// 1. **Removed the outer for-loop** - Only the `while(i < j)` loop is needed
// 2. **Simplified the logic** - Used `if-else if-else` structure for cleaner flow
// 3. **Moved print statement outside** - Now prints once after segregation is complete
// 4. **Fixed array printing** - Loop through array to print each element
// 5. **Fixed class name spelling**

// ## Output:
// ```
// No of zeros: 4
// No of ones: 2
// After arranging 0s and 1s according to the question our result be:
// 0 0 0 0 1 1