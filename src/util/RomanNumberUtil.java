package util;

import resources.RomanNumber;
import java.util.List;

public class RomanNumberUtil {

    public static void getRomanNumberValue(String[] numericExpression) {
        numericExpression[0] = RomanNumber.valueOf(numericExpression[0]).getValue();
        numericExpression[2] = RomanNumber.valueOf(numericExpression[2]).getValue();
    }

    public static boolean isRomanNumber(String number) {
        for (RomanNumber p : RomanNumber.values()) {
            if (p.name().equals(number)) {
                return true;
            }
        }
        return false;
    }

    public static String arabicToRoman(int number) {
        List<RomanNumber> romanNumbers = RomanNumber.getReverseSortedValues();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while ((number > 0) && (i < romanNumbers.size())) {
            RomanNumber romanNumber = romanNumbers.get(i);
            int arabicNumber = Integer.parseInt(romanNumber.getValue());
            if (arabicNumber <= number) {
                sb.append(romanNumber.name());
                number -= arabicNumber;
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
