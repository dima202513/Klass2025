package KlassLedenevRoman._2025_01_30;

import KlassLedenevRoman._2025_01_30.exceptions.InvalidLengthException;
import KlassLedenevRoman._2025_01_30.exceptions.NoNumbersException;

public class Password {
    private String value;

    public Password(String value) {
        setValue(value);
    }

    private void setValue(String value) {
        if (!isContainsNumbers(value)) {
            throw new NoNumbersException("password have no numbers");
        }
        if (value.length() <= 3) {
            throw new InvalidLengthException("password size must have more than 3");
        }
        this.value = value;
    }

    private boolean isContainsNumbers(String value) {
        return false;
    }
}
