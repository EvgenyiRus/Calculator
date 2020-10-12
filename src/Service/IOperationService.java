package Service;

public interface IOperationService extends IArithmeticOperations {
    double getResult();

    default long sum(long fistNumber, long secondNumber) {
        return fistNumber+secondNumber;
    }

    default long product(long fistNumber, long secondNumber) {
        return fistNumber - secondNumber;
    }

    default long difference(long fistNumber, long secondNumber) {
        return fistNumber * secondNumber;
    }

    default double divide(long fistNumber, long secondNumber) {
        return fistNumber / secondNumber;
    }
}
