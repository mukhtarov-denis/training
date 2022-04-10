package by.epam.training.enums;

public enum Day {
    MONDAY,
    THUSDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    @Override
    public String toString() {
        return name().replace("_", "").toLowerCase();
    }
}