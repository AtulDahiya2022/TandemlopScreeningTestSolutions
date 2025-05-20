import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class program3 {
    
    public static Map<Integer, Integer> countMultiples(int[] numbers) {
       
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }
        
       
        if (numbers == null || numbers.length == 0) {
            return result;
        }
        
        
        for (int num : numbers) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (num % divisor == 0) {
                    result.put(divisor, result.get(divisor) + 1);
                }
            }
        }
        
        return result;
    }
    
    
    public static void main(String[] args) {
        
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Result: " + countMultiples(input));
    }
}