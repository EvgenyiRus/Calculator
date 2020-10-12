import IO.Data;
import IO.IData;
import Service.IOperationService;
import Service.OperationService;
import Util.RomanNumberUtil;

import java.io.IOException;

public class Calculator {
    private static boolean isRomanOperation;

    public static void main(String[] args) throws IOException {
        IData data = new Data();
        String[] numericExpression = data.readData();
        if (RomanNumberUtil.isRomanNumber(numericExpression[0]) && RomanNumberUtil.isRomanNumber(numericExpression[2])) {
            isRomanOperation = true;
            RomanNumberUtil.getRomanNumberValue(numericExpression);
        }
        IOperationService operationService = new OperationService(numericExpression);
        double result = operationService.getResult();
        if (isRomanOperation) {
            data.printResult(RomanNumberUtil.arabicToRoman((int) result));
        } else {
            data.printResult(result);
        }
    }
}
