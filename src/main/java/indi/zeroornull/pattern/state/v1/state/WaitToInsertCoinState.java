package indi.zeroornull.pattern.state.v1.state;

import indi.zeroornull.pattern.state.v1.VendingMachine;

public class WaitToInsertCoinState implements VendingState{
    
    private final VendingMachine vendingMachine;
    
    public WaitToInsertCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void insertCoin() {
        this.vendingMachine.changeState(new WaitToSelectGoodsState(vendingMachine));
        System.out.println("投币成功，请选择商品");
    }

    @Override
    public void selectGoods() {
        System.out.println("UNSUPPORTED OPERATION：请先投币");
    }

    @Override
    public void dispense() {
        System.out.println("UNSUPPORTED OPERATION：请先投币");
    }
}
