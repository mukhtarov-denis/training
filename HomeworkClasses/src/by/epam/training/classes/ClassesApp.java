package by.epam.training.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

import by.epam.training.classes.entity.Cat;
import by.epam.training.classes.entity.Dog;
import by.epam.training.classes.entity.Entity;
import by.epam.training.classes.entity.Parrot;
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
        Cat liptonCat = new Cat("Lipton");
        Cat.setAnymalType("newCatType");
        System.out.printf("Now, cat type is: %s\n", cat.getAnymalType());
        Cat.say();   // all cats say MEOW
        //Cat.mustache = false;       // The final field Cat.mustache cannot be assigned
        // impossible to change a reference to a public static final field of a reference type
        //Cat.friend = new Cat("Peter");  // The final field Cat.friend cannot be assigned
        System.out.printf("friend cat age is: %d\n", Cat.friend.getAge());
        // but it’s possible to change the value of a non-immutable object itself
        Cat.friend.setAge(10);
        System.out.printf("And now, friend cat age is: %d\n", Cat.friend.getAge());
        
        Dog dog = new Dog();
        // no-arg constructor is created implicitly if a class contains no constructor declarations
        for (Constructor<?> c : dog.getClass().getConstructors()) {
            System.out.printf("Constructor: %s, parameters: %d\n",
                    c.getName(), c.getParameterCount());
        }
        // no-arg constructor isn’t created implicitly if a class contains constructor declarations
        for (Constructor<?> c : cat.getClass().getConstructors()) {
            System.out.printf("Constructor: %s, parameters: %d\n", c.getName(), c.getParameterCount());
            for (Parameter param : c.getParameters()) {
                System.out.printf("\tparam: %s, Other: %s\n", param.getName(), param.getType());
            }
        }
        // no-arg constructor of subclass implicitly calls the no-arg constructor of the superclass
        System.out.println("*********** Now, will create Parrot *****************");
        Parrot parrot = new Parrot();
        
        
        System.out.println("Done ...");
    }
}