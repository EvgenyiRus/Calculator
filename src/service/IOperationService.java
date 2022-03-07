package service;

public interface IOperationService extends IArithmeticOperations {
    double getResult();

    default int sum(int fistNumber, int secondNumber) {
        return fistNumber + secondNumber;
    }

    default int product(int fistNumber, int secondNumber) {
        return fistNumber * secondNumber;
    }

    default int difference(int fistNumber, int secondNumber) {
        return fistNumber - secondNumber;
    }

    default double divide(int fistNumber, int secondNumber) {
        return (double) fistNumber / secondNumber;
    }
}
