package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Data implements IData {
    private static final Pattern ARABIC_NUMBER_PATTERN =
            Pattern.compile("([1-9]|10)\\s[\\+,\\-,\\*,\\/]\\s([1-9]|10)");
    private static final Pattern ROMAN_NUMBER_PATTERN =
            Pattern.compile("(I{1,3}|IV|V|VI{1,3}|IX|X)\\s[\\+,\\-,\\*,\\/]\\s(I{1,3}|IV|V|VI{1,3}|IX|X)");


    @Override
    public void printResult(Object outputData) {
        System.out.println(outputData);
    }

    @Override
    public String[] readData() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputData = reader.readLine().trim();
            if (!checkInputData(inputData))
                throw new IOException("Incorrect data entry");
            return regexpInputData(inputData);
        }
    }

    private String[] regexpInputData(String inputData) {
        return inputData.split("\\s");
    }

    private boolean checkInputData(String inputData) {
        return inputData.matches(ARABIC_NUMBER_PATTERN.pattern()) || inputData.matches(ROMAN_NUMBER_PATTERN.pattern());
    }
}
