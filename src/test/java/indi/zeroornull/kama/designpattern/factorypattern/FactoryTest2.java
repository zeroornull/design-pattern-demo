package indi.zeroornull.kama.designpattern.factorypattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Block {
    void produce();
}

class CircleBlock implements Block {

    @Override
    public void produce() {
        System.out.println("Circle Block");
    }
}

class SquareBlock implements Block {

    @Override
    public void produce() {
        System.out.println("Square Block");
    }
}

interface BlockFactory {
    Block createBlock();
}

// 具体圆形积木工厂实现
class CircleBlockFactory implements BlockFactory {
    @Override
    public Block createBlock() {
        return new CircleBlock();
    }
}

// 具体方形积木工厂实现
class SquareBlockFactory implements BlockFactory {
    @Override
    public Block createBlock() {
        return new SquareBlock();
    }
}

class BlockFactorySystem {
    private List<Block> blocks = new ArrayList<>();

    public void produceBlocks(BlockFactory factory, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Block block = factory.createBlock();
            blocks.add(block);
            block.produce();
        }
    }

    public List<Block> getBlocks() {
        return blocks;
    }
}

public class FactoryTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //
        BlockFactorySystem factorySystem = new BlockFactorySystem();

        //
        int productionCount = scanner.nextInt();
        scanner.nextLine();

        //
        for (int i = 0; i < productionCount; i++) {
            String[] productionInfo = scanner.nextLine().split(" ");
            String blockType = productionInfo[0];
            int quantity = Integer.parseInt(productionInfo[1]);

            if (blockType.equals("Circle")) {
                factorySystem.produceBlocks(new CircleBlockFactory(), quantity);
            } else if (blockType.equals("Square")) {
                factorySystem.produceBlocks(new SquareBlockFactory(), quantity);
            } else {
                System.out.println("Unknown block type");
            }
        }
    }
}
