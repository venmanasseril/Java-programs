package wrapperexamples;

//Parent class
class Animal {
 String name;

 public void eat() {
     System.out.println(name + " is eating...");
 }

 public void sleep() {
     System.out.println(name + " is sleeping...");
 }
}

//Child - Single Level Inheritance
class Dog extends Animal {

 public void bark() {
     System.out.println(name + " is barking: Woof! Woof!");
 }

 // Method overriding
 
 public void eat() {
     System.out.println(name + " is eating bones...");
 }
}

public class assignment4 {
 public static void main(String[] args) {

     // Creating object of child class
     Dog myDog = new Dog();

     // Accessing inherited properties and methods
     myDog.name = "Browny";          // Inherited from Animal

     myDog.eat();                   // Overridden method from Dog
     myDog.bark();                  // Method from Dog class
     myDog.sleep();                 // Inherited method from Animal

     System.out.println("\nNote: Dog 'is-a' Animal → Inheritance in action!");
 }
}
