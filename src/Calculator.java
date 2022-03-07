import io.Data;
import io.IData;
import service.IOperationService;
import service.OperationService;
import util.RomanNumberUtil;

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
