package indi.zeroornull.kama.designpattern.abstractfactorypattern;


import java.util.Scanner;

interface Chair {
    void showInfo();
}

class ModernChair implements Chair {
    @Override
    public void showInfo() {
        System.out.println("Modern Chair");
    }
}

class ClassicalChair implements Chair {
    @Override
    public void showInfo() {
        System.out.println("Classical Chair");
    }
}

interface Sofa {
    void displayInfo();
}

class ModernSofa implements Sofa {
    @Override
    public void displayInfo() {
        System.out.println("Modern Sofa");
    }
}

class ClassicalSofa implements Sofa {
    @Override
    public void displayInfo() {
        System.out.println("Classical sofa");
    }
}

interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();
}

class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class ClassicalFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ClassicalChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicalSofa();
    }
}

public class AbstractFactoryPatternTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            //
            String furnitureType = scanner.next();
            
            FurnitureFactory factory = null;
            
            if (furnitureType.equals("modern")) {
                factory = new ModernFurnitureFactory();
            }else if (furnitureType.equals("classical")){
                factory = new ClassicalFurnitureFactory();
            }
            
            Chair chair = factory.createChair();
            Sofa sofa = factory.createSofa();
            
            chair.showInfo();
            sofa.displayInfo();
        }
    }

}
