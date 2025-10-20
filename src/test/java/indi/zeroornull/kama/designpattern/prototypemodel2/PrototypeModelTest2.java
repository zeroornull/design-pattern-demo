package indi.zeroornull.kama.designpattern.prototypemodel2;

import indi.zeroornull.kama.designpattern.prototypemodel.ConcretePrototype;
import indi.zeroornull.kama.designpattern.prototypemodel.Prototype;

public class PrototypeModelTest2 {
    public static void main(String[] args) {
        Prototype original = new ConcretePrototype("Original Data");

        Prototype clone = original.clone();

        System.out.println("Clone Data: " + ((ConcretePrototype) clone).getData());
    }
}
