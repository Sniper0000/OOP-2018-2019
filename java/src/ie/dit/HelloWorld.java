package ie.dit;//must be in the folder ie/dit
//we can have same name files in different packages

//public can be used outside the ie.dit package
public class HelloWorld
{
    //static method is a method that doesn't require
    //any instance of the class to be called
    public static void main(String[] args) {
        System.out.println("Hello world");    

        Animal misty = new Dog(); // Polymorphism
        //The TYPE is of the superclass, the instance is of a subclass

        //calling a method
        //setName is a private method to create a private field ?
        misty.setName("Misty");

        //calling  method and getting a return value
        System.out.println(misty.getName());  
        misty.speak();  

        misty = new Cat();
        misty.speak();

        Animal garfield = new Cat();
        garfield.setName("Garfield");

        misty = garfield;
        
        garfield.setName("Felix");

        System.out.println(misty.getName());

    }
}