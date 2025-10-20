package indi.zeroornull.kama.designpattern.builderpattern;

import java.util.Scanner;

class Bike{
    private String frame;
    private String tires;

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return frame + " " + tires;
    }
}

interface BikeBuilder{
    void buildFrame();
    void buildTires();
    Bike getResult();
}

class MountainBikeBuilder  implements BikeBuilder{
    private Bike bike ;

    public MountainBikeBuilder() {
        this.bike = new Bike();
    }

    @Override
    public void buildFrame() {
        bike.setFrame("Aluminum Frame");
    }

    @Override
    public void buildTires() {
        bike.setTires("Knobby Tires");
    }

    @Override
    public Bike getResult() {
        return bike;
    }
}

class RoadBikeBuilder implements BikeBuilder{
    private Bike bike ;
    @Override
    public void buildFrame() {
        bike.setFrame("Carbon Frame");
    }

    public RoadBikeBuilder() {
        this.bike = new Bike();
    }

    @Override
    public void buildTires() {
        bike.setTires("Slim Tires");
    }

    @Override
    public Bike getResult() {
        return bike;
    }
}

class BikeDirector{
    public Bike construct(BikeBuilder builder){
        builder.buildFrame();
        builder.buildTires();
        return builder.getResult();
    }
}

public class BuilderPatternTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 订单数量
        scanner.nextLine();

        BikeDirector director = new BikeDirector();
        for (int i = 0; i < N; i++) {
            String bikeType = scanner.nextLine();

            BikeBuilder builder;
            // 根据输入类别，创建不同类型的具体建造者
            if (bikeType.equals("mountain")) {
                builder = new MountainBikeBuilder();
            } else {
                builder = new RoadBikeBuilder();
            }
            // Director负责指导生产产品
            Bike bike = director.construct(builder);
            System.out.println(bike);
        }
    }
}
