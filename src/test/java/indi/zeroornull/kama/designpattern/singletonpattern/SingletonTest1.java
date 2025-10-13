package indi.zeroornull.kama.designpattern.singletonpattern;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SingletonTest1 {

    public static void main(String[] args) {
        ShoppingCartManager cart = ShoppingCartManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String itemName = scanner.next();
            int quantity = scanner.nextInt();
            // 获取购物车实例并且添加商品
            cart.addToCart(itemName, quantity);
        }
        
        cart.viewCart();
        
    }

}

class ShoppingCartManager {

    // 饿汉模式实现单例
    private static final ShoppingCartManager instance = new ShoppingCartManager();

    // 购物车存储商品和数量映射
    private Map<String, Integer> cart;


    private ShoppingCartManager() {
        cart = new LinkedHashMap<>();
    }

    // 获取购物车实例
    public static  ShoppingCartManager getInstance() {
        return instance;
    }

    // 添加商品到购物车
    public void addToCart(String itemName, int quantity) {
        cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
    }

    // 查看购物车
    public void viewCart() {
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}