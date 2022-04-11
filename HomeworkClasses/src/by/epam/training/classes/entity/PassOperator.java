package by.epam.training.classes.entity;

public class PassOperator {
    public void passedByValue(int intValue, char charValue) {
        String message = String.format("Values '%s' == '%s' ? '%b'", 
                intValue, charValue, intValue == charValue);
        System.out.println(message);
    }
    
    public void changeName(Cat cat) {
        Cat otherCat = cat;
        otherCat.setName("Other Kitty");
        System.out.println("Name other cat: " + otherCat.getName());
    }
}