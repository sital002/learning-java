/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;






interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

public class App {


    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeSound();
    }
}
