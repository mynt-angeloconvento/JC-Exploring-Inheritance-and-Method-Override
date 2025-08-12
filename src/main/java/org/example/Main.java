package org.example;

public class Main {
    public static void main(String[] args) {
        // Car myCar = new Car();
        // myCar.honk();
        // myCar.display();
        // Bicycle bicycle = new Bicycle();
        // System.out.print("Bicycle says: ");
        // bicycle.ringBell();
        // System.out.print("Bicycle says: ");
        // bicycle.honk();

        // Circle myCircle = new Circle();
        // System.out.println(myCircle.display());
        // Rectangle myRectangle = new Rectangle();
        // System.out.println(myRectangle.display());
        // Dog myDog = new Dog();
        // myDog.breathe();
        // myDog.makeSound();

        // Editor myEditor = new Editor();
        // CodeEditor myCodeEditor = new CodeEditor();
        // Editor polyEditor = new CodeEditor();
        // System.out.println("--- Regular Editor ---");
        // myEditor.openFile();
        // System.out.println("\n--- Code Editor ---");
        // myCodeEditor.openFile();
        // System.out.println("\n--- Polymorphic Editor ---");
        // polyEditor.openFile();
        // GameCharacter regularCharacter = new GameCharacter();
        // ArmoredCharacter armoredCharacter = new ArmoredCharacter();
        // regularCharacter.takeDamage(100);
        // System.out.println("Regular character takes 100 damage.");
        // System.out.println("New health: " + (regularCharacter.getHealth()));
        // armoredCharacter.takeDamage(100);
        // System.out.println("Armored character takes 50 damage.");
        // System.out.println("New health: " + (armoredCharacter.getHealth()));

        CheckingAccount myChecking = new CheckingAccount(100.0);
        myChecking.deductMonthlyFee();
    }
}