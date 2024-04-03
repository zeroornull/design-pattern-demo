package indi.zeroornull.pattern.composite.before;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
public class BoxTest {
    public static void main(String[] args) {
        Box bigBox = constructBigBox();
        double totalSum = calculatePrice(bigBox);
        log.info("totalSum: {}", totalSum);

    }

    private static Box constructBigBox() {
        Box box1 = new Box();
        box1.setBoxes(Collections.emptyList());
        box1.setProducts(Arrays.asList(new Product("iphone", 5000), new Product("篮球鞋", 4000)));

        Box box2 = new Box();
        box2.setBoxes(Collections.emptyList());
        box2.setProducts(Arrays.asList(new Product("铅笔", 400), new Product("橡皮", 300)));

        List<Box> subBoxes = Arrays.asList(box1, box2);

        Box bigBox = new Box();
        bigBox.setBoxes(subBoxes);
        bigBox.setProducts(Arrays.asList(new Product("笔记本电脑", 10000), new Product("鼠标垫", 300)));
        return bigBox;
    }

    private static double calculatePrice(Box bigBox) {
        double totalSum = 0;
        for (Product product : bigBox.getProducts()) {
            totalSum += product.getPrice();
        }

        for (Box subBox : bigBox.getBoxes()) {
            totalSum += calculatePrice(subBox);
        }

        return totalSum;
    }
}
