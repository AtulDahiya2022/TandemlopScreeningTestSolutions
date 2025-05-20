import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        System.out.print("How many odd numbers do you want? ");
        int countOfNumbers = inputReader.nextInt();
        
        
        for (int position = 1; position <= countOfNumbers; position++) {
           
            int currentOdd = 2 * position - 1;
            
            
            if (position < countOfNumbers) {
                System.out.print(currentOdd + ", ");
            } else {
                System.out.print(currentOdd);
            }
        }
        
       
        System.out.println();
        
        
        inputReader.close();
    }
}