package by.epam.traning.string;

public class Human {
    
    @Override
    public String toString() {
        return "Simple name class:" + getClass().getSimpleName()
                + ", super.toString" + super.toString();
    }
}