package by.epam.training.classes.entity;

public class Entity {
    
    public void doAction(int value) {
        System.out.println("Call doAction(int), with param: " + value);
    }
    
    public void doAction(Integer value) {
        System.out.println("Call doAction(INTEGER), with param: " + value);
    }
    
    public void doAction(Boolean value) {
        System.out.println("Call doAction(BOOLEAN), with param:  " + value);
    }
    
    public void doAction(float value) {
        System.out.println("Call doAction(float), with param: " + value);
    }
    
    public void doAction(double value) {
        System.out.println("Call doAction(double), with param: " + value);
    }
    
    public void doAction(Float value) {
        System.out.println("Call doAction(FLOAT), with param: " + value);
    }
    
    public void doAction(Double value) {
        System.out.println("Call doAction(DOUBLE), with param: " + value);
    }
    
    public void doAction(String a) {
        String value = String.format("Call doAction(String), with param: '%s'", a);
        System.out.println(value);
    }
    
    public void doAction(String a, String b) {
        String value = String.format("Call doAction(String, String), with param: '%s', '%s'", a, b);
        System.out.println(value);
    }
    
    public void doAction(String a, String b, String c) {
        String value = String.format("Call doAction(String, String, String), with param: '%s', '%s', '%s'", a);
        System.out.println(value);
    }
    
    public void doAction(int... array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(";");
        }
        System.out.println("Array: [" + sb.toString() + "]");
    }
}