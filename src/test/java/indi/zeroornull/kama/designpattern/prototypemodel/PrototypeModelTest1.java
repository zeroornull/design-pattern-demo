package indi.zeroornull.kama.designpattern.prototypemodel;

public class PrototypeModelTest1 {
    public static void main(String[] args) {
        Prototype original = new ConcretePrototype("Original Data");

        Prototype clone = original.clone();

        System.out.println("Clone Data: " + ((ConcretePrototype) clone).getData());
    }
}
