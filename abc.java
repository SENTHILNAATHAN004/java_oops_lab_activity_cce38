
public class abc {
    public static int minOperationsToMakeDivisibleByThree(int[] arr) {
        int operations = 0;
        
        for (int num : arr) {
            int remainder = num % 3;
            
            // Determine the minimum operations for each element
            if (remainder == 1) {
                operations += 1; // Increment by 2 or decrement by 1
            } else if (remainder == 2) {
                operations += 1; // Increment by 1 or decrement by 2
            }
        }
        
        return operations;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7};
        System.out.println("Minimum operations to make all elements divisible by 3: "+ minOperationsToMakeDivisibleByThree(arr));
    }
}
