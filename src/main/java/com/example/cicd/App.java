package com.example.cicd;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(2, 3);
        logger.log(Level.INFO, "Sum(2,3) = {0}", sum);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int s1 = calc.sumUp(numbers);
        int s2 = calc.addAll(numbers);
        logger.log(Level.INFO, "sumUp={0}, addAll={1}", new Object[] { s1, s2 });

        logger.log(Level.INFO, "isPalindrome('Anna')? {0}", TextUtils.isPalindrome("Anna"));
        logger.log(Level.INFO, "safeParseInt('42'): {0}", TextUtils.safeParseInt("42"));
        logger.log(Level.INFO, "safeParseInt('x'): {0}", TextUtils.safeParseInt("x"));
    }
}
