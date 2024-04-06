package indi.zeroornull.pattern.state.v3.state;

import indi.zeroornull.pattern.state.v3.VendingMachine;

public class SoldOutState implements VendingState{
    
    private static final SoldOutState instance = new SoldOutState();
    
    public static SoldOutState instance() {
        return instance;
    }
    
    private SoldOutState() {
    }
    
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("UNSUPPORTED OPERATION：商品已售罄");
    }

    @Override
    public void selectGoods(VendingMachine machine) {
        System.out.println("UNSUPPORTED OPERATION：商品已售罄");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("UNSUPPORTED OPERATION：商品已售罄");
    }
}
