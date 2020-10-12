package Service;

public class OperationService implements IOperationService {
    private int fistNumber;
    private int secondNumber;
    private String operation;

    public OperationService(String[] numericExpression) {
        fistNumber = Integer.parseInt(numericExpression[0]);
        secondNumber = Integer.parseInt(numericExpression[2]);
        operation = numericExpression[1];
    }

    @Override
    public double getResult() {
        switch (operation) {
            case "+":
                return sum(fistNumber, secondNumber);
            case "-":
                return difference(fistNumber, secondNumber);
            case "*":
                return product(fistNumber, secondNumber);
            case "/":
                if (secondNumber == 0) throw new ArithmeticException("Error: Can't divide by 0");
                return divide(fistNumber, secondNumber);
            default:
                throw new ArithmeticException("Non-existent arithmetic operation");
        }
    }
}
