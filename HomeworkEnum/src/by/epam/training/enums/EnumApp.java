package by.epam.training.enums;

import java.util.Optional;

public class EnumApp {
    
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(String.format("Ordinal: %d, Name: '%s', ToString: '%s'",
                    day.ordinal(), day.name(), day.toString()));
        }
        String value = "FRIDAY";
        try {
            System.out.println(String.format("Enum valueOf '%s' ? %b, ordinal: %d",
                value, Day.valueOf(value), Day.valueOf(value).ordinal()));
        } catch (IllegalArgumentException e) {
            /* if value not contains*/
            System.out.println(String.format("Value: '%s' Day not contains ...", value));
        }
        Optional<Day> optional = convertToOptional(value); 
        optional.ifPresent(val -> System.out.println(String.format("Day contains"
                + " value '%s', ordinal: '%d'", val.name(), val.ordinal())));
        System.out.println("Done ...");
    }
    
    private static Optional<Day> convertToOptional(String value) {
        Optional<Day> result;
        try {
            result = Optional.of(Day.valueOf(value));
        } catch (IllegalArgumentException e) {
            result = Optional.empty();
        }
        return result;
    }
}