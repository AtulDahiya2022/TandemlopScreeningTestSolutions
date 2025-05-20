class MyCalculator {
    double doCalculation(double firstNumber, double secondNumber, String operation) {
        
        operation = operation.toLowerCase();
        
        
        if (operation.equals("add")) {
            return firstNumber + secondNumber;
        } else if (operation.equals("subtract")) {
            return firstNumber - secondNumber;
        } else if (operation.equals("multiply")) {
            return firstNumber * secondNumber;
        } else if (operation.equals("divide")) {
            // Check for division by zero
            if (secondNumber == 0) {
                throw new IllegalArgumentException("Can’t divide by zero!");
            }
            return firstNumber / secondNumber;
        } else {
            
            throw new IllegalArgumentException("Sorry, that’s not a valid operation!");
        }
    }

    // Main method to test the calculator
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        try {
            
            System.out.println("7.5 + 2.5 = " + calc.doCalculation(7.5, 2.5, "add"));
            System.out.println("15.0 / 3.0 = " + calc.doCalculation(15.0, 3.0, "divide"));
            System.out.println("4.0 * 2.0 = " + calc.doCalculation(4.0, 2.0, "multiply"));
            System.out.println("10.0 - 3.0 = " + calc.doCalculation(10.0, 3.0, "subtract"));
            
            System.out.println("10.0 / 0.0 = " + calc.doCalculation(10.0, 0.0, "divide"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}