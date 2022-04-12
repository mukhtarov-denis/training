package by.epam.training.classes.entity;

public class Cat {
    private String name;
    private static String anymalType;
    private int age;
    public static final boolean mustache = true;
    public static final Cat friend = new Cat("Lily");
    
    static {
        /*exec once */
        System.out.println("FIRST. set anymalType");
        anymalType = "cat";
    }
    
    {
        /* exec when create new Cat*/
        System.out.println("SECOND. set default age");
        age = 1;
    }
    
    public Cat(String name) {
        System.out.println("Call CONSTRUCTOR");
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAnymalType() {
        return anymalType;
    }
    
    public static void setAnymalType(String anymalType) {
        Cat.anymalType = anymalType;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public static void say() {
        System.out.println("MEOW");
    }
}