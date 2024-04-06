package indi.zeroornull.pattern.state.v1.state;

import indi.zeroornull.pattern.state.v1.VendingMachine;

// 等待选择商品状态
public class WaitToSelectGoodsState implements VendingState{
    
    private final VendingMachine vendingMachine;
    
    public WaitToSelectGoodsState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("UNSUPPORTED OPERATION：已投币，请选择商品");
    }

    @Override
    public void selectGoods() {
        this.vendingMachine.changeState(new WaitToSelectGoodsState(vendingMachine));
        System.out.println("选中XX商品");
    }

    @Override
    public void dispense() {
        System.out.println("UNSUPPORTED OPERATION：未选择商品，无法出货");
    }
}
