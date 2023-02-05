package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String input) {
        if (input == null) {
            return false;
        }

        Pattern pattern = Pattern.compile("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
/*This method uses regular expressions to check if the input
string matches the pattern of a valid HTML color code, which is either
a 6-digit hexadecimal value or a 3-digit hexadecimal
value, and starts with the # symbol. If the input string matches
this pattern, the method returns true; otherwise, it returns false. */





