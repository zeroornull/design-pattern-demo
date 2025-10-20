package indi.zeroornull.kama.designpattern.builderpattern;

class Product{
    private String part1;
    private String part2;
    
    public void setPart1(String part1) {
        this.part1 = part1;
    }
    
    public void setPart2(String part2) {
        this.part2 = part2;
    }
 
    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                '}';
    }
}

interface Builder{
    void buildPart1(String part1);
    void buildPart2(String part2);
    Product getResult();
}

class ConcreteBuilder implements Builder{
    private Product product = new Product();

    @Override
    public void buildPart1(String part1) {
        product.setPart1(part1);
    }

    @Override
    public void buildPart2(String part2) {
        product.setPart2(part2);
    }
    
    @Override
    public Product getResult() {
        return product;
    }
}

class Director{
    private Builder builder;
    
    public Director(Builder builder){
        this.builder = builder;
    }
    
    public void construct(){
        builder.buildPart1("part1");
        builder.buildPart2("part2");
    }
}

public class BuilderPatternTest1 {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        
        Director director = new Director(builder);
        
        director.construct();
        
        Product product = builder.getResult();

        System.out.println(product);
    }
}
