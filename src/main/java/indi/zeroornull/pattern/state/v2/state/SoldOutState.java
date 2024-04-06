package indi.zeroornull.pattern.state.v2.state;

import indi.zeroornull.pattern.state.v2.VendingMachine;

public class SoldOutState implements VendingState{
    
    private final VendingMachine vendingMachine;
    
    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("UNSUPPORTED OPERATION：商品已售罄");
    }

    @Override
    public void selectGoods() {
        System.out.println("UNSUPPORTED OPERATION：商品已售罄");
    }

    @Override
    public void dispense() {
        System.out.println("UNSUPPORTED OPERATION：商品已售罄");
    }
}
