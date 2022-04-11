package by.epam.training.classes;

import by.epam.training.classes.entity.Cat;
import by.epam.training.classes.entity.Entity;
import by.epam.training.classes.entity.PassOperator;

public class ClassesApp {
    
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.doAction(5);
        entity.doAction(Integer.valueOf(5));
        //entity.doAction(null); //compile error, because exist doAction(Integer), doAction(Boolean)
        entity.doAction(new Boolean(true));
        entity.doAction(new Boolean(null));
        //entity.doAction(new Integer(null));   // runtime error, NumberFormatException
        entity.doAction(new Float(5.0));
        entity.doAction(new Double(5.0));
        entity.doAction(5L);
        //entity.doAction(null);   //compile error, because exist doAction(Float), doAction(Integer) etc...
        entity.doAction("a", "b");
        entity.doAction(1, 3, 5, 6);
        PassOperator operator = new PassOperator();
        operator.passedByValue(5, (char) 5);
        Cat cat = new Cat("Kitty");
        System.out.println("First, name: " + cat.getName());
        operator.changeName(cat);
        System.out.println("Now, name: " + cat.getName());
        
        
        
        System.out.println("Done ...");
    }
}