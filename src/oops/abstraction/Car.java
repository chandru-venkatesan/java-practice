package oops.abstraction;

public class Car {
    static void main(String[] args) {
        System.out.println("Car Starting");

       Contract light = new RagavanLight();
        light.glow();
    }
}
