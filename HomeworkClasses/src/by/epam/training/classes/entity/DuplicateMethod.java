package by.epam.training.classes.entity;

public class DuplicateMethod {
    
    /* compile error, duplicate methods
    public double returnType() {
        return 0.0;
    }
    
    public float returnType() {
        return 0.0;
    }
    */
    
    /* compile error , duplicate methods
    public void throwMethod() throws IOException {
        throw new IOException();
    }
    
    public void throwMethod() throws FileNotFoundException {
        throw new FileNotFoundException ();
    }
    */
}