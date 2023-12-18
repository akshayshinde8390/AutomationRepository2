package assignment;
public class SingleDimensionalArrayExample
{
    public static void main(String[] args) 
    {
        // Declare and initialize a single-dimensional array
        int[] numbers = {1, 2, 3, 4, 5};

        // Display the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}