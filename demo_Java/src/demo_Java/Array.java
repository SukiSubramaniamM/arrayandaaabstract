package demo_Java;

public class Array {
	public static void main(String[] args) {
		int start = 1;
        int end = 10;
        
        // Create arrays to store odd and even numbers
        int[] oddNumbers = new int[(end - start) / 2 + 1]; // Maximum possible size of the array
        int[] evenNumbers = new int[(end - start + 1) / 2]; // Maximum possible size of the array
        
        int oddIndex = 0;
        int evenIndex = 0;
        
        // Iterate over the range of numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                // Even number
                evenNumbers[evenIndex++] = i;
            } else {
                // Odd number
                oddNumbers[oddIndex++] = i;
            }
        }
        
        // Print odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        
        // Print even numbers
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
		
	



